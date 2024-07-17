# -*- coding:utf-8 -*-
from http.client import HTTPSConnection
from urllib.parse import quote
from json import loads

# abf07c1bc7cc9d38d6e1bc90881fc5e5
# https://dapi.kakao.com
# /v3/search/book
# query
# 책 이름 검색해서 책 제목( title ) - 작가 ( authors ) / 
# 할인가 ( sale_price ) / 도서 소개( contents ) 출력

q = quote(input("책 이름 검색 : "))
# print(q)

h = { "Authorization" : "KakaoAK abf07c1bc7cc9d38d6e1bc90881fc5e5" }

hc = HTTPSConnection("dapi.kakao.com")
hc.request("GET", "/v3/search/book?query=" + q, headers=h)
resBody = hc.getresponse().read()
# print(resBody.decode())
#########################################################################
kakoBook = loads(resBody)    # JS => Python
# print(type(kakoBook))
#########################################################################
books = kakoBook["documents"]
print(books)

for b in books:
    try:
        print(b["title"], "-", b["authors"][0])
        # print(b["title"], "-", ", ".join(b["authors"])) 
                                    # .join() : list를 문자열로
                                    # 구분자.join() : list의 요소들을 지정한 구분자로 나눠
                                    #                하나의 문자열로 합쳐줌
                                    # ex) ", ".join(['a', 'b', 'c']) => a, b, c
        print(b["sale_price"])
        print(b["contents"])
        print('--------------------')
    except Exception as e:
        print("", end="")





















