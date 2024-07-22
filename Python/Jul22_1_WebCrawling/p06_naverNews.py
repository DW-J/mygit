# -*- coding:utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup

# 검색어를 입력했을 때,
# url 주소뒤에 요청파라미터로 start=숫자를 넣으면
# 관련 누스 내용 5페이지까지의 뉴스 제목들을 콘솔에 출력

# https://search.naver.com/search.naver?where=news&query=
# &sm=tab_tmr&nso=so:r,p:all,a:all&sort=0&start=

def getTitle(address, q):
    for i in range(0, 5):
        # 1페이지 : 1 ~ 10 / 2페이지 : 11 ~ 10 / 3페이지 : 21 ~ 30
        print(f"============================== {i + 1} 페이지 ==============================")
        start = 10 * i + 1 # 1 / 11 / 21 / 31 / 41
        addr = address + q
        addr += "&sm=tab_tmr&nso=so:r,p:all,a:all&sort=0&start=" + str(start)
        
        res = requests.get(addr)
        
        soup = BeautifulSoup(res.text, 'html.parser')
        
        news = soup.select('.news_tit')
        for n in news:
            print(n.text)
###########################################################################
address = "https://search.naver.com/search.naver?where=news&query="
query = quote(input("검색어 : "))
getTitle(address, query)













