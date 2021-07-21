create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
tamanho varchar(255) not null,
primary key (id)
);

insert into tb_categoria (tipo, tamanho) values ("Salgada","Grande");
insert into tb_categoria (tipo, tamanho) values ("Salgada","Media");
insert into tb_categoria (tipo, tamanho) values ("Salgada","Pequena");
insert into tb_categoria (tipo, tamanho) values ("Doce","Grande");
insert into tb_categoria (tipo, tamanho) values ("Doce","Media");
insert into tb_categoria (tipo, tamanho) values ("Doce","Pequena");


select * from tb_categoria;

create table tb_pizza (
id bigint auto_increment,
nome varchar (255) not null,
descricao varchar (255),
bordas varchar (255),
preco decimal(8,2),
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_pizza (nome, descricao, bordas, preco, categoria_id) values ("Napolitana", "Queijo e tomate", "Chedar", 45.00, 1);
insert into tb_pizza (nome, descricao, bordas, preco, categoria_id) values ("Portuguesa", "Queijo tomate e manjerição", "Chedar", 55.00, 3);
insert into tb_pizza (nome, descricao, bordas, preco, categoria_id) values ("Frango", "Frango com catupiry", "Queijo", 65.00, 2);
insert into tb_pizza (nome, descricao, bordas, preco, categoria_id) values ("Banana", "Banana e chocolate", "doce de leite", 40.00, 4);
insert into tb_pizza (nome, descricao, bordas, preco, categoria_id) values ("Carne Seca", "Carne seca com queijo", "Catupiry", 60.00, 1);
insert into tb_pizza (nome, descricao, bordas, preco, categoria_id) values ("Morango", "Morando com chocolate", "doce de leite", 38.00, 5);
insert into tb_pizza (nome, descricao, bordas, preco, categoria_id) values ("Brigadeiro", "Brigadeiro com leite ninho", "doce de leite", 30.00, 6);
insert into tb_pizza (nome, descricao, bordas, preco, categoria_id) values ("Quadro Queijos", "Quatro queijos diferentes e tomate", "Chedar", 45.00, 1);


select * From tb_pizza;
select * from tb_pizza where preco > 45.00;
select * from tb_pizza where preco between 29 and 60;
select * from tb_pizza where nome like "B%";

select tb_pizza.nome, tb_pizza.descricao, tb_pizza.preco, tb_categoria.tipo, tb_categoria.tamanho 
from tb_pizza inner join tb_categoria on tb_pizza.categoria_id = tb_categoria.id;

select tb_pizza.nome, tb_pizza.descricao, tb_pizza.preco, tb_categoria.tipo, tb_categoria.tamanho 
from tb_pizza inner join tb_categoria on tb_pizza.categoria_id = tb_categoria.id where tb_categoria.tipo = "Doce";