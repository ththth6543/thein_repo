select current_database();

--t라는 이름의 테이블 생성
create table t(
message text
);

select * from t;

--input date into table t
insert into t(message)
values('the rents are now 10% higher than last month'),
('the new film will have _ in the title');

select * from t
where message like '%10%%' escape '$';

--null: null과 값을 비교하면 항상 널이 반환
select null = null as result

-- is null
select address, address2
from address
where address2 is null;

--is not null
select address, address2
from address
where address2 is not null;

select * from address;

