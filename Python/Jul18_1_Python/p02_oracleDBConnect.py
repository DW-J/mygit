# -*- coding:utf-8 -*-
from cx_Oracle import connect

# OracleDB와 연동이 되는 Java : instantClient에 있는 ojdbc8.jar
# OracleDB와 연동이 되는 Python : cx_Oracle.py(가 instantClient를 사용)

# 기본적으로 python에는 OracleDB 연결 기능이 없어요...
# 시작 - cmd -> pip install cx_oracle
# pip list

# sqlplus로 접속할 때 사용하는 주소
#    sqlplus [ID]/[PW]@[IP Address]:[PORT]/[SID]
#    sqlplus asdf/1@localhost:1521/xe

try:
    c = connect("asdf/1@localhost:1521/xe")
    print("성공 !")
except Exception as e:
    print(e)

c.close()
















