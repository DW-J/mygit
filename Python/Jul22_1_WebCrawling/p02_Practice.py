# -*- coding:utf-8 -*-
import urllib.request as req
from urllib.error import HTTPError, URLError

# 저장 경로 - list 형식으로 !

urlList = ["https://blog.kakaocdn.net/dn/lArPV/btrEQfchMV9/ZD8HOlkw4iwmDMeXy9Qdc1/img.png",
           "https://www.google.com"]

pathList = ["C:/Users/cloud/Desktop/Test/data/LostArk.png",
            "C:/Users/cloud/Desktop/Test/data/index.html"]

for i, url in enumerate(urlList):
    # 예외처리
    try:
        # web의 수신정보를 확인
        res = req.urlopen(url)
        
        # 수신받는 내용
        content = res.read()
        print("------------------------")
        
        # 상태정보 확인
        print(f"헤더 정보 : {i, res.info()}")
        print(f"http status : {res.getcode()}")
        print("------------------------")
        
        # 파일 쓰기
        # with : 파일을 열고 닫는거 같이 해주는 역할
        with open(pathList[i], "wb") as f: # 'b' : binary mode
            f.write(content)
        
    except HTTPError as e:
        print("HTTPError Code : ", e.code)
    except URLError as e:
        print("URLError Code : ", e.code)
    else:
        print("------------------------")
        print("성공 !")
        print("------------------------")


















