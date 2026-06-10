-- create table
create table teams(
	id int primary key,
	team varchar(100) not null,
	city varchar(100) not null
);

select  * from teams;

--player table
create table players(
	id int primary key,
	team_id int references teams(id),
	player varchar(100) not null,
	role varchar(100) not null
);

select * from players;

-- insert teams
insert into teams(id, team, city)
values(1, 'Lions', 'Rome'),
(2, 'Owls', 'Oslo');

insert into teams(id, team, city)
values(3, 'Bears', 'Bern'),
(4, 'Sharks', 'Lima');

INSERT INTO players (id, team_id, player, role)
VALUES
    (1, 1, 'Ava', 'Guard'),
    (2, 1, 'Noah', 'Wing'),
    (3, 2, 'Emma', 'Back'),
    (4, NULL, 'Liam', 'Guard'),
    (5, NULL, 'Mia', 'Wing');


-- inner join
SELECT
    teams.id AS team_id,
    team,
    city,
    players.id AS player_id,
    player,
    players."role"
FROM
    teams
inner JOIN players
    ON teams.id = players.team_id;

-- left join 왼쪽 테이블 데이터는 전부 가져오고 오른쪽 테이블에서는 매칭되는 정보만 가져옴
SELECT
    teams.id AS team_id,
    team,
    city,
    players.id AS player_id,
    player,
    players."role"
FROM
    players
left JOIN teams
    ON teams.id = players.team_id;

-- right join 오른쪽 테이블 데이터는 전부 가져오고 왼쪽 테이블에서는 매칭되는 정보만 가져옴
SELECT
    teams.id AS team_id,
    team,
    city,
    players.id AS player_id,
    player,
    players."role"
FROM
    teams
right JOIN players
    ON teams.id = players.team_id;

-- full outer join 두 테이블의 모든 데이터를 합쳐서 가져옴
SELECT
    teams.id AS team_id,
    team,
    city,
    players.id AS player_id,
    player,
    players."role"
FROM
    teams
full outer JOIN players
    ON teams.id = players.team_id;

-- full join: full outer join과 같음
SELECT
    teams.id AS team_id,
    team,
    city,
    players.id AS player_id,
    player,
    role
FROM
    teams
FULL JOIN players
   ON teams.id = players.team_id;
--WHERE teams.id IS NULL OR players.id IS NULL;

