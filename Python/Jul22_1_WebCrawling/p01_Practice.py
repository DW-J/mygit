# -*- coding:utf-8 -*-
import urllib.request as req

# xml, json => 대기업들이 제공하는 데이터, 공공기관에서 제공하는 데이터
#    찾는 데이터가 대기업, 공공기관에서 제공하고 있지 않다면...?

# 웹 크롤링(Web Crowling) / 웹 스크래핑 (Web Scraping)
#    => 웹 페이지에 널려있는 데이터들을 프로그래밍적으로 추출하는 것
# 웹은 개발자들이  어떤한 정형화 되어있는 형태로 관리 => 규칙이 생기기 마련!
#    => 그 규칙을 분석해서 원하는 정보들만 뽑아오는 작업
# 웹 크롤링 자체가 불법은 아님...! => 불법으로 간주되는 경우도 있습니다!!!
#    => 조심해서 사용!

# url - 이미지
img = "https://dszw1qtcnsa5e.cloudfront.net/community/20231005/7af457f2-3c45-40fe-8399-a53a212ffcdf/%EC%98%A4%EC%BC%80%EC%8A%A4%ED%8A%B8%EB%9D%BC%EA%B3%B5%EC%8B%9D%EC%BB%A4%EB%AE%A4%EB%8B%88%ED%8B%B0%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD780x440.png"
html = "https://www.google.com"

# 다운받을 경로
path1 = "C:/Users/cloud/Desktop/Test/data/BlueArchive.png"
path2 = "C:/Users/cloud/Desktop/Test/data/google.html"

# 예외처리
try:
    # urlretrieve() : 다운받을 파일 및 저장정보를 return
    f1, h1 = req.urlretrieve(img, path1)
    f2, h2 = req.urlretrieve(html, path2)
except Exception as e:
    print(e)
    print("실패 !")
else:
    # 정상적으로 싱행되었을 경우
    # Header정보를 출력 : 개발자 도구 => Network => Headers
    print(h1)
    print("----------------------------")
    print(h2)

# 다운로드 파일 정보
print(f"이미지 정보 : {f1}")
print(f"파일 정보 : {f2}")

print("성공 !")



