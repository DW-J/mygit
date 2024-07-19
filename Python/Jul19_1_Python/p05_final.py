# -*- coding:utf-8 -*-
from cx_Oracle import connect
from datetime import datetime

# 메뉴만들기 (함수)
# 1. 학생등록 / 2. 강의장 조회 / 3. 학생 조회 / 4. 학생정보를 파일로 내보내기
# 0. 종료
def showMenu():
    print("-----------------------------------")
    print("1. 학생 등록")
    print("2. 강의장 조회")
    print("3. 학생 조회")
    print("4. 학생 정보를 파일로 내보내기")
    print("0. 종료")
    print("-----------------------------------")
    return input("번호 입력 : ")

def regStudent():
    
    name = input("이름 : ")
    bd = input("생년월일(YYYYMMDD) : ")
    classroom = input("강의장 : ")
    mid = int(input("중간 점수 : "))
    fin = int(input("기말 점수 : "))

    con = connect("asdf/1@localhost:1521/xe")
    
    sql = "insert into jul19_student values(jul19_student_seq.nextval, "
    sql += f"'{name}', to_date('{bd}', 'yyyymmdd'), "
    sql += f"'{classroom}', {mid}, {fin})"
    
    cur = con.cursor()
    cur.execute(sql)
    if cur.rowcount == 1:
        print("학생 등록 성공 !")
        con.commit()
    con.close()

# 강의 장 조회 : 1강의장 - 6층 복도 오른쪽
def showCR():
    con = connect("asdf/1@localhost:1521/xe")
    sql = "select * from jul19_classroom"
    cur = con.cursor()
    cur.execute(sql)
    for c, l in cur:
        print(f"{c} - {l}")
    con.close()
    
# 학생 조회 : 이름, 생년월일(연-월-일 (요일)), 나이, 몇 강의장,
#            중간 점수, 기말 점수, 평균 점수
def showStudent():
    con = connect("asdf/1@localhost:1521/xe")
    sql = "select * from jul19_student"
    cur = con.cursor()
    cur.execute(sql)
    now = datetime.today()
    for _, name, birthday, classroom, mid, fin in cur:
        print("#########################")
        print(f"이름 : {name}")
        bd = datetime.strftime(birthday, "%Y-%m-%d")
        print(f"생일 : {bd} ({birthday.strftime('%a')})")
        print(f"나이 : {now.year - birthday.year}세")
        print(f"강의장 : {classroom}")
        print(f"중간고사 점수 : {mid}점")
        print(f"기말고사 점수 : {fin}점")
        print(f"평균점수 : {(mid + fin) / 2}점")
    con.close()

# 파일로 내보내기 (학생의 전체 정보 다 csv파일로)
def saveFile():
    con = connect("asdf/1@localhost:1521/xe")
    file = open("C:/Users/cloud/Desktop/Test/data/studentInfo.csv", "w", encoding="UTF-8")
    
    sql = "select * from jul19_student"
    cur = con.cursor()
    cur.execute(sql)
    
    for no, name, birthday, classroom, mid, fin in cur:
        file.wirte(f"{no},{name},{birthday},{classroom},{mid},{fin}")
    file.close()
    con.close()
    print("파일 작성 성공 !")

# 기능 모아주기
def start():
    while True:
        menu = showMenu()
        if menu == "1":
            regStudent()
        elif menu == "2":
            showCR()
        elif menu == "3":
            showStudent()
        elif menu == "4":
            saveFile()
        elif menu == "0":
            print("종료합니다.")
            break
#############################################################
start()






