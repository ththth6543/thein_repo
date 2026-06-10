select current_database();

--select customer_id  from customer; 

select first_name || '~' || email from customer;

select 
	first_name || ' ' || last_name as full_name, email from customer;

-- alias 재정의
select 
	first_name || ' ' || last_name as full_name2, email from customer;

-- 현재 시간
select now();

-- asc: 오름차순,  DESC: 내림차순
select first_name, last_name
from customer c 
order by first_name;

select first_name, last_name
from customer c 
order by first_name desc;

select first_name, last_name
from customer c 
order by first_name asc, last_name desc;

-- 함수사용: length()
select first_name, length(first_name) len
from customer c 
order by len desc;
-- 테이블 생성
create table sort_demo(num INT);
-- 확인
select * from sort_demo;
-- row 값 추가
insert into sort_demo (num)
values (1),(2),(3),(null);
-- 확인
select * from sort_demo;

-- sort할 때 null의 위치
select * from sort_demo
order by num desc;

-- null을 맨 아래로
select * from sort_demo
order by num desc nulls last;

-- null을 맨 앞으로
select * from sort_demo
order by num desc nulls first;