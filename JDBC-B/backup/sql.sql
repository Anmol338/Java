create database groupa;
use groupa;
create table persons(
	pid int(11) primary key,
    fullName varchar(50) not null,
    contactAddress varchar(50) not null
);


create table users(
	uid int(11) primary key,
    fullName varchar(50) not null,
    loginName varchar(50) not null unique key,
    loginPassword varchar(50) not null,
    userRole varchar(50) not null
);

show tables;
desc users;

insert into users values(1, 'Dipesh Bhattarai','dipesh', 'dipesh','manager');
insert into users values(2, 'Sushil Makaju','sushil', 'sushil','staff');
insert into users values(3, 'Pratik Subedi','pratik', 'pratik','customer');
insert into users values(4, 'Sashi Sharma','sashi', 'sashi','corpcustomer');

select * from users;

select * from users where loginName='dipesh' and loginPassword='dipesh';


create database groupb;
use groupb;
create table persons(
	pid int(11) primary key,
    fullName varchar(50) not null,
    contactAddress varchar(50) not null
);