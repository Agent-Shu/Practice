from machine import Pin, I2C, SPI, UART
from pico_i2c_lcd import I2cLcd
from SSD1306 import SSD1306_I2C
from urtc import DS3231
import time
import uos
import sdcard
import uasyncio
import _thread

button = Pin(14,Pin.IN, Pin.PULL_DOWN)
button_power=Pin(15,Pin.OUT)
button_power.value(1)

i2c=I2C(0,sda=Pin(0),scl=Pin(1),freq=100000)
arduino=I2C(1,scl=Pin(3),sda=Pin(2),freq=100000)
addr=arduino.scan()[0]

lcd=I2cLcd(i2c,0x27,2,16)
oled=SSD1306_I2C(128,64,i2c)
rtc=DS3231(i2c)
uart = UART(1,115200)

cs = machine.Pin(13, machine.Pin.OUT)
spi = machine.SPI(1,baudrate=1000000,polarity=0,phase=0,bits=8,firstbit=machine.SPI.MSB,sck=machine.Pin(10),mosi=machine.Pin(11),miso=machine.Pin(12))
sd=sdcard.SDCard(spi,cs)
vfs = uos.VfsFat(sd)
uos.mount(vfs, "/sd")

SSID = "D-Link_DIR-615"
PASSWORD = ""
TOKEN = ""
DEVICE_LABEL="pipico"
#VARIABLE_LABEL="Minute Data"
USER_AGENT=""

total_power=0.00
hour_power=0.00
minute_power=0.00

temp_minute=[]
temp_hour=[]

wifi_status=0
lcd_mode=0

lcd.backlight_off()

def wifi_is_connected():
    res=""
    send = "AT+CWJAP?"
    uart.write(send+'\r\n')
    time.sleep(4)
    res=wifi_is_connected_response(send)
    if res=="No AP":
        print("WiFi Status:"+res)
    return res

def wifi_is_connected_response(command):
    recv=bytes()
    while uart.any()>0:
        recv+=uart.read(1)
    res=recv.decode('utf-8')
    erase_len=len(command)+3
    res = res[erase_len:]
    res = res[:5]
    return res

def uartSerialRxMonitor(command):
    recv=bytes()
    while uart.any()>0:
        recv+=uart.read(1)
    res=recv.decode('utf-8')
    erase_len=len(command)+5
    res = res[erase_len:]
    return res

def wifi_connect(ssid,password):
    send = "AT+CWJAP=\""+SSID+"\",\""+PASSWORD+"\""
    uart.write(send+'\r\n')
    time.sleep(5)

def sendtcp(value,VARIABLE_LABEL):
    
    send='AT+CIPSTART="TCP","industrial.api.ubidots.com",9012'
    uart.write(send+'\r\n')
    time.sleep(2)

    payload= DEVICE_LABEL+"=>"+VARIABLE_LABEL+":"+str(value)
    payload_length= len(payload)
    
    req_length = 11
    req_length+= len(USER_AGENT+TOKEN+str(payload_length)+payload)
    
    send="AT+CIPSEND="+str(req_length)
    uart.write(send+'\r\n')
    time.sleep(0.6)
    
    send=USER_AGENT+"|POST|"+TOKEN+"|"+payload+"|end"
    #print("request sent: "+USER_AGENT+"|POST|"+TOKEN+"|"+payload+"|end")      #Debug
    uart.write(send+'\r\n')
    time.sleep(0.6)
    
    print("Data sent: "+payload)    

def save_total_pow(total_power):                                               #TO SAVE TOTAL_POWER DATA TO TOTAL_POWER FILE
    (year,month,date,day,hour,minute,second,p1)=rtc.datetime()

    with open("/sd/Total_Power.txt", "w") as file:
        file.write(str(total_power)+"\r\n")
        file.close()

def save_hour_pow(hour_power):                                                 #TO SAVE HOUR_POWER DATA TO HOUR_POWER FILE
    (year,month,date,day,hour,minute,second,p1)=rtc.datetime()

    with open("/sd/Hour_Power.txt", "a") as file:
        file.write(str(date)+"."+str(month)+"."+str(year)+" "+str(hour)+":00"+":00"+" "+str(hour_power)+"\r\n")
        file.close()

def save_minute_pow(minute_power):                                             #TO SAVE MINUTE_POWER DATA TO MINUTE_POWER FILE
    (year,month,date,day,hour,minute,second,p1)=rtc.datetime()

    with open("/sd/Minute_Power.txt", "a") as file:
        file.write(str(date)+"."+str(month)+"."+str(year)+" "+str(hour)+":"+str(minute)+":00"+" "+str(minute_power)+"\r\n")
        file.close()
 
def calc_minute(temp_min):                                                     #TO CALCULATE MINUTE DATA
    global minute_power
    for i in range(0,len(temp_min)):
        minute_power = temp_min[i] + minute_power
        
    minute_power = minute_power / len(temp_min)
    save_minute_pow(minute_power)
    
def calc_hour(temp_hr):                                                        #TO CALCULATE HOUR DATA
    global hour_power
    for i in range(0,len(temp_hr)):
        hour_power = temp_hr[i] + hour_power
        
    hour_power = hour_power / len(temp_hr)
    save_hour_pow(hour_power)
    
     
async def read_arduino():                                                      #TO GET DATA FROM ARDUINO
    second_data=0.00
    a= arduino.readfrom(addr,5)
    b=(a[4]*100+a[3]*10+a[2]+((a[1]*10+a[0])/100))
    second_data = second_data + float(b)
    return second_data    
    
def read_file():                                                               #TO READ BACK TOTAL POWER AFTER POWER CUTS
    global total_power
    with open("/sd/Total_Power.txt", "r") as file:
        data = file.read()
        total_power = float(data)
        #print(data)
        file.close()
        
async def button1():
    global lcd_mode
    while True:
        if button.value():
            lcd.backlight_on()
            if lcd_mode == 2:
                lcd_mode=0
                time.sleep(0.5)
                
            elif lcd_mode == 1:
                lcd_mode=2
                time.sleep(0.5)
                
            elif lcd_mode == 0:
                lcd_mode=1
                time.sleep(0.5)
                
        lcd.backlight_off()      
        await uasyncio.sleep(1)

async def lcd1():
    global minute_power,hour_power,total_power,lcd_mode,button
    while True:
        if lcd_mode == 0:
            lcd.clear()
            lcd.move_to(0,0)
            lcd.putstr(str(round(minute_power,2)))
            lcd.move_to(13,0)
            lcd.putstr(str('W/m'))
            
        if lcd_mode == 1:
            lcd.clear()
            lcd.move_to(0,0)
            lcd.putstr(str(round(hour_power,2)))
            lcd.move_to(13,0)
            lcd.putstr(str('W/h'))
            
        if lcd_mode == 2:
            lcd.clear()
            lcd.move_to(0,0)
            lcd.putstr(str(round(total_power,2)))
            lcd.move_to(13,0)
            lcd.putstr(str('W/h'))
            
        await uasyncio.sleep(1)
        
async def oled1():
    global wifi_status
    
    while True:
        (year,month,date,day,hour,minute,second,p1)=rtc.datetime()
        temp = 0
        
        if hour>=13:
            hour = hour-12
            temp = 1            
        else:
            temp = 0
        
        oled.fill(0)
        oled.text("Time:",0,57)
        oled.text(str(hour),38,57)
        oled.text(':'+str(minute),55,57)
        oled.text(':'+str(second),80,57)
        
        if temp==0:
            oled.text(str('am'),105,57)
        if temp==1:
            oled.text(str('pm'),105,57)
        
        oled.show()
        await uasyncio.sleep(1)

async def total_pow():
    while True:
        (year,month,date,day,hour,minute,second,p1)=rtc.datetime()
        
        if minute == 59 and second >= 58:
            sendtcp(total_power,f'Total Power')
        await uasyncio.sleep(1)

async def main():
    
    global temp_minute, temp_hour, minute_power, hour_power, total_power
    
    read_file()        
    wifi_connect(SSID,PASSWORD)
    
    uasyncio.create_task(lcd1())
    uasyncio.create_task(oled1())
    uasyncio.create_task(total_pow())
    uasyncio.create_task(button1())
    
    while True:
        (year,month,date,day,hour,minute,second,p1)=rtc.datetime()
        x = await read_arduino()
        
        temp_minute.append(x)
        
        if second > 58:
            calc_minute(temp_minute)
            temp_hour.append(minute_power)
            sendtcp(minute_power,f'Minute Data')
            temp_minute.clear()
            
        elif minute == 59 and second >= 54 and second <=56:
            calc_hour(temp_hour)
            sendtcp(hour_power,f'Hour Data')
            total_power = total_power + hour_power
            save_total_pow(total_power)
            temp_hour.clear()
            time.sleep(1)
        
        await uasyncio.sleep(1)
    
    
uasyncio.run(main())