drop table drink cascade constraint purge;
drop table cafe cascade constraint purge;
-- 1. 음료테이블과 카페테이블을 만들기
-- 음료테이블 : 음료이름 / 가격 / 판매하는 카페의 이름
-- 카페테이블 : 카페이름 / 지역 / 좌석 수
-- [조건] 참조관계 고려 X, 각 테이블에서 음료이름, 카페이름은 고유한 값을 갖는다
create table drink(
	d_name varchar2(10 char) primary key,
	d_price number(4) not null,
	d_cafe varchar2(10 char) not null
);

create table cafe(
	c_name varchar2(10 char) primary key,
	c_address varchar2(10 char) not null,
	c_seat number(3) not null
);

-- 2. 조건에 맞는 테이블을 생성 + 데이터 넣기
--	A카페는 서울에 위치하고, 좌석 100석,
--		(아메리카노, 2000원), (라떼, 3000원), (녹차, 2500원) 을 판매
--	B카페는 제주에 위치하고, 좌석 80석
--		(홍차, 2500원), (스무디, 3000원), (에스프레소, 4000원) 을 판매
insert into drink values('아메리카노', 2000, 'A카페');
insert into drink values('라떼', 3000, 'A카페');
insert into drink values('녹차', 2500, 'A카페');
insert into drink values('홍차', 2500, 'B카페');
insert into drink values('스무디', 3000, 'B카페');
insert into drink values('에스프레소', 4000, 'B카페');
select * from drink;

insert into cafe values('A카페', '서울', 100);
insert into cafe values('B카페', '제주', 80);
select * from cafe;

-- 3. 쿼리문 작성
--	전체 음료 기준 평균가보다 비싼 음료는 몇 종류 ?
select count(*) 
	from drink 
	where d_price < (
		select avg(d_price) 
		from drink
		);
		
--	제일 싼 음료를 파는 카페의 이름은 ?
select c_name 
	from cafe 
	where c_name = (		-- '='에 in 넣어도 됨
		select d_cafe 
		from drink 
		where d_price = (
			select min(d_price) 
			from drink
			)
		);

--	서울에 있는 카페에서 만드는 음료의 평균가 ?
select avg(d_price) 
	from drink 
	where d_cafe = (		
		select c_name 
		from cafe 
		where c_address = '서울'
		);

--	좌석이 90석 이상인 카페이서 파는 음료의 이름 ?
select d_name 
	from drink 
	where d_cafe = (
		select c_name 
		from cafe 
		where c_seat >= 90
		);

--	전체 음료 기준 평균가 이하인 음료의 이름 ?
select d_name 
	from drink 
	where d_price <= (
		select avg(d_price) 
		from drink
		);

--	가장 비싼 음료를 파는 카페는 어디에 있는지 ? 
select c_address 
	from cafe 
	where c_name = (
		select d_cafe 
		from drink 
		where d_price = (
			select max(d_price) 
			from drink
			)
		);
		
		
		
		
		
		
		
		