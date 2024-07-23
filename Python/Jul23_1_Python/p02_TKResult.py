# -*- coding:utf-8 -*-

# Python의 시각화를 위한 library - matplotlib
# cmd => pip install matplotlib

import matplotlib.font_manager as fm
import matplotlib.pyplot as plt

name = []
count = []

with open("C:/Users/cloud/Desktop/Test/data/tkResult.csv", "r", encoding="UTF-8") as f:
    for line in f.readlines():
        # print(line)
        line = line.replace("\n", "").split(",")
        name.append(line[0])
        count.append(int(line[1]))

print(name, count)

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontname = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontname)

# 막대그래프 - 절대적인 값 비교
c = ['#00CCFF', '#B2CCFF', '#FFA7A7']
# plt.bar(name, count, width=0.4, color=c)
# plt.title('Three Kingdoms')
# plt.xlabel('name')
# plt.ylabel('count')
# plt.xticks(range(len(name)), name)      # 눈금 설정
# plt.show()

# 파이차트 (pie)
plt.pie(count, labels=name, colors=c, shadow=True, explode=(0.1, 0.1, 0.1))
# explode : 각 항목이 원점에서 튀어나오는 정도
plt.title('Three Kingdoms')
plt.show()
