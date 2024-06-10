-- 어떤 특정한 식당에 대한 테이블
-- 식당 지점(체인점 지역), 식당 주인(이름), 좌석 수
create table jun10_restaurant(
	r_location varchar2(10 char) primary key,
	r_owner varchar2(10 char) not null,
	r_seat number(3) not null
);
-- 데이터 2~3개 정도 넣기
insert into jun10_restaurant values('강남', '장덕팔', 150);
insert into jun10_restaurant values('명동', '최덕구', 250);
insert into jun10_restaurant values('신논현', '마석도', 200);
--select * from jun10_restaurant;
---------------------------------------------------------------
-- 예약 테이블
-- 예약자 이름, 예약 시간, 예약자 전화번호, 예약 지점
create table jun10_reservation(
	r_no number(2) primary key,
	r_name varchar2(10 char) not null,
	r_time date not null,
	r_phonenum varchar2(20 char) not null,
	r_location varchar2(10 char) not null,
	constraint fk_r_location foreign key(r_location)
		references jun10_restaurant(r_location)
		on delete cascade
);
create sequence jun10_reservation_seq;

-- 데이터 2~3개 정도 넣기
insert into jun10_reservation values(jun10_reservation_seq.nextval, '최상필', 
	to_date('2024-06-10 17:00', 'YYYY-MM_DD HH24:MI'), '010-1234-5678', '강남');
insert into jun10_reservation values(jun10_reservation_seq.nextval, '홍길동', 
	to_date('2024-06-10 18:00', 'YYYY-MM_DD HH24:MI'), '010-1122-3344', '강남');
insert into jun10_reservation values(jun10_reservation_seq.nextval, '정시우', 
	to_date('2024-06-13 13:00', 'YYYY-MM_DD HH24:MI'), '010-5566-1357', '명동');
--select * from jun10_reservation;

drop table jun10_reservation cascade constraint purge;
drop sequence jun10_reservation_seq;




select * from jun10_reservation where r_name = '비오';








