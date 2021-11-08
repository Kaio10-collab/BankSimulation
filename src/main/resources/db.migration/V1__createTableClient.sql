create table client(
id bigint primary key,
name varchar(100) not null,
cpf varchar(14)not null,
phone_number varchar(13) not null,
created_at timestamp
);