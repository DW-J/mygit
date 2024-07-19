# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring
from cx_Oracle import connect

# 기상청 (주소값 구해서)
# 기상청 xml => DB에 적재
# 시간대 / 기온 / 최고기온 / 날씨(한글) / 바람의 방향(한글)

# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1171056100

hc = HTTPConnection("www.kma.go.kr")
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=1171056100")

res = hc.getresponse()
resBody = res.read()
# print(resBody.decode())

con = connect("asdf/1@localhost:1521/xe")
cur = con.cursor()
    
for w in fromstring(resBody).iter("data"):
    # print(w.find("hour").text)
    sql = "insert into jul19_weather values(jul19_weather_seq.nextval, "
    sql += "'%s', "% (w.find("hour").text)
    sql += "'%s', "% (w.find("temp").text)
    sql += "'%s', "% (w.find("tmx").text)
    sql += "'%s', "% (w.find("wfKor").text)
    sql += "'%s')"% (w.find("wdKor").text)
    cur.execute(sql)
    
con.commit()
con.close()
print("END !")











