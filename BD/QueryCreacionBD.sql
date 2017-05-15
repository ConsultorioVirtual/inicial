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

/*Nuevo codigo*/
create table consulta(
	id_consulta int primary key auto_increment,
    fecha date,
    hora varchar(5),
    motivo_consulta varchar(100),
    sintomas varchar(100),
    aparatos_sistemas varchar(200),
    peso float,
    talla int,
    frecuencia_resp varchar(20),
    presion_arterial varchar(20),
    temperatura varchar(10),
    frecuencia_cardiaca varchar(20),
    oximetria varchar(45),
    exploracion_fisica varchar(100),
    estudios_labooratorio varchar(45),
    diagnostico varchar(100),
    terapeutica varchar(45),
    tratamiento varchar(45),
    doctor_id int,
    foreign key(doctor_id) references doctor(id_doctor)
);

create table medicamentos(
	id_medicamento int primary key auto_increment,
    medicamento varchar(45),
    presentacion varchar(45),
    nombre_comercial varchar(45),
    categoria varchar(45)
);

create table expediente(
	id_expediente int primary key auto_increment,
    parto varchar(2),
    cesarea varchar(2),
    no_gestacion int,
    edad_gestacion int,
    peso_nacer float,
    talla int,
    sitio_atencion_parto varchar(100),
    cefalico float,
    torcico float,
    abdominal float,
    apagar_s int,
    silverman int,
    ballard int,
    complicaciones varchar(200),
    anestesia_bol varchar(2),
    especifique_anestesia varchar(100),
    apnea_neonatal varchar(2),
    hemorragias varchar(2),
    convulsiones varchar(2),
    cianosis varchar(2),
    ictericia varchar(2),
    observaciones varchar(200),
    resumen varchar(300),
    paciente_id int,
    foreign key (paciente_id)references paciente(id_paciente)
);

create table exploracion_fisica
(
	abdomen varchar(150),
    cabeza varchar(150),
    cuello varchar(150),
    columna_vertebral varchar(150),
    exploracion_ginecologica varchar(150),
    exploracion_neurologica varchar(150),
    extremidades varchar(150),
    genitales varchar(150),
    habitos_experior varchar(150),
    torax varchar(150),
    resumen varchar(300),
    expediente_id int,
    foreign key(expediente_id) references expediente(id_expediente)
);

create table obstetricos(
	expediente_id int,
    F_D_P date,
    G int,
    A INT,
    P INT,
    C INT,
    nacidos_vivos int,
    nacidos_muertos int,
    viven int,
    muerto_semana1 int,
    muerto_despues int,
    intergencia varchar(2),
    parto_prematuro varchar(2),
    malformaciones varchar(2),
    isoinmunizacion varchar(2),
    atencion_prenatal varchar(2),
    no_consultas int,
    medicacion_gestacional varchar(100),
    examenes_complementarios varchar(100),
    observaciones varchar (150),
    resumen varchar(150),
    foreign key(expediente_id) references expediente(id_expediente)
);

create table ginecologicos(
	expediente_id int,
    menarca int,
    menopausia int,
    formula_mentrual varchar(5),
    f_u_m date,
    f_u_m_citologia date,
    ateracion_m_frecuencia varchar(45),
    ateracion_m_duracion varchar(45),
    ateracion_m_cantidad float,
    inicio_vida_sexual int,
    no_parejas int,
    tipo_anticoncepcion varchar(45),
    inicio_anticoncepcion date,
    suspencion_anticoncepcion date,
    observaciones varchar(100),
    resumen varchar(200),
    foreign key(expediente_id) references expediente(id_expediente)
);

create table interrogatorio
(
	expediente_id int,
	cardiovascular varchar(45),
    digestivo varchar(45),
    endocrino varchar(45),
    hemolintactico varchar(45),
    musculo_esqueletico varchar(45),
    piel_anexos varchar(45),
    reproductor varchar(45),
    respiracion varchar(45),
    sistema_nervioso varchar(45),
    sistemas_generales varchar(45),
    urinario varchar(45),
    resumen varchar(200),
     foreign key(expediente_id) references expediente(id_expediente)
);








