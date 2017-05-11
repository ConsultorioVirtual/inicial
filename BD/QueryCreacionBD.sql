CREATE DATABASE dbconsultorio;
USE dbconsultorio;


CREATE TABLE usuarios(
	id_usuario int,
    tipo_usuario VARCHAR(100),
    nombre VARCHAR(100),
    segundo_nombre VARCHAR(100),
    apellido_paterno VARCHAR(100),
    apellido_materno VARCHAR(100),
    contraseña VARCHAR(100),
    primary key(id_usuario)
);

create table recepcionista(
	id_recepcionista int,
    domicilio varchar(100),
    cuidad varchar(45),
    estado varchar(45),
    codigo_postal varchar(45),
    tel_domicilio varchar(10),
    tel_oficina varchar(10),
    tel_movil varchar(10),
    tel_extra varchar(10),
    correo_electronico varchar(100),
    id_usuario int,
    primary key(id_recepcionista),
	foreign key (id_usuario) references usuarios (id_usuario)
);


create table doctor(
	id_usuario int,
    id_doctor int,
    domicilio varchar(100),
    ciudad varchar(45),
    estado varchar(45),
    codigo_postal varchar(5),
    tel_domicilio varchar(10),
    tel_oficina varchar(10),
    tel_movil varchar(10),
    tel_extra varchar(10),
    correo_electronico varchar(100),
    cedula_profecional varchar(50),
    especialidad varchar(45),
    observaciones varchar(200),
    primary key (id_doctor),
    foreign key (id_usuario) references usuarios(id_usuario)
);

create table paciente(
	id_paciente int,
    nombre VARCHAR(45),
    segundo_nombre VARCHAR(45),
    apellido_paterno VARCHAR(45),
    apellido_materno VARCHAR(45),
    domicilio varchar(100),
    ciudad varchar(45),
    estado varchar(45),
    codigo_postal varchar(6),
    tel_domicilio varchar(10),
    tel_oficina varchar(10),
    correo_electronico varchar(100),
    sexo varchar(6),
    derechohabiente varchar(45),
    lugar_nacimiento varchar(45),
    fecha_nacimiento date,
    edad int,
    rfc varchar(12),
    estado_civil varchar(15),
    nombre_madre varchar(45),
    nombre_padre varchar(45),
    nombre_pareja varchar(45),
    procedencia varchar(45),
    ocupacion varchar(45),
    escolaridad varchar(45),
    observaciones varchar(400),
    id_doctor int,
    primary key(id_paciente),
    foreign key (id_doctor) references doctor(id_doctor)
);

create table citas(
	id_citas int,
    fecha date,
    hora varchar(5),
    estado boolean,
    id_paciente int,
    id_doctor int,
    primary key(id_citas),
    foreign key (id_doctor) references doctor(id_doctor),
    foreign key (id_paciente) references paciente(id_paciente)
);
insert into citas 
values ('2017-4-04','10:30','Rodrigo Gomez','Eduardo Velazco',0),
	   ('2017-4-04','13:30','Natalia Perez','Eduardo Velazco',1),
	   ('2017-4-04','14:30','Alejandra Ramirez','Eduardo Velazco',1),
	   ('2017-4-04','15:00','Diego Mayorquin','Eduardo Velazco',1),
	   ('2017-4-04','15:30','Axel Aguirre','Eduardo Velazco',1),
	   ('2017-4-04','16:00','Elizabeth Flores','Eduardo Velazco',1),
	   ('2017-4-04','16:30','Margarita Garcia','Eduardo Velazco',0);

insert into citas 
values ('2017-4-05','10:30','Rodrigo Gomez','Eduardo Velazco',1),
	   ('2017-4-05','13:30','Natalia Perez','Eduardo Velazco',1),
	   ('2017-4-05','14:30','Alejandra Ramirez','Eduardo Velazco',1),
	   ('2017-4-05','15:00','Diego Mayorquin','Eduardo Velazco',1),
	   ('2017-4-05','15:30','Axel Aguirre','Eduardo Velazco',1),
	   ('2017-4-05','16:00','Elizabeth Flores','Eduardo Velazco',1),
	   ('2017-4-05','16:30','Margarita Garcia','Eduardo Velazco',1);
       
insert into citas 
values ('2017-4-09','19:30','Rodrigo Gomez','Eduardo Velazco',1),
	   ('2017-4-09','10:30','Natalia Perez','Eduardo Velazco',1),
	   ('2017-4-09','13:30','Alejandra Ramirez','Eduardo Velazco',1),
	   ('2017-4-09','16:00','Diego Mayorquin','Eduardo Velazco',1),
	   ('2017-4-09','15:30','Axel Aguirre','Eduardo Velazco',1),
	   ('2017-4-09','14:00','Elizabeth Flores','Eduardo Velazco',1),
	   ('2017-4-09','11:30','Margarita Garcia','Eduardo Velazco',1);


/*aaaa-mm-dd*/
select * from usuarios;

select hora, paciente, fecha, doctor from citas
WHERE fecha= '2017-04-09' and estado = 1
ORDER BY hora;


delete from citas;
delete FROM usuarios;

drop table citas;
SET SQL_SAFE_UPDATES = 0;
