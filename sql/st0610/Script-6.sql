select current_database();

select * from customer;

select * from payment;

select *
from customer c
inner join payment p
	on c.customer_id  = p.customer_id
order by p.payment_date desc;

-- self join 자기 자신과 join - 필름의 타이틀이 다른데 상영시간은 같은 모든 레코드 출력
select distinct
  f1.title,
  f2.title,
  f1.length
FROM
  film f1
  INNER JOIN film f2
  	ON f1.film_id <> f2.film_id
  	AND f1.length = f2.length;

-- customer에 customer_id를 이용하여 payment를 조인하고 payment에 staff_id를 사용하여 staff 테이블과 조인
SELECT
  c.customer_id,
  c.first_name || ' ' || c.last_name customer_name,
  s.first_name || ' ' || s.last_name staff_name,
  p.amount,
  p.payment_date
FROM
  customer c
  INNER JOIN payment p USING(customer_id)
  INNER JOIN staff s USING(staff_id)
ORDER BY
  payment_date;

-- 예시 테이블 t1,t2 생성
CREATE TABLE
  T1 (LABEL CHAR(1) PRIMARY KEY);
CREATE TABLE
  T2 (score INT PRIMARY KEY);
INSERT INTO
  T1 (LABEL)
VALUES
  ('A'),
  ('B');
INSERT INTO
  T2 (score)
VALUES
  (1),
  (2),
  (3);

-- cross join : 두 테이블의 모든 행을 서로 다 한번씩 결합하는 조인
SELECT *
FROM T1
CROSS JOIN T2
order by label;

--------------------------------
CREATE TABLE categories (
  category_id SERIAL PRIMARY KEY,
  category_name VARCHAR (255) NOT NULL
);

-- references를 이용해 카테고리의 카테고리 아이디와 연결
CREATE TABLE products (
  product_id serial PRIMARY KEY,
  product_name VARCHAR (255) NOT NULL,
  category_id INT NOT NULL,
  FOREIGN KEY (category_id) REFERENCES categories (category_id)
);

INSERT INTO categories (category_name)
VALUES
  ('Smartphone'),
  ('Laptop'),
  ('Tablet'),
  ('VR')
RETURNING *;

INSERT INTO products (product_name, category_id)
VALUES
  ('iPhone', 1),
  ('Samsung Galaxy', 1),
  ('HP Elite', 2),
  ('Lenovo Thinkpad', 2),
  ('iPad', 3),
  ('Kindle Fire', 3)
RETURNING *;

-- natual join : 두 테이블에서 이름과 데이터 타입이 완전히 일치하는 공통 컬럼을 찾아, 
-- SQL이 사람이 직접 지정하지 않아도 알아서 자동으로 결합(조인)해 주는 방식
SELECT *
FROM products
NATURAL JOIN categories;

--group by : 특정 컬럼을 기준으로 그룹화
SELECT
  customer_id,
  SUM (amount) -- sum을 개별로 표시할 수 없어서(그룹화 했기 때문에) sum()을 취할 수 밖에 없음
FROM
  payment
GROUP BY
  customer_id
ORDER BY
  customer_id;

-- full_name 기준으로 묶고 그 amount를 다 더하고 내림차순으로 출
SELECT
  first_name || ' ' || last_name full_name,
  SUM (amount) amount
FROM
  payment
  INNER JOIN customer USING (customer_id)
GROUP BY
  full_name
ORDER BY
  amount DESC;

-- 날짜 별로 그룹을 만들고 그 날짜에 총 결제한 비용을 출력
-- ::date로 포맷을 바꾸어서 출력, 포맷을 바꾸지 않으면 그룹이 시간/분/초 별로 나뉘게 됨
SELECT
  payment_date::date payment_date,
  SUM(amount) sum
FROM
  payment
GROUP BY
  payment_date ::date 
ORDER BY
  payment_date DESC;

--having group by를 위한 조건
-- amount의 합계가 200 초과인 row만 출
SELECT
  customer_id,
  SUM (amount) amount
FROM
  payment
GROUP BY
  customer_id
HAVING
  SUM (amount) > 200
ORDER BY
  amount DESC;

--------------------------------
DROP TABLE IF EXISTS sales;
-- primary key를 단일 컬럼이 아닌 브랜드와 세그먼트를 묶어서 설정
CREATE TABLE sales (
    brand VARCHAR NOT NULL,
    segment VARCHAR NOT NULL,
    quantity INT NOT NULL,
    PRIMARY KEY (brand, segment)
);

INSERT INTO sales (brand, segment, quantity)
VALUES
    ('ABC', 'Premium', 100),
    ('ABC', 'Basic', 200),
    ('XYZ', 'Premium', 100),
    ('XYZ', 'Basic', 300)
RETURNING *;

-- (brand, segment)로 묶어서 안에 내용이 하나만 달라도 다르게 취
SELECT
    brand,
    segment,
    SUM (quantity)
FROM
    sales
GROUP BY
    brand,
    segment;

-- 브랜드 하나로만 묶어서 2줄만 나옴
SELECT
    brand,
    SUM (quantity)
FROM
    sales
GROUP BY
    brand;

-- union all : 쿼리의 결과를 합쳐서 보여줌

SELECT
    brand,
    null,
    SUM (quantity)
FROM
    sales
GROUP BY
    brand
UNION all
SELECT
    brand,
    segment,
    SUM (quantity)
FROM
    sales
GROUP BY
    brand,
    segment;

-- 첫 번째 : (브랜드 , 세그먼트)로 묶어서 브랜드, 세그먼트 부분은 널이 뜨고 전체 합계만 뜸
-- 두 번째 : 아무것도 안묶었으므로 전부 출력
-- 세 번째 : 세그먼트로 묶어서 브랜드에 널
-- 네 번째 : 브랜드로 묶어서 세그먼트 널
SELECT
    brand,
    segment,
    SUM (quantity)
FROM
    sales
GROUP BY
    GROUPING SETS (
        (brand, segment),
        (),
        (segment),
        (brand)
    );