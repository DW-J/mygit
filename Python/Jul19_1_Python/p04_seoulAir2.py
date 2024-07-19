# -*- coding:utf-8 -*-
from cx_Oracle import connect

# DB에 있는 미세먼지 데이터 => csv에 저장(데이터 콤마로 구분)
con = connect("asdf/1@localhost:1521/xe")

sql = "select * from jul19_seoul_airs"

cur = con.cursor()
cur.execute(sql)

file = open("C:/Users/cloud/Desktop/Test/data/seoulAir.csv", "a", encoding="UTF-8")

for n, M, pm10, pm25 in cur:
    print(n, M, pm10, pm25)
    file.write(f"{n},{M},{pm10},{pm25}\n")

file.close()
con.close()
print("성공 !")


