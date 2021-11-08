create table client(
id bigint primary key,
name varchar(100) not null,
cpf varchar(14)not null,
phone_number varchar(13) not null,
address varchar(20) foreign key postal_code,
account bigint foreign key number_account,
created_at timestamp
);