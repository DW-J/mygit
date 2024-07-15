# -*- coding:utf-8 -*-
from random import randint

# 숫자야구 (3자리) (함수) (각 자릿수의 숫자는 중복 X)
# 012 ~ 987 중에 랜덤한 숫자 정답 (각 자리의 값들은 list에 담기)
# 유저가 입력 => 자릿수와 값까지 같으면 S, 자릿수는 다른데 값이 같으면 B
# S가 3개 나오면 정답! => 종료

def generate_numbers():
    numbers = []
    while len(numbers) < 3:
        num = randint(0, 9)
        if num not in numbers:          # list에 뽑은 숫자값이 없으면
            numbers.append(num)      # list에 추가
    print("번호 뽑기 완료 !")
    return numbers

def get_userAns():
    userAns = input("답 입력 : ")  # int로 받으면 백의자리가 0인것들은 가져올 수 없음
    if len(userAns) != 3:
        print("절대 3자리 숫자를 입력하지마 !")
        return get_userAns()
    elif ( (userAns[0] == userAns[1]) or
             (userAns[0] == userAns[2]) or
             (userAns[1] == userAns[2]) )  :
        print("절대 중복된 숫자를 입력해 !")
        return get_userAns()
    return userAns

def check(gn, ua):
    strike, ball = 0, 0
    for i in range(0, 3):
        for j in range(0, 3):
            if gn[i] == int(ua[j]):
                if i == j:
                    strike += 1
                else:
                    ball += 1
    return strike, ball

def playGame():
    gn = generate_numbers()
    turn = 0
    s = 0
    b = 0
    print(gn)
    while s != 3:
        s, b = check(gn, get_userAns())
        turn += 1
        print("{}S! {}B!".format(s, b))
        if s == 3:
            print("%d번 만에 맞췄습니다 ! "% turn)
            print("정답은", end=" ")
            for a in gn:
                print(a, end="")
            print("입니다 !!!!!")
######################################################
playGame()









