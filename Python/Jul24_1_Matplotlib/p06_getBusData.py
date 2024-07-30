# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from json import loads

# http://openapi.seoul.go.kr:8088
# /4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/1/5/20151101/

# 2021 ~ 2023년 3년치 데이터를...
# 연,월,일(USE_YMD),노선번호(RTE_NO),정류장명(SBWY_STNS_NM),승차총승객수(GTON_TNOPE),하차총승객수(GTOFF_TNOPE)
# 연도별로 csv파일에 저장

# 정류장명(역명) => 혹시 ,가 들어있을 수 있으니
#            => ,를 .로 바꿔서 저장

# 인원수 관련 => 정수형태로 저장
hc = HTTPConnection("openapi.seoul.go.kr:8088")
y = 2021
f = open(f"C:/Users/cloud/Desktop/Test/data/busData{y}.csv", "a", encoding="UTF-8")
for m in range(1, 13):
    for d in range(1, 32):
        for start in range(1, 41000, 1000):
            url = "/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/"
            url += f"{start}/{start + 999}/{y}{m:02d}{d:02d}/"
            hc.request("GET", url)
            resBody = hc.getresponse().read()
            busData = loads(resBody)
            if "CardBusStatisticsServiceNew" in busData:
                for b in busData["CardBusStatisticsServiceNew"]["row"]:
                    f.write(f"{y},{m},{d},")
                    f.write(f"{b['RTE_NO'].replace(',', '.')},")
                    f.write(f"{b['SBWY_STNS_NM'].replace(',', '.')},")
                    f.write(f"{b['GTON_TNOPE']:.0f},")
                    f.write(f"{b['GTOFF_TNOPE']:.0f}\n")
        print(y, m, d)
f.close()

