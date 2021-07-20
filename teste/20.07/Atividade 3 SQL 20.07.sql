create database bd_escola;

use bd_escola;

create table tb_alunos(
ra bigint auto_increment,
nome varchar(255),
idade int,
nota decimal(8,2),
nome_mae varchar(255),
primary key (ra)
);

insert into tb_alunos (nome, idade, nota, nome_mae) value("Alessandro Dias", 24, 8.0, "Marineuza");
insert into tb_alunos (nome, idade, nota, nome_mae) value("Lucas", 25, 3.0, "Luiza");
insert into tb_alunos (nome, idade, nota, nome_mae) value("Vitoria", 20, 7.0, "Marina");
insert into tb_alunos (nome, idade, nota, nome_mae) value("Renata", 22, 10.0, "Izabela");
insert into tb_alunos (nome, idade, nota, nome_mae) value("Andre", 18, 8.0, "Regina");
insert into tb_alunos (nome, idade, nota, nome_mae) value("João", 17, 10.0, "Elizabete");
insert into tb_alunos (nome, idade, nota, nome_mae) value("Roberta", 16, 4.0, "Leticia");
insert into tb_alunos (nome, idade, nota, nome_mae) value("Anderson", 15, 5.0, "Valeria");

select * from tb_alunos;
select * from tb_alunos where nota >= 7;
select * from tb_alunos where nota < 7;

update tb_alunos set nota = 10.0 where ra = 1;
select * from tb_alunos;