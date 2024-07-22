# -*- coding:utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup

# https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8
# &query=%EC%9C%A4%ED%95%98+%EC%98%A4%EB%A5%B4%ED%8A%B8%EA%B5%AC%EB%A6%84+%EA%B0%80%EC%82%AC
# 가수, 노래 제목을 직접 입력해서 요청
# 노래 가사에 대한 내용을 출력

artist = quote(input("가수 : "))
title = quote(input("제목 : "))

url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8"
url += f"&query={artist}+{title}+%EA%B0%80%EC%82%AC"

response = requests.get(url)
# main_pack > div.sc_new.cs_common_module._au_music_content_wrap.case_empasis.color_13 > div.cm_content_wrap > div.cm_content_area._cm_content_area_song_lyric > div > div.intro_box > p
if response.status_code == 200:
    html = response.text
    # print(html)
    soup = BeautifulSoup(html, 'html.parser')
    lyrics = soup.select_one('#main_pack > div.sc_new.cs_common_module._au_music_content_wrap.case_empasis.color_13 > div.cm_content_wrap > div.cm_content_area._cm_content_area_song_lyric > div > div.intro_box > p')
    print(lyrics.text)
else:
    print(response.status_code)

# main_pack > div.sc_new.cs_common_module._au_music_content_wrap.case_empasis.color_4 > div.cm_content_wrap > div.cm_content_area._cm_content_area_song_lyric > div > div.intro_box > p
# main_pack > div.sc_new.cs_common_module._au_music_content_wrap.case_empasis.color_1 > div.cm_content_wrap > div.cm_content_area._cm_content_area_song_lyric > div > div.intro_box > p

address = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8"







