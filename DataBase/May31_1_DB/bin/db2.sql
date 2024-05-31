-- 학생 테이블
create table student1(
	student1_id number(10),
	student1_name varchar2(10 char),
	constraint pk_student1 primary key(student1_id)
);
drop table student cascade constraint purge;
-- 교수 테이블
create table professor1(
	professor1_id number(10),
	professor1_name varchar2(10 char),
	constraint pk_professor1 primary key(professor1_id)
);

insert into professor1 values(201, '김교수');
insert into professor1 values(202, '김교수');
insert into professor1 values(203, '김교수');
insert into professor1 values(204, '김교수');

-- 강의 정보 테이블
create table course1(
	course1_id number(10),
	course1_name varchar2(10 char),
	professor1_id number(10),
	constraint pk_course1 primary key(course1_id),
	constraint fk_course1_professor1 foreign key(professor1_id)
		references professor1(professor1_id)
		on delete cascade
);



-- 수강 기록을 저장하는 테이블
create table enrollment1(
	student1_id number(10),
	course1_id number(10),
	enrollment1_date date,
	constraint pk_enrollment1 primary key(student1_id, course1_id)
	constraint fk_enrollment1_student1 foreign key(student1_id)
		references student1(student1_id)
		on delete cascade,
	constraint fk_enrollment1_course1 foreign key(course1_id)
		references course1(course1_id)
		on delete cascade
);

-- 학생 테이블에 데이터 넣기
insert into student1 values(1, '김하나');
insert into student1 values(2, '김둘');
insert into student1 values(3, '김셋');
insert into student1 values(4, '김넷');
select * from student1;

-- 코스 테이블에 데이터 넣기
insert into course1 values(101, '경제학 개론');
insert into course1 values(102, '통계학 개론');
select * from course1;


drop table student cascade constraint purge;

-- 수강 기록 테이블에 데이터 넣기
insert into enrollment1 values(1, 101, '2024-05-30');
insert into enrollment1 values(2, 101, '2024-05-31');
insert into enrollment1 values(1, 102, '2024-06-01');
select * from enrollment1;

-- student1_id가 1인 핫갱을 삭제
delete from student1 where student1_id = 1;

-- enrollment 테이블 조회
select * from enrollment;

drop table student1 cascade constraint purge;
drop table professor1 cascade constraint purge;
drop table course1 cascade constraint purge;
drop table enrollment1 cascade constraint purge;