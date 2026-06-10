select current_database();

create table colors(
	id serial primary key,
	bcolor varchar,
	fcolor  varchar
);

select * from colors;

-- 레코드 데이터 입력
insert into colors(bcolor, fcolor)
values  ('red', 'red');

insert into colors(bcolor, fcolor )
values ('red', null),
(null, 'red'),
('green', 'green'),
('green', 'green'),
('grenn', null),
('blue', null),
('black', null);

-- 겹치는 데이터 생략(중복제거)
select distinct bcolor
from colors
order by bcolor;

create table student_scores(
	name varchar(50) not null,
	subject varchar(50) not null,
	score integer not null
);

select  * from student_scores;alter 

insert into student_scores(name, subject, score)
values ('Alice', 'Math', 90),
		('Bob', 'Math', 85),
		('Alice', 'Physics', 92),
		('Bob', 'Physics', 88),
		('Charlie', 'Math', 95),
		('Charlie', 'Physics', 90);

select distinct on (name) namecase 

-- where = 조건 --------
select last_name, first_name
from customer c
where c.first_name = 'Jamie';
-- and
select last_name, first_name
from customer c 
where c.first_name = 'Jamie' and c.last_name = 'Rice';
-- or
select last_name, first_name
from customer c 
where c.first_name = 'Jamie' or c.last_name = 'Rice'

--in
select last_name, first_name
from customer c 
where c.first_name in ('Ann', 'Anne','Annie');

--like 패턴 일
select last_name, first_name
from customer c 
where c.first_name like 'Ann%';


--between
select first_name, length(c.first_name ) name_length
from customer c 
where c.first_name like 'A%' and length(first_name) between 3 and 5
order by name_length ;

-- <> 다르다
select last_name, first_name
from customer c 
where c.first_name like 'Bra%' and c.last_name <> 'Motley';

select 1 = 1 as result;
select true and true as result2;
select true and false as result3;
select true and null as result4;
select false and false as result5;
select false and null as result6;
select null and null as result7;

-- where and
select title, length, rental_rate
from film
where length > 180 and rental_rate  < 1;

-- or
select 1 <> 1 as result;
select true or true as result;
select true or false as result3;
select true or null as result4;
select false or false as result5;
select false or null as result6;
select null or null as result7;

-- where or
select title, rental_rate
from film
where rental_rate = 0.99 or rental_rate = 2.99;