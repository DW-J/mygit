# -*- coding:utf-8 -*-
from cx_Oracle import connect

# 원두를 검색해서
# 그 원두를 사용하는 커피의 종류 갯수, 평균가를 출력

con = connect("asdf/1@localhost:1521/xe")

b = input("원두 검색 : ")

sql = "select count(*), round(avg(c_price), 2) "
sql += "from jul18_coffee "
sql += "where c_bean='%s'" % b

cur = con.cursor()
cur.execute(sql)

for c, a in cur:
    print(c, a)


con.close()





