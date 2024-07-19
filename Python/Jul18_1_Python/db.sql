create table jul18_coffee(
	c_no number(3) primary key,
	c_name varchar2(10 char) not null,
	c_price number(5) not null,
	c_bean varchar2(10 char) not null
);

select * from jul18_coffee;

create sequence jul18_coffee_seq;

drop table jun18_coffee;
drop sequence jun18_coffee_seq;

select avg(c_price) from jul18_coffee order by c_price where c_no between '2' and '5';










