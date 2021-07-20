create database bd_rh;

use bd_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255),
idade int,
salario decimal(8,2),
cpf bigint,
primary key (id)
);

insert into tb_funcionarios (nome, idade, salario, cpf) value("Alessandro Dias", 24, 3000.00, 123456789000);
insert into tb_funcionarios (nome, idade, salario, cpf) value("Cristiano Ronaldo", 35, 2500.00, 123456746646);
insert into tb_funcionarios (nome, idade, salario, cpf) value("Leo Messi", 34, 2000.00, 123456703044);
insert into tb_funcionarios (nome, idade, salario, cpf) value("Naruto Uzumaki", 18, 1500.00, 123456789939);
insert into tb_funcionarios (nome, idade, salario, cpf) value("Michael Jakson", 50, 1000.00, 123456993933);

select * from tb_funcionarios;
select * from tb_funcionarios where salario >= 2000;
select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 5000.00 where id = 1;