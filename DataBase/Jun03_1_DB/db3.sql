-- 웹사이트에서 게시판에 대한 테이블과 이를 [참조하는] 댓글 테이블을 만드려고 함
-- 게시판 테이블에는 [작성자 / 게시판 글 내용 / 작성 시간]에 대한 부분이 있었으면
-- 댓글 테이블에는 [작성자 / 댓글 내용 / 작성 시간]에 대한 부분이 있었으면

-- 1. 테이블의 구조를 파악해서 게시판 테이블 만들기
-- 2. 테이블의 구조를 파악해서 댓글 테이블 만들기
--	[조건 : 참조 되는 테이블의 내용이 삭제되면 관련있는 댓글 내용도 삭제]
-- 3. 게시판 테이블에 값 2개 넣고 / 각 게시글마다 댓글 2개씩 넣기
--	[조건: 날짜 관련한 값은 현재 날짜/시간으로 통일]
-- 4. 게시글 1번을 지웠을 때 관련 댓글들도 지워지는지 확인
--------------------
create table board(
	b_no number(4) primary key,
	b_owner varchar2(10 char) not null,
	b_txt varchar2(100 char) not null,
	b_when date not null
);
create sequence board_seq;

create table board_reply(
	br_no number(4) primary key,
	br_b_no number(4) not null, -- 소속된 글 번호 / 이걸로 board 테이블을 참조
	br_owner varchar2(10 char) not null,
	br_txt varchar2(100 char) not null,
	br_when date not null,
	constraint fk_board_reply foreign key(br_b_no)
		references board(b_no)
		on delete cascade
);
create sequence board_reply_seq;

insert into board values(board_seq.nextval, '도비', '지금 당장 탈주 마려운 게붕이는 개추', sysdate);
insert into board values(board_seq.nextval, '천마데스빔', '젠장 또 대상혁이야', sysdate);
select * from board;

insert into board_reply values(board_reply_seq.nextval, 1, '도비', '일단 나부터 ㅋㅋ', sysdate);
insert into board_reply values(board_reply_seq.nextval, 2, '대학원생', 'ㄹㅇㅋㅋ', sysdate);
insert into board_reply values(board_reply_seq.nextval, 1, '울프', '나는 찬양해야만해', sysdate);
insert into board_reply values(board_reply_seq.nextval, 2, 'k1', '지금부터 찬양을 시작하겠어', sysdate);
select * from board_reply;

-- 4. 게시글 1번을 지웠을 때 관련 댓글들도 지워지는지 확인
delete from board where b_no = 1;

--------------------
drop table board cascade constraint purge;
drop sequence board_seq;
drop table board_reply cascade constraint purge;
drop sequence board_reply_seq;









