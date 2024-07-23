# -*- coding:utf-8 -*-
from cx_Oracle import connect

# Table 데이터 => 번호값 제외한 모든데이터 => csv파일 담는 작업

con = connect("asdf/1@localhost:1521/xe")

sql = "select * from search_location"
cur = con.cursor()
cur.execute(sql)

with open("C:/Users/cloud/Desktop/Test/data/Location.csv", "a", encoding="UTF-8") as f:
    for _, pn, ph, x, y in cur:
        f.write(f"{pn},{ph},{x},{y}\n")
    
con.close()
print("- 완 -")
















