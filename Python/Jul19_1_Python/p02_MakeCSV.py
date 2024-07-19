# -*- coding:utf-8 -*-
from cx_Oracle import connect

# csv파일로 만들어주세요! (번호,시간,온도,최고기온,날씨,풍향 의 형태로)

# C:\Users\cloud\Desktop\Test\data
con = connect("asdf/1@localhost:1521/xe")

file = open("C:/Users/cloud/Desktop/Test/data/weather.csv", "a", encoding="UTF-8")

sql = "select wt_no, wt_hour, wt_temp, wt_tmx, wt_wfKor, wt_wdKor from jul19_weather"

cur = con.cursor()
cur.execute(sql)

for no, hour, temp, tmx, wfKor, wdKor in cur:
    print(no, hour, temp, tmx, wfKor, wdKor)
    file.write(f"{no},{hour},{temp},{tmx},{wfKor},{wdKor}")
    
file.close()

con.close()

print("성공 !")
























