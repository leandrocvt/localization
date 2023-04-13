create table tb_city (
    id_city bigint not null primary key,
    name varchar(50) not null,
    population bigint
);

insert into tb_city
    (id_city, name, population)
values
    (1, 'São Paulo', 12396372),
    (2, 'Rio de Janeiro', 13513231);