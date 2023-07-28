from PIL import Image,ImageDraw,ImageColor
import requests

bg = Image.open(requests.get('https://i.imgur.com/Qk99lKl.jpeg', stream=True).raw)
#hg = Image.open(requests.get('https://i.imgur.com/o0Vmik2.png', stream=True).raw)

width, height = bg.size
print(width)
#bg = bg.resize((800,600))
#hg = hg.resize((800,150))

#draw = ImageDraw.Draw(bg, "RGBA")
#draw.rectangle(((0, 0), (800, 150)), fill=(200, 100, 0, 127))
a = "#2c4e5d"
y = '#C9A0DC'
z = y[2:7]
x = ImageColor.getcolor(y, "RGB")
#print(y[1:2])
#print(x)
a = a.upper()
print(a)

#avatar = avatar.resize((120,120))
#bg = Image.open('C:\\Users\\SHUBHOJIT\\Desktop\\db\\main_bg.png')

#mask = Image.new("L", avatar.size, 0)
#draw = ImageDraw.Draw(mask)
#draw.ellipse((0, 0, 120, 120), fill=255)

#bg.paste(avatar, (50, 50), mask)

#bg.show()


