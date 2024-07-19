# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from cx_Oracle import connect
from json import loads

# http://openAPI.seoul.go.kr:8088
# /4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/

# 구 이름(MSRSTE_NM), 미세먼지(PM10), 초미세먼지(PM25) 의 정보를 DB에 담아주세요!
#    (여러 기간에 걸쳐 이 데이터를 모은다고 가정)

hc = HTTPConnection("openAPI.seoul.go.kr:8088")
u = "/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/"

hc.request("GET", u)

resBody = hc.getresponse().read()
# print(resBody.decode())
###################################################################

airData = loads(resBody)

# DB연결
con = connect("asdf/1@localhost:1521/xe")
cur = con.cursor()

for a in airData["RealtimeCityAir"]["row"]:
    # print(a["MSRSTE_NM"], a["PM10"], a["PM25"])
    sql = f"insert into jul19_seoul_airs values(jul19_seoul_airs_seq.nextval, "
    sql += f"'{a['MSRSTE_NM']}', {a['PM10']}, {a['PM25']})"
    cur.execute(sql)
    
con.commit()
con.close()
print("성공 !")




















