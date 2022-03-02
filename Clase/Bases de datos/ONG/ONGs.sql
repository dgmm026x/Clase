/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/
/*                                                                              */
/*             ACTIVIDAD BASE DE DATOS:                                         */
/*                 Base de datos de gestión de ONGs                             */
/*                                                                              */
/*                     Versión 20220227 (Primera entrega oficial)               */
/*                                                                              */
/*                                                                              */
/*                                                                              */
/*             Daniel García Menéndez    1º D.A.M. (2021 - 2022)                */
/*                                                                              */
/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/




/*------------------------------------------------------------------------------*/
/*      CREACIÓN DE BASE Y TABLAS...                                            */
/*------------------------------------------------------------------------------*/


/*DROP DATABASE multi_ongs;*/
CREATE DATABASE multi_ongs;
USE multi_ongs;/*Esta orden indica que se trabaja sobre esta base, por lo que ahorra tiempo y datos por indicar...*/


CREATE TABLE IF NOT EXISTS socios
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_lista_ongs INT,/*CLAVE FORANEA*/
    nombre VARCHAR (20),
    apellidos VARCHAR (35),
    nif CHAR (9),
    fecha_nacimiento TIME,
    telefono BIGINT,
    correo_electronico VARCHAR (40),
    tipo_colaboracion VARCHAR (10),
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);


CREATE TABLE IF NOT EXISTS listas_registros_ongs
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_socio INT,/*CLAVE FORANEA*/
    id_ong TINYINT/*CLAVE FORANEA*/
);


CREATE TABLE IF NOT EXISTS trabajadores
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_lista_trabajadores INT,/*CLAVE FORANEA*/
    nombre VARCHAR (20),
    apellidos VARCHAR (35),
    nif CHAR (9),
    fecha_nacimiento TIME,
    telefono BIGINT,
    correo_electronico VARCHAR (40),
    iban VARCHAR (40),
    neto_anual SMALLINT,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);


CREATE TABLE IF NOT EXISTS listas_trabajadores
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_ong TINYINT,/*CLAVE FORANEA*/
    id_trabajador INT/*CLAVE FORANEA*/
);


CREATE TABLE IF NOT EXISTS personal_apoyo
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_lista_apoyo INT,/*CLAVE FORANEA*/
    nombre VARCHAR (20),
    apellidos VARCHAR (35),
    nif CHAR (9),
    fecha_nacimiento TIME,
    telefono BIGINT,
    correo_electronico VARCHAR (40),
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);


CREATE TABLE IF NOT EXISTS listas_personal_apoyo
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_personal_apoyo INT,/*CLAVE FORANEA*/
    id_agencia0 TINYINT,
    id_agencia1 TINYINT,
    id_agencia2 TINYINT,
    id_agencia3 TINYINT,
    id_agencia4 TINYINT
);


CREATE TABLE IF NOT EXISTS presidentes
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_ong TINYINT,/*CLAVE FORANEA*/
    id_lista_presidentes INT,/*CLAVE FORANEA*/
    nombre VARCHAR (20),
    apellidos VARCHAR (35),
    nif CHAR (9),
    fecha_nacimiento TIME,
    telefono BIGINT,
    correo_electronico VARCHAR (40),
    fecha_inicio_puesto DATETIME,
    fecha_fin_puesto DATETIME,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);


CREATE TABLE IF NOT EXISTS listas_presidentes
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_presidente INT,/*CLAVE FORANEA*/
    id_ong TINYINT,/*CLAVE FORANEA*/
    fecha_inicio_puesto DATETIME,
    fecha_fin_puesto DATETIME
);





CREATE TABLE IF NOT EXISTS ongs
(
    id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_presidente INT,/*CLAVE FORANEA*/
    id_lista_presidentes INT,/*CLAVE FORANEA*/
    id_lista_trabajadores INT,/*CLAVE FORANEA*/
    id_lista_personal_apoyo INT,/*CLAVE FORANEA*/
    id_lista_eventos INT,/*CLAVE FORANEA*/
    direccion VARCHAR (60),
    telefono BIGINT,
    area_accion VARCHAR (40),
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);





CREATE TABLE IF NOT EXISTS eventos
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_ong TINYINT,/*CLAVE FORANEA*/
    id_presidente INT,/*CLAVE FORANEA*/
    id_socio_coordinador INT,/*CLAVE FORANEA*/
    id_lista_participantes INT,/*CLAVE FORANEA*/
    id_lista_seguros INT,/*CLAVE FORANEA*/
    nombre_evento VARCHAR (30),
    fecha_evento DATETIME,
    direccion VARCHAR (60),
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);


CREATE TABLE IF NOT EXISTS listas_eventos
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_evento INT,/*CLAVE FORANEA*/
    nombre_evento VARCHAR (30),
    fecha_evento DATETIME
);


CREATE TABLE IF NOT EXISTS listas_socios_participantes
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_socio INT,/*CLAVE FORANEA*/
    id_ong_representada TINYINT/*CLAVE FORANEA*/
);


CREATE TABLE IF NOT EXISTS agencias_seguros
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_lista_agencias INT,/*CLAVE FORANEA*/
    nombre_empresa VARCHAR(25),
    presupuesto INT,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);


CREATE TABLE IF NOT EXISTS listas_agencias_seguros
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_agencia_seguros INT,/*CLAVE FORANEA*/
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);


/*------------------------------------------------------------------------------*/
/*      EDICIÓN DE TABLAS: CREACIÓN DE RELACIONES...                            */
/*------------------------------------------------------------------------------*/


ALTER TABLE socios
	ADD FOREIGN KEY (id_lista_ongs) REFERENCES listas_registros_ongs(id)
;


ALTER TABLE listas_registros_ongs
	ADD FOREIGN KEY (id_socio) REFERENCES socios(id),
	ADD FOREIGN KEY (id_ong) REFERENCES ongs(id)
;


ALTER TABLE trabajadores
	ADD FOREIGN KEY (id_lista_trabajadores) REFERENCES listas_trabajadores(id)
;


ALTER TABLE listas_trabajadores
	ADD FOREIGN KEY (id_ong) REFERENCES ongs(id),
	ADD FOREIGN KEY (id_trabajador) REFERENCES trabajadores(id)
;


ALTER TABLE personal_apoyo
	ADD FOREIGN KEY (id_lista_apoyo) REFERENCES listas_personal_apoyo(id)
;


ALTER TABLE listas_personal_apoyo
	ADD FOREIGN KEY (id_personal_apoyo) REFERENCES personal_apoyo(id)
;


ALTER TABLE presidentes
	ADD FOREIGN KEY (id_ong) REFERENCES ongs(id),
	ADD FOREIGN KEY (id_lista_presidentes) REFERENCES listas_presidentes(id)
;


ALTER TABLE listas_presidentes
	ADD FOREIGN KEY (id_presidente) REFERENCES presidentes(id),
	ADD FOREIGN KEY (id_ong) REFERENCES ongs(id)
;


ALTER TABLE ongs
	ADD FOREIGN KEY (id_presidente) REFERENCES presidentes(id),
	ADD FOREIGN KEY (id_lista_presidentes) REFERENCES listas_presidentes(id),
	ADD FOREIGN KEY (id_lista_trabajadores) REFERENCES listas_trabajadores(id),
	ADD FOREIGN KEY (id_lista_personal_apoyo) REFERENCES listas_personal_apoyo(id),
	ADD FOREIGN KEY (id_lista_eventos) REFERENCES eventos(id)
;


ALTER TABLE eventos
	ADD FOREIGN KEY (id_ong) REFERENCES ongs(id),
	ADD FOREIGN KEY (id_presidente) REFERENCES presidentes(id),
	ADD FOREIGN KEY (id_socio_coordinador) REFERENCES socios(id),
	ADD FOREIGN KEY (id_lista_participantes) REFERENCES listas_socios_participantes(id),
	ADD FOREIGN KEY (id_lista_seguros) REFERENCES listas_agencias_seguros(id)
;


ALTER TABLE listas_eventos
	ADD FOREIGN KEY (id_evento) REFERENCES eventos(id)
;


ALTER TABLE listas_socios_participantes
	ADD FOREIGN KEY (id_socio) REFERENCES socios(id),
	ADD FOREIGN KEY (id_ong_representada) REFERENCES ongs(id)
;


ALTER TABLE agencias_seguros
	ADD FOREIGN KEY (id_lista_agencias) REFERENCES listas_agencias_seguros(id)
;


ALTER TABLE listas_agencias_seguros
	ADD FOREIGN KEY (id_agencia_seguros) REFERENCES agencias_seguros(id)
;


/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/