# -*- coding:utf-8 -*-
# 4f626857416f6c6c3632586a416843
# http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/SearchParkInfoService/1/132/
from pymongo.mongo_client import MongoClient
from http.client import HTTPConnection
from json import loads

# 전체 공원 데이터 중에
#    공원 이름 (PK), 공원 소개, 개원일, 주소
#    => MongoDB에 넣고

# 다 넣었으면 => 출력 (console)
con = MongoClient("192.168.0.63")

hc = HTTPConnection("openapi.seoul.go.kr:8088")
hc.request("GET", "/4f626857416f6c6c3632586a416843/json/SearchParkInfoService/1/132/" )
resBody = hc.getresponse().read()

parkData = loads(resBody)

db = con.jul29


# for p in parkData["SearchParkInfoService"]["row"]:
    # print(p["P_PARK"])
    # db.jul29_park.insert_one( { "_id" : p["P_PARK"], "introduce" : p['P_LIST_CONTENT'], 
    #                            "open_dt" : p['OPEN_DT'], "address" : p['P_ADDR']} )
    
s = db.jul29_park.find()
for p in s:
    print(p["_id"])
    print(p["introduce"])
    if p["open_dt"] == "":
        print("-")
    else:
        print(p["open_dt"])
    print(p["address"])
    print("-------------------------")

con.close()
print("Success !")



