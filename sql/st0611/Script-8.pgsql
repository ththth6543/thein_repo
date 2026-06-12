select current_database();

-- Create the main products table
CREATE TABLE products_2 (
    product_id SERIAL PRIMARY KEY,
    name TEXT UNIQUE,
    price DECIMAL(10,2),
    stock INTEGER,
    status TEXT,
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert some initial data
INSERT INTO products_2 (name, price, stock, status) VALUES
    ('Laptop', 999.99, 50, 'active'),
    ('Keyboard', 79.99, 100, 'active'),
    ('Mouse', 29.99, 200, 'active');

-- Create a table for our updates
CREATE TABLE product_updates (
    name TEXT,
    price DECIMAL(10,2),
    stock INTEGER,
    status TEXT
);

-- Insert mixed update data (new products, updates, and discontinuations)
INSERT INTO product_updates VALUES
    ('Laptop', 1099.99, 75, 'active'),      -- Update: price and stock change
    ('Monitor', 299.99, 30, 'active'),      -- Insert: new product
    ('Keyboard', NULL, 0, 'discontinued'),  -- Delete: mark as discontinued
    ('Headphones', 89.99, 50, 'active');    -- Insert: another new product

-- product_2 업데이트를 하는데
-- 1. update의 상태가 discontinued일 때는 삭제
-- 2. 상태가 엑티브면 업데이트를 실행
-- 3. 액티브인데 매치가 안되면 새로 삽입
-- 결과 : 키보드 삭제 헤드폰 추가 나머지 사항은 업데이트 됨
MERGE INTO products_2 p
USING product_updates u
ON p.name = u.name
WHEN MATCHED AND u.status = 'discontinued' THEN
    DELETE
WHEN MATCHED AND u.status = 'active' THEN
    UPDATE SET
        price = COALESCE(u.price, p.price),
        stock = u.stock,
        status = u.status,
        last_updated = CURRENT_TIMESTAMP
WHEN NOT MATCHED AND u.status = 'active' THEN
    INSERT (name, price, stock, status)
    VALUES (u.name, u.price, u.stock, u.status);

SELECT * from products_2;

DROP TABLE IF EXISTS customers CASCADE;
CREATE TABLE customers (
    id SERIAL PRIMARY KEY,
    customer_name VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS customers CASCADE;
CREATE TABLE customers (
    id SERIAL PRIMARY KEY,
    customer_name VARCHAR(255) NOT NULL
);

ALTER TABLE customers
ADD COLUMN fax VARCHAR (25),
ADD COLUMN email VARCHAR (400);

INSERT INTO
   customers (customer_name)
VALUES
   ('Apple'),
   ('Samsung'),
   ('Sony')
RETURNING *;

ALTER TABLE customers
ADD COLUMN contact_name VARCHAR(255);

UPDATE customers
SET contact_name = 'John Doe'
WHERE id = 1;
UPDATE customers
SET contact_name = 'Mary Doe'
WHERE id = 2;
UPDATE customers
SET contact_name = 'Lily Bush'
WHERE id = 3;

ALTER TABLE customers
ALTER COLUMN contact_name
SET NOT NULL;

CREATE TABLE publishers_2 (
    publisher_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);
CREATE TABLE categories_2 (
    category_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);
CREATE TABLE books (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(255) NOT NULL,
    published_date DATE NOT NULL,
    description VARCHAR,
    category_id INT NOT NULL,
    publisher_id INT NOT NULL,
    FOREIGN KEY (publisher_id)
       REFERENCES publishers_2 (publisher_id),
    FOREIGN KEY (category_id)
       REFERENCES categories_2 (category_id)
);

CREATE VIEW book_info
AS SELECT
    book_id,
    title,
    isbn,
    published_date,
    name
FROM
    books b
INNER JOIN publishers_2
    USING(publisher_id)
ORDER BY title;

-- books에서 카테고리 아이디 열 제거
ALTER TABLE books
DROP COLUMN category_id;

CREATE TABLE assets (
    id serial PRIMARY KEY,
    name TEXT NOT NULL,
    asset_no VARCHAR NOT NULL,
    description TEXT,
    location TEXT,
    acquired_date DATE NOT NULL
);
INSERT INTO assets(name,asset_no,location,acquired_date)
VALUES('Server','10001','Server room','2017-01-01'),
      ('UPS','10002','Server room','2017-01-01')
RETURNING *;

-- name을 varchar 타입으로 변경
ALTER TABLE assets
ALTER COLUMN name TYPE VARCHAR(255);

-- location과 description을 varchar 타입으로 변경
ALTER TABLE assets
    ALTER COLUMN location TYPE VARCHAR(255),
    ALTER COLUMN description TYPE VARCHAR(255);

-- asset_no를 int 타입으로 변경
-- 에러 발생 ERROR:  column "asset_no" cannot be cast automatically to type integer
-- HINT:  You might need to specify "USING asset_no::integer".
ALTER TABLE assets
ALTER COLUMN asset_no TYPE INT;

-- using으로 타입 캐스팅 해결
ALTER TABLE assets
ALTER COLUMN asset_no TYPE INT
USING asset_no::integer;