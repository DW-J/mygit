# -*- coding:utf-8 -*-
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring

# 또상청 데이터
# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168052100
#    => 각 시간별 기온(temp)와 습도(reh)를 선 그래프로 표현
# 음수부호(마이너스) 제대로 안나올 때 처리
plt.rcParams['axes.unicode_minus'] = False 

hc = HTTPConnection("www.kma.go.kr")
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=1168052100")
resBody = hc.getresponse().read()

hours = []
temps = []
rehs = []

for w in fromstring(resBody).iter("data"):
    hours.append(w.find("hour").text + "시")
    temps.append(float(w.find("temp").text))
    rehs.append(float(w.find("reh").text))

# print(hours)    
# print(temps)    
# print(rehs)    

indexes = range(len(hours))

##################################################################
fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)
# plt.rcParams['axes.unicode_minus'] = False 

x1 = plt.subplot()
p1 = x1.plot(indexes, temps, 'r-o')
x1.axis([None, None, None, 38])
x1.set_xlabel("시간")
x1.set_ylabel("온도")

x2 = x1.twinx()
p2 = x2.plot(indexes, rehs, 'g:*')
x1.axis([None, None, 0, 100])
x2.set_ylabel("습도")

plt.title("날씨", loc="center")
x1.legend(p1 + p2, ["기온", "습도"])

plt.xticks(indexes, hours)

plt.show()




