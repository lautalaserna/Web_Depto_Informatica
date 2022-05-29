-- CREATE TABLES --

CREATE TABLE areas
(
    id_area INT(6) NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(50) NOT NULL,
    url VARCHAR(255),
    
    PRIMARY KEY (id_area)
);

CREATE TABLE asignaturas
(
    id_asignatura INT(6) NOT NULL AUTO_INCREMENT,
    codigo INT(6) NOT NULL,
    titulo VARCHAR(50),
    id_area INT(6) NOT NULL,
    creditos_grado INT(6) NOT NULL,
    cant_alumnos INT(6) NOT NULL,
    url VARCHAR(255),

    PRIMARY KEY (id_asignatura),
    FOREIGN KEY (id_area) REFERENCES areas(id_area)
);

CREATE TABLE tipo_carrera
(
    id_tipo_carrera INT(6) NOT NULL AUTO_INCREMENT,
    url VARCHAR(255),

    PRIMARY KEY (id_tipo_carrera)
);

CREATE TABLE carreras
(
    id_carrera INT(6) NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(50) NOT NULL,
    id_tipo_carrera INT(6) NOT NULL,
    url VARCHAR(255),

    PRIMARY KEY (id_carrera),
    FOREIGN KEY (id_tipo_carrera) REFERENCES tipo_carrera(id_tipo_carrera)
);

CREATE TABLE plan_estudio
(
    id_plan_estudio INT(6) NOT NULL AUTO_INCREMENT,
    id_carrera INT(6) NOT NULL,
    id_asignatura INT(6) NOT NULL,
    anio  INT(4) NOT NULL,
    cuatrimestre INT(1) NOT NULL,
    url VARCHAR(255),

    PRIMARY KEY (id_plan_estudio),
    FOREIGN KEY (id_carrera) REFERENCES carreras(id_carrera),
    FOREIGN KEY (id_asignatura) REFERENCES asignaturas(id_asignatura)
);

CREATE TABLE optativas
(
    id_optativa INT(6) NOT NULL AUTO_INCREMENT,
    id_plan_estudio INT(6) NOT NULL,
    id_asignatura INT(6) NOT NULL,
    cuatrimestre INT(1) NOT NULL,
    url VARCHAR(255),

    PRIMARY KEY (id_optativa),
    FOREIGN KEY (id_plan_estudio) REFERENCES plan_estudio(id_plan_estudio),
    FOREIGN KEY (id_asignatura) REFERENCES asignaturas(id_asignatura)
);

CREATE TABLE correlativas
(
    id_correlativa INT(6) NOT NULL AUTO_INCREMENT,
    id_asignatura_principal INT(6) NOT NULL,
    id_asignatura_correlativa INT(6) NOT NULL,
    url VARCHAR(255),

    PRIMARY KEY (id_correlativa),
    FOREIGN KEY (id_asignatura_principal) REFERENCES asignaturas(id_asignatura),
    FOREIGN KEY (id_asignatura_correlativa) REFERENCES asignaturas(id_asignatura)
);

CREATE TABLE tipo_cargo
(
    id_tipo_cargo INT(6) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(60) NOT NULL,

    PRIMARY KEY (id_tipo_cargo)
);

CREATE TABLE docentes
(
    id_docente INT(6) NOT NULL AUTO_INCREMENT,
    nombre_completo VARCHAR(60) NOT NULL,
    dni VARCHAR(8),
    email VARCHAR(60),
    titulo VARCHAR(60),
    img_url VARCHAR(255),
    url VARCHAR(255),

    PRIMARY KEY (id_docente)
);

CREATE TABLE dedicacion
(
    id_dedicacion INT(6) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(60) NOT NULL,

    PRIMARY KEY (id_dedicacion)
);

CREATE TABLE cargos
(
    id_cargo INT(6) NOT NULL AUTO_INCREMENT,
    id_asignatura INT(6) NOT NULL,
    id_tipo_cargo INT(6) NOT NULL,
    id_dedicacion INT(6) NOT NULL,
    id_docente INT(6) NOT NULL,
    clasificacion VARCHAR(1) NOT NULL,
    
    PRIMARY KEY (id_cargo),
    FOREIGN KEY (id_asignatura) REFERENCES asignaturas(id_asignatura),
    FOREIGN KEY (id_tipo_cargo) REFERENCES tipo_cargo(id_tipo_cargo),
    FOREIGN KEY (id_dedicacion) REFERENCES dedicacion(id_dedicacion),
    FOREIGN KEY (id_docente) REFERENCES docentes(id_docente)
);

CREATE TABLE autoridades
(
    id_autoridad INT(6) NOT NULL AUTO_INCREMENT,
    director VARCHAR(64),
    vicedirector VARCHAR(64),
    url VARCHAR(255),
    
    PRIMARY KEY (id_autoridad)
);

CREATE TABLE consejo_departamental
(
    id_consejo_departamental INT(6) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(64),
    tipo CHAR,
    url VARCHAR(255),

    PRIMARY KEY (id_consejo_departamental)
);


CREATE TABLE consejo_alumnos
(
    id_consejo_alumnos INT(6) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(64),
    tipo CHAR,
	url VARCHAR(255),

    PRIMARY KEY (id_consejo_alumnos)
);


CREATE TABLE calendario_academico
(
    id_calendario_academico INT(6) NOT NULL AUTO_INCREMENT,
    fechaInicio DATE,
    fechaFin DATE,
	concepto VARCHAR(255),
	url VARCHAR(255),

    PRIMARY KEY (id_calendario_academico)
);


CREATE TABLE investigacion
(
    id_investigacion INT(6) NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255),
    integrantes VARCHAR(255),
	objetivo VARCHAR(255),
	url VARCHAR(255),

    PRIMARY KEY (id_investigacion)
);


CREATE TABLE elecciones
(
    id_eleccion INT(6) NOT NULL AUTO_INCREMENT,
    postulante VARCHAR(64),
    dni VARCHAR(10),
	votos INT(6) NOT NULL,
	url VARCHAR(255),

    PRIMARY KEY (id_eleccion)
);


CREATE TABLE trabajos_finales
(
    id_trabajo_final INT(6) NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255),
    estudiantes VARCHAR(255),
	demandante VARCHAR(255),
	directores VARCHAR(255),
	is_concluido CHAR,
	url VARCHAR(255),

    PRIMARY KEY (id_trabajo_final)
);

CREATE TABLE pps
(
    id_pps INT(6) NOT NULL AUTO_INCREMENT,
    entidad VARCHAR(255),
    objetivo VARCHAR(255),
    fechaInicio DATE,
    fechaFin DATE,
    presupuesto FLOAT,
    is_contratacion CHAR,
    estado CHAR,
    url VARCHAR(255),

    PRIMARY KEY (id_pps)
);

CREATE TABLE pps_tomada
(
    id_pps_tomada INT(6) NOT NULL AUTO_INCREMENT,
    id_pps INT(6),
    alumno VARCHAR(255),
	tutor VARCHAR(255),
	lugar VARCHAR(255),
	is_pdts CHAR,
	is_pps CHAR,
	is_psc CHAR,
	url VARCHAR(255),

    PRIMARY KEY (id_pps_tomada),
    FOREIGN KEY (id_pps) REFERENCES pps(id_pps)
);

CREATE TABLE novedades
(
    id_novedad INT(6) NOT NULL AUTO_INCREMENT,
   	fecha DATE,
	imgurl VARCHAR(255),
	titulo VARCHAR(255),
   	info VARCHAR(255),
	contenido VARCHAR(4096),
	url VARCHAR(255),

    PRIMARY KEY (id_novedad)
);


CREATE TABLE bolsa_trabajo
(
    id_bolsa_trabajo INT(6) NOT NULL AUTO_INCREMENT,
   	fecha DATE,
	imgurl VARCHAR(255),
	titulo VARCHAR(255),
   	info VARCHAR(255),
	contenido VARCHAR(4096),
	url VARCHAR(255),

   	PRIMARY KEY (id_bolsa_trabajo)
);

create table graduados(
	id_graduado INT(6) NOT NULL AUTO_INCREMENT,
	nombre_completo VARCHAR(64),
	url VARCHAR(255),
	PRIMARY KEY (id_graduado)
);
