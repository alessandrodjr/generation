create database bd_ecommerce;

use bd_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255),
quantidade int,
valor decimal(8,2),
cor varchar(255),
primary key (id)
);

insert into tb_produtos (nome, quantidade, valor, cor) value("Bola", 347, 150.00, "Azul");
insert into tb_produtos (nome, quantidade, valor, cor) value("Chuteira", 500, 350.00, "Preta");
insert into tb_produtos (nome, quantidade, valor, cor) value("Bicicleta", 200, 1150.00, "Verde");
insert into tb_produtos (nome, quantidade, valor, cor) value("Tenis", 550, 550.00, "Azul");
insert into tb_produtos (nome, quantidade, valor, cor) value("Camiseta", 1000, 100.00, "Branca");
insert into tb_produtos (nome, quantidade, valor, cor) value("Shots", 800, 150.00, "Vermelho");
insert into tb_produtos (nome, quantidade, valor, cor) value("Meias", 900, 15.00, "Preta");
insert into tb_produtos (nome, quantidade, valor, cor) value("Garrafas", 450, 50.00, "Prata");

select * from tb_produtos;
select * from tb_produtos where valor >= 500;
select * from tb_produtos where valor < 500;

update tb_produtos set quantidade = 1200 where id = 1;