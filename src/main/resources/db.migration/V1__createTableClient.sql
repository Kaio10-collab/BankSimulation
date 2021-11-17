create table client(
id bigint primary key,
name varchar(100) not null,
cpf varchar(14)not null,
phone_number varchar(14) not null,
postal_code varchar(09) not null,
street varchar(150) not null,
state varchar(20) not null,
city varchar(30) not null,
country varchar(50) not null,
created_at timestamp
);