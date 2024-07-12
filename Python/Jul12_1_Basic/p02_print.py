# -*- coding:utf-8 -*-

# Java vs Python
#    Java : 컴퓨터 활용 효율적 => 규칙의 언어 => Perfect한 객체지향언어
#                내용이 명확하고, 혼란스럽지 않은 코드
#                코드가 상당히 길어진다;;;;

#    Python : 사람이 쓰기 편하게 => 자유의 언어 => hybrid한 객체지향언어
#                코드가 짧다
#                코드가 길어지면... 헷갈릴 여지가 있음!
############################################################

# 기본적인 출력 방식
print("WA! 파이썬!")
print('WA! 금요일!') # enter 기능 포함 O
print()

# seperator
print('내' , '일', '토', '요', '일', sep='ㅋ')
# 여러분의 메일주소 출력
# 전화번호 출력

print('jdawoon1993@gmail.com')
print("010", "5526", "6076", sep='-')

# end
print('파이썬이', end=' ')
print('본격적으로', end=' ')
print('시작되었읍니다.', end=' ')
print()

# 출력 형식(format)
print('{} and {} '.format('1번', '2번'));
print('{1} and {0} and {0}'.format('1번', '2번'));
print('{p1} is {p2}'.format(p1='Life', p2='Egg'))
print()

# %d, %f, %s
# System.out.printf("%d", 123);
print('%d' % 123)
print('%.2f' % 123.45678)
print()

# 10이라는 값을 0번째에, 11.11111이라는 값을 1번째에 소수점 둘째자리까지 출력
print('%.f' % 10)
print('%.2f' % 11.11111)
print('{}, {}'.format('%d' % 10, '%.2f' % 11.11111) )
print('{0: d}, {1:.2f}'.format(10, 11.11111))

















