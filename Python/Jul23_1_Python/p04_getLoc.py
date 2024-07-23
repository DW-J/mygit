# -*- coding:utf-8 -*-
from urllib.parse import quote
from http.client import HTTPSConnection
from cx_Oracle import connect
from json import loads

# abf07c1bc7cc9d38d6e1bc90881fc5e5
# Authorization: KakaoAK ${REST_API_KEY} 
# https://dapi.kakao.com/v2/local/search/keyword.json
# query / x / y / radius
# 37.5020701 / 127.0271684

# json 데이터
# 검색어를 입력
#    => 위도/경도 지정
#    => 반경 1km이내에 있는
#    => 검색어에 대한 위치 정보

#    => 장소명(업체명), 전화번호, 경도(longitude), 위도(latitude)
#    => DB에 저장
#    => 전화번호 : 없는 부분은 '-' 으로 대체
#    => 경도, 위도 : 소수점 6자리까지

search = quote(input("검색어 : "))
# print(q)


hc = HTTPSConnection("dapi.kakao.com")
url = f"/v2/local/search/keyword.json?query={search}&x=127.0271684&y=37.5020701&radius=1000"

h = { "Authorization": "KakaoAK abf07c1bc7cc9d38d6e1bc90881fc5e5"}

hc.request("GET", url, headers=h)

resBody = hc.getresponse().read()
# print(resBody.decode())
#################################################

# DB => insert
con = connect("asdf/1@localhost:1521/xe")

cur = con.cursor()
location = loads(resBody)

for l in location["documents"]:
    sql = "insert into search_location values( "
    sql += "search_location_seq.nextval, "
    sql += f"'{l['place_name']}', "
    sql += f"nvl('{l['phone']}', '-'), "
    sql += f"{float(l['x']):.6f}, "
    sql += f"{float(l['y']):.6f})"
    cur.execute(sql)

con.commit()
con.close()
print("완 ~ 료 ~ !")









