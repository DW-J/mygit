# -*- coding:utf-8 -*-
from urllib.parse import quote
from xml.etree.ElementTree import fromstring
from http.client import HTTPSConnection

# https://openapi.naver.com/v1/search/shop.xml       
# WlrEUysFgKnIyS0MxN3j
# TvVA6ptMtb

# 상품명 : 입력
# xml 파싱해서
# 문서의 상품이름 ( title ) / 
# 최저가( lprice ) / 
# 브랜드( brand ) / 
# 대분류 카테고리 ( category1 ) 정보를 출력

q = input("상품명 : ")

# URLEncoding해서 주소로 점겨줄 것
q = quote(q)

print(q)

def cut(t):
    t = t.replace("<b>", "").replace("</b>", "")
    return t

hc = HTTPSConnection("openapi.naver.com")
# request 함수의 body
#    : 요청할 때 데이터를 보내야 하는 경우에 body에 담아서 보냄

h = {
        "X-Naver-Client-Id" : "WlrEUysFgKnIyS0MxN3j",
        "X-Naver-Client-Secret" : "TvVA6ptMtb"
    }

hc.request("GET", "/v1/search/shop.xml?query=" + q, headers=h)

resBody = hc.getresponse().read()
# print(resBody.decode())

# XML Parsing
# DOM객체 여러개 찾기 : .getiterator("태그명") = 구형 / .iter("태그명") = 신형 / 둘다 같은 기능
# DOM객체 하나 찾기 : .find("태그명")

for p in fromstring(resBody).iter("item"):
    print(cut(p.find("title").text))
    print(p.find("lprice").text)
    print(p.find("brand").text)
    print(p.find("category1").text)















