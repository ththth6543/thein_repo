select current_database();


--limit
select f.film_id, f.title , f.release_year 
from film f
order by f.film_id 
limit 5;

--offset
select f.film_id, f.title , f.release_year 
from film f
order by f.film_id 
limit 4
offset 3;

--offset
select f.film_id, f.title , f.rental_rate 
from film f
order by f.rental_rate desc
limit 10;

-- fetch
select f.film_id, f.title 
from film f
order by f.title
fetch first row only;

-- fetch and offset
select f.film_id, f.title 
from film f
order by f.title
offset 5 row
fetch first 5 row only;

--in
select film_id, title
from film
where film_id in(1,2,3);

--or
select film_id, title
from film
where film_id=1 or film_id =2 or film_id =3;

--in
select first_name, last_name
from actor
where last_name in ('Allen', 'Chase', 'Davis')
order by last_name;

-- date in() 두 날짜 간격사이를 조건으
select payment_id, amount, p.payment_date 
from payment p 
where p.payment_date ::date IN('2007-02-15', '2007-02-18');

select count(*)
from payment;

select count(*)
from payment
where payment_date::date IN('2007-02-15', '2007-02-18');

--not in
select film_id, title
from film f
where f.film_id  not in (1,2,3)
order by f.film_id ;


select film_id, title
from film f
where f.film_id <> 1
and f.film_id  <> 2
and f.film_id  <> 3
order by f.film_id ;

-- between
select payment_id, amount
from payment
where payment_id between 17503 and 17505
order by payment_id ;

-- not between
select payment_id, amount
from payment
where payment_id not between 17503 and 17505
order by payment_id ;

-- between 날짜
select customer_id, payment_id, amount, payment_date
from payment p 
where p.payment_date between '2007-02-15' and '2007-02-20'
and p.amount > 10
order by p.payment_date ;

-- like
select first_name, last_name
from customer
where first_name like 'Jen%';

select 'Apple' like 'Apple' as result;
select 'Apple' like 'A%' as result;
select 'Apple' like 'a%' as result;

select  first_name, last_name
from customer c 
where c.first_name like '%her%'
order by c.first_name ;

--like
select first_name, last_name
from customer
where first_name like '_her%'
order by first_name;

--not like
select first_name, last_name
from customer
where first_name not like 'Jen%'
order by first_name;

-- ilike - like와 달리 대소문자를 구분하지 않음
select first_name, last_name
from customer c 
where c.first_name ilike 'BAR%';

-- ~~ like, ~~* ilike, !~~ not like, !~~* not ilike
select first_name, last_name
from customer
where first_name ~~ 'Dar%'
order by first_name ;

-- ~~ like, ~~* ilike, !~~ not like, !~~* not ilike
select first_name, last_name
from customer
where first_name ~~* 'Dar%'
order by first_name ;

-- ~~ like, ~~* ilike, !~~ not like, !~~* not ilike
select first_name, last_name
from customer
where first_name !~~ 'Dar%'
order by first_name ;

-- ~~ like, ~~* ilike, !~~ not like, !~~* not ilike
select first_name, last_name
from customer
where first_name !~~* 'Dar%'
order by first_name ;