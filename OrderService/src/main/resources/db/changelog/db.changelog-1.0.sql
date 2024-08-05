-- liquibase formatted sql

--changeset roman_gurinovich:1
create table orders(
    id bigserial primary key,
    order_state int not null default 0,
    sum_price real not null default 0,
    user_id bigint not null
);
