import pyautogui
import pydirectinput
import keyboard
import mouse
import ctypes

from time import sleep

juice = 33

PROCESS_PER_MONITOR_DPI_AWARE = 2
ctypes.windll.shcore.SetProcessDpiAwareness(PROCESS_PER_MONITOR_DPI_AWARE)

while True:
    
    if keyboard.is_pressed('F6') is True:
        for i in range(25):
            keyboard.send('alt',do_release=False)
            mouse.wait(button='right')
            sleep(0.1)
            pydirectinput.click(980,570)
            sleep(0.1)
            keyboard.send('alt',do_release=True)
            sleep(3)
    
    if keyboard.is_pressed('F7') is True:
        for i in range(juice):
            keyboard.send('alt',do_release=False)
            mouse.wait(button='right')
            sleep(0.1)
            pydirectinput.click(980,570)
            sleep(0.1)
            keyboard.send('alt',do_release=True)
            pydirectinput.click(1210,320)
            sleep(0.2)
            
    sleep(1)
