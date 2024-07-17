# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring

# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168067000

# HTTP 통신
hc = HTTPConnection("www.kma.go.kr")    # 서버주소
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=1168067000")   # 요청

res = hc.getresponse()  # 응답
resBody = res.read()    # 응답 내용
# print(resBody)

# print(resBody.decode()) # 출력(한글처리)
####################################################3
# XML Parsing
# DOM객체 여러개 찾기 : .getiterator("태그명") = 구형 / .iter("태그명") = 신형 / 둘다 같은 기능
# DOM객체 하나 찾기 : .find("태그명")

# kmaWeather = fromstring(resBody)
# print(kmaWeather)
# weathers = kmaWeather.iter("data")
# print(weathers)
# for w in weathers:
    # print(w)
    # print("---------")

# getiterator대신 iter도 상관없음    
for w in fromstring(resBody).getiterator("data"):   # data 불러오기
    print(w.find("hour").text)
    print(w.find("temp").text)
    print(w.find("wfKor").text)
    print("-------------")


