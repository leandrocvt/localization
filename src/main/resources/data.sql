create table tb_city (
    id_city bigint not null primary key,
    name varchar(50) not null,
    population bigint
);

insert into tb_city
    (id_city, name, population)
values
    (1, 'São Paulo', 12396372),
    (2, 'Rio de Janeiro', 13513231),
    (3, 'Fortaleza', 400000),
    (4, 'Salvador', 500000),
    (5, 'Belo Horizonte', 900000),
    (6, 'Palmas', 800000),
    (7, 'Recife', 6786968),
    (8, 'Porto Alegre', 797897),
    (9, 'Porto Velho', 454646)
;