create table client(
postalCode varchar(11) not null primary key,
street varchar(150) not null,
state varchar(20) not null,
city varchar(30) not null,
country varchar(50) not null,
created_at timestamp
);