from machine import Pin, I2C
from pico_i2c_lcd import I2cLcd
from time import sleep,sleep_ms
from SSD1306 import SSD1306_I2C

i2c=I2C(1,sda=Pin(2),scl=Pin(3),freq=400000) #LCD I2C Route
i2d=I2C(0,sda=Pin(8),scl=Pin(9),freq=400000) #OLED I2C Route

vcc6=Pin(10, Pin.OUT)
vcc2=Pin(0, Pin.OUT)
vcc2.high()
vcc6.high()

print(hex(i2c.scan()[0]))
#print(hex(i2d.scan()[0]))

lcd=I2cLcd(i2c,0x27,2,16)
#oled=SSD1306_I2C(128,64,i2d)

lcd.custom_char(0,bytearray([0x03,0x04,0x0A,0x10,0x12,0x0B,0x04,0x03]))
lcd.custom_char(1,bytearray([0x18,0x04,0x0A,0x01,0x09,0x1A,0x04,0x18]))
    
    
while True:
    lcd.clear()
    #oled.fill(0)
    lcd.move_to(5,0)
    lcd.putstr("Hello")
    #oled.text("Hello",5,5)
    #oled.show()
    sleep(0.3)
    
    lcd.clear()
    #oled.fill(0)
    lcd.move_to(5,1)
    lcd.putstr("World")
    lcd.move_to(11,1)
    lcd.putchar(chr(0))
    lcd.move_to(12,1)
    lcd.putchar(chr(1))
    #oled.text("World",85,52)
    #oled.show()
    sleep(0.3)

