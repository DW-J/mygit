# -*- coding:utf-8 -*-

# 방금 만든 csv파일을 불러와서
#    연월에 맞춰서 => 유임승차, 무임승차, 유임하차, 무임하차
#    => 선 그래프 그리기!

import matplotlib.pyplot as plt
import matplotlib.font_manager as fm

#########################################
fontFile = "C:/Windows/Fonts/malgun.ttf"
fontname = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontname)

prnDict, frnDict, panDict, fanDict = {}, {}, {}, {}

with open("C:/Users/cloud/Desktop/Test/data/subwayPayFree.csv", "r", encoding="UTF-8") as f:
    for line in f.readlines():
        # print(line)
        line = line.replace("\n", "").split(",")
        # print(line)
        when = line[0]
        prn = float(line[3]); frn = float(line[4]) 
        pan = float(line[5]); fan = float(line[6])
        
        if when in prnDict:
            prnDict[when] += prn
            frnDict[when] += frn
            panDict[when] += pan
            fanDict[when] += fan
        else:
            prnDict[when] = prn
            frnDict[when] = frn
            panDict[when] = pan
            fanDict[when] = fan
print(when)
print(prnDict)            
print(frnDict)            
print(panDict)            
print(fanDict)            
        
whens, prns, frns, pans, fans = [], [], [], [], []     
for k, v in prnDict.items():
    whens.append(k)
    prns.append(v)
    frns.append(frnDict[k]) # key에 해당하는 value       
    pans.append(panDict[k])
    fans.append(fanDict[k])
print("----------------------------")
print(whens)
print(prns)
print(frns)
print(pans)
print(fans)


plt.plot(whens, prns, color="#FFA7A7")
plt.plot(whens, frns, color="#B2CCFF")
plt.plot(whens, pans, color="#FFB2D9")
plt.plot(whens, fans, color="#D941C5")
plt.legend(["유임승차", "무임승차", "유임하차", "무임하차"])
plt.title("월별 지하철 유.무임 승차 정보")
plt.show()












