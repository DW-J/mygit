# -*- coding:utf-8 -*-
from pymongo.mongo_client import MongoClient

con = MongoClient("192.168.0.63")

db = con.jul29

# remove() / delete_one() + delete_many()
# db.jul29_lunch.romove({"_id" : "test"})
# db.jul29_lunch.romove({}) => mongoDB cmd 전체 데이터 삭제 시

# 해당 데이터 하나만 삭제
db.jul29_lunch.delete_one({"price" : 8000}) # 처음 만나는 8000원 짜리 데이터를 삭제

# 해당 데이터 전체 삭제
db.jul29_lunch.delete_many({"price" : 8000}) # 8000원 짜리 데이터 전부를 삭제
db.jul29_lunch.delete_many({}) # db.jul29_lunch.romove({})와 같다


con.close()
print("Success !")

