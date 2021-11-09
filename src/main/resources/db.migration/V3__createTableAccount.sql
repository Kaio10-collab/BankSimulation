create table account(
number_account bigint primary key not null,
balance decimal(4,2) not null,
type_account varchar (20) not null,
created_at timestamp
);