create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert into tb_categoria (descricao, ativo) values ("Fron-End",true);
insert into tb_categoria (descricao, ativo) values ("Back-End",true);
insert into tb_categoria (descricao, ativo) values ("Banco de Dados",true);
insert into tb_categoria (descricao, ativo) values ("Manutenção",true);
insert into tb_categoria (descricao, ativo) values ("Redes",true);

select * from tb_categoria;

create table tb_curso  (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal(6,2) not null,
vagas int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_curso  (nome, preco, vagas, categoria_id) values ("Curso de HTML", 140.00, 300, 1);
insert into tb_curso  (nome, preco, vagas, categoria_id) values ("Curso de CSS", 170.00, 350, 1);
insert into tb_curso  (nome, preco, vagas, categoria_id) values ("Curso de Java", 240.00, 300, 2);
insert into tb_curso  (nome, preco, vagas, categoria_id) values ("Curso de MySQL", 220.00, 400, 3);
insert into tb_curso  (nome, preco, vagas, categoria_id) values ("Curso de Montagem de Máquina", 330.00, 300, 4);
insert into tb_curso  (nome, preco, vagas, categoria_id) values ("Curso de JavaScript", 360.00, 300, 1);
insert into tb_curso  (nome, preco, vagas, categoria_id) values ("Curso de Conf. Swite", 240.00, 300, 5);
insert into tb_curso  (nome, preco, vagas, categoria_id) values ("Curso de C#", 190.00, 300, 2);

select * from tb_curso  where preco > 250;
select * from tb_curso  where preco between 200 and 360;
select * from tb_curso  where nome like "%j%";

select tb_curso.nome, tb_curso.preco, tb_curso.vagas, tb_categoria.descricao as Categoria
from tb_curso  inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;

select tb_curso.nome, tb_curso.preco, tb_curso.vagas, tb_categoria.descricao as Categoria
from tb_curso  inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id
where tb_categoria.descricao = "Back-End";




