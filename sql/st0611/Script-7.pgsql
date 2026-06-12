select current_database();

create table courses(
    course_id serial primary key,
    course_name varchar(255) not NULL,
    price decimal(10,2) not NULL,
    description varchar(500),
    published_date date
);

-- course에 데이터 삽입
INSERT INTO courses( course_name, price, description, published_date)
VALUES
('PostgreSQL for Developers', 299.99, 'A complete PostgreSQL for Developers', '2020-07-13'),
('PostgreSQL Administration', 349.99, 'A PostgreSQL Guide for DBA', NULL),
('PostgreSQL High Performance', 549.99, NULL, NULL),
('PostgreSQL Bootcamp', 777.99, 'Learn PostgreSQL via Bootcamp', '2013-07-11'),
('Mastering PostgreSQL', 999.98, 'Mastering PostgreSQL in 21 Days', '2012-06-30');

SELECT * FROM courses
order by course_id;

-- where 조건으로 update, 조건을 안넣으면 전체 데이터가 업데이트 됨.
update courses
set published_date = '2020-08-01'
where course_id = 3;

update courses
set published_date = '2020-07-01'
where course_id = 2;

CREATE TABLE product_segment (
    id SERIAL PRIMARY KEY,
    segment VARCHAR NOT NULL,
    discount NUMERIC (4, 2)
);
INSERT INTO
    product_segment (segment, discount)
VALUES
    ('Grand Luxury', 0.05),
    ('Luxury', 0.06),
    ('Mass', 0.1);

    CREATE TABLE product(
    id SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    price NUMERIC(10,2),
    net_price NUMERIC(10,2),
    segment_id INT NOT NULL,
    FOREIGN KEY(segment_id) REFERENCES product_segment(id)
);
-- net price 부분은 아직 채우지 않음
INSERT INTO
    product (name, price, segment_id)
VALUES
    ('diam', 804.89, 1),
    ('vestibulum aliquet', 228.55, 3),
    ('lacinia erat', 366.45, 2),
    ('scelerisque quam turpis', 145.33, 3),
    ('justo lacinia', 551.77, 2),
    ('ultrices mattis odio', 261.58, 3),
    ('hendrerit', 519.62, 2),
    ('in hac habitasse', 843.31, 1),
    ('orci eget orci', 254.18, 3),
    ('pellentesque', 427.78, 2),
    ('sit amet nunc', 936.29, 1),
    ('sed vestibulum', 910.34, 1),
    ('turpis eget', 208.33, 3),
    ('cursus vestibulum', 985.45, 1),
    ('orci nullam', 841.26, 1),
    ('est quam pharetra', 896.38, 1),
    ('posuere', 575.74, 2),
    ('ligula', 530.64, 2),
    ('convallis', 892.43, 1),
    ('nulla elit ac', 161.71, 3);

select * from product;


-- net price 업데이트
update product
set net_price = price - price * discount
from product_segment
where product.segment_id = product_segment.id;


-- 전체 가격에 1000씩 더하기
update product
set net_price = net_price + 1000
from product_segment
where product.segment_id = product_segment.id;

create table todos (
    id serial primary key,
    title varchar(255) not NULL,
    completed boolean not null default false
);

INSERT INTO todos (title, completed) VALUES
    ('Learn basic SQL syntax', true),
    ('Practice writing SELECT queries', false),
    ('Study PostgreSQL data types', true),
    ('Create and modify tables', false),
    ('Explore advanced SQL concepts', true),
    ('Understand indexes and optimization', false),
    ('Backup and restore databases', true),
    ('Implement transactions', false),
    ('Master PostgreSQL security features', true),
    ('Build a sample application with PostgreSQL', false);

SELECT * from todos;

-- id = 1인 행 삭제
DELETE from todos
where id = 1;

CREATE TABLE member(
   id SERIAL PRIMARY KEY,
   first_name VARCHAR(50) NOT NULL,
   last_name VARCHAR(50) NOT NULL,
   phone VARCHAR(15) NOT NULL
);
CREATE TABLE denylist(
    phone VARCHAR(15) PRIMARY KEY
);
INSERT INTO member(first_name, last_name, phone)
VALUES ('John','Doe','(408)-523-9874'),
       ('Jane','Doe','(408)-511-9876'),
       ('Lily','Bush','(408)-124-9221');
INSERT INTO denylist(phone)
VALUES ('(408)-523-9874'),
       ('(408)-511-9876');

SELECT * FROM member;
SELECT * FROM denylist;

-- member 테이블에서 denylist 테이블에 있는 phone과 일치하는 행 삭제
delete from member
using denylist
where member.phone = denylist.phone;


CREATE TABLE departments (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

-- reference에 delete casacade가 있어서 부서를 삭제하면 직원들도 같이 삭제 됨
CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department_id INT NOT NULL,
    FOREIGN KEY(department_id)
       REFERENCES departments(id)
       ON DELETE CASCADE
);

INSERT INTO departments (name)
VALUES
    ('Engineering'),
    ('Sales')
RETURNING *;
INSERT INTO employees (name, department_id)
VALUES
    ('John Doe', 1),
    ('Jane Smith', 1),
    ('Michael Johnson', 2)
RETURNING *;

-- 부서에서 id = 1 행을 삭제하지만 부서 id = 1을 가지고 있는 직원들도 전부 삭제됨
DELETE FROM departments
WHERE id = 1;

SELECT * FROM employees;
SELECT * FROM departments;

CREATE TABLE basket(
    id SERIAL PRIMARY KEY,
    fruit VARCHAR(50) NOT NULL
);

INSERT INTO basket(fruit)
VALUES
  ('apple'),
  ('apple'),
  ('orange'),
  ('orange'),
  ('orange'),
  ('banana');

-- 과일로 그룹핑하고 count가 1이상인 것만 조회하여 중복인 항목 출력
  SELECT
    fruit,
    COUNT( fruit )
FROM
    basket
GROUP BY
    fruit
HAVING
    COUNT( fruit )> 1
ORDER BY
    fruit;

-- 같은 바스켓에서 id가 제일 작은 걸 남기면서 과일 이름이 중복인 항목 삭제
DELETE FROM
    basket a
        USING basket b
WHERE
    a.id < b.id
    AND a.fruit = b.fruit;

select * from basket;

-- from 안에 서브쿼리 : 과일 별로 row_num을 매김
-- 서브 쿼리에서 나온 row_num > 1인 항목은 중복인 항목이므로 삭제
DELETE FROM basket
WHERE id IN
    (SELECT id
    FROM
        (SELECT id,
         ROW_NUMBER() OVER( PARTITION BY fruit
        ORDER BY  id ) AS row_num
        FROM basket ) t
        WHERE t.row_num > 1 );