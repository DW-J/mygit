# -*- coding:utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup

# https://search.daum.net/search?w=news&q=
# &enc=utf8&cluster=y&cluster_page=1&DA=PGD&p=1
# 검색어 콘솔에 입력
# 요청했을때 나오는 결과 1 ~ 5페이지까지의 뉴스 제목을 출력

def getTitle(addr, q):
    for i in range(1, 6):
        print(f"========= {i + 1} 페이지 =========")
        
        address = addr + q
        address += f"&enc=utf8&cluster=y&cluster_page=1&DA=PGD&p={i}"
        
        res = requests.get(address)
        
        soup = BeautifulSoup(res.text, 'html.parser')
        
        # ul = soup.select_one("#dnsColl > div:nth-child(1) > ul")
        ul = soup.select_one("ul.c-list-basic")
        
        news = ul.select("li > div > div > div > strong > a")
        
        for n in news:
            print(n.text)

##########################################################
address = "https://search.daum.net/search?w=news&q="
query = quote(input("검색어 : "))
getTitle(address, query)







