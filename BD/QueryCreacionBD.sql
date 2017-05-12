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
    ciudad varchar(45),
    estado varchar(45),
    codigo_postal varchar(45),
    tel_domicilio varchar(15),
    tel_oficina varchar(15),
    tel_movil varchar(15),
    tel_extra varchar(15),
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
    codigo_postal varchar(10),
    tel_domicilio varchar(15),
    tel_oficina varchar(15),
    tel_movil varchar(15),
    tel_extra varchar(15),
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

create table detalle_doctor(
	id_usuario int,
    id_doctor int,
    nombre VARCHAR(100),
    segundo_nombre VARCHAR(100),
    apellido_paterno VARCHAR(100),
    apellido_materno VARCHAR(100)
);

SET SQL_SAFE_UPDATES = 0;

update recepcionista
set domicilio = '@domicilio',
    ciudad = '@ciudad',
    estado = '@estado',
    codigo_postal = '@codigo_postal',
    tel_domicilio = '@tel_domicilio',
    tel_oficina = '@tel_oficina',
    tel_movil = '@tel_movil',
    tel_extra = '@tel_extra',
    correo_electronico = '@correo_electronico'
where id_usuario = '@id_usuario';


drop database dbconsultorio;












