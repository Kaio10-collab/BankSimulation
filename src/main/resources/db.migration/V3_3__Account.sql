create table account(
id BIGSERIAL not null primary key,
accountNumber bigint not null,
type_account varchar(50),
balanceMoney bigint not null,
client_cpf bigint not null,
created_at timestamp
);