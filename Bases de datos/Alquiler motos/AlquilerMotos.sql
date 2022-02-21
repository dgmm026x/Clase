/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/
/*                                                                              */
/*             ACTIVIDAD BASE DE DATOS:                                         */
/*                 Base de datos de empresa de ALQUILER DE MOTOS                */
/*                                                                              */
/*                     Versión 20220204 (Primera entrega oficial)               */
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


/*DROP DATABASE agencia_motos;*/
CREATE DATABASE agencia_motos;
USE agencia_motos;/*Esta orden indica que se trabaja sobre esta base, por lo que ahorra tiempo y datos por indicar...*/


CREATE TABLE IF NOT EXISTS lista_telefonos
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    telefono BIGINT (14) /*Se consideran la existencia de tel. extranjeros...*/
);


CREATE TABLE IF NOT EXISTS lista_motocicletas
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    matricula_moto CHAR (8)
);


CREATE TABLE IF NOT EXISTS lista_agentes
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_agente INT
);



CREATE TABLE IF NOT EXISTS agencia
(
    nombre CHAR (16) PRIMARY KEY, /*Uso de "CHAR" para mayor velocidad de búsqueda...*/
    id_lista_agentes INT,
    id_lista_motos INT,
    id_lista_telefonos INT,
    nombre_ciudad CHAR (16),
    direccion VARCHAR (50)
);


CREATE TABLE IF NOT EXISTS ciudad
(
    nombre CHAR (16) PRIMARY KEY, /*Uso de "CHAR" para mayor velocidad de búsqueda...*/
    codigo_postal VARCHAR (50),
    poblacion INT
);


CREATE TABLE IF NOT EXISTS agente
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre_agencia CHAR (16),
    nombre VARCHAR (20),
    apellidos VARCHAR (40),
    dni CHAR (9),
    fecha_nacimiento DATETIME,
    direccion VARCHAR (50),
    telefono BIGINT (14),
    iban VARCHAR (40)
);


CREATE TABLE IF NOT EXISTS cliente
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (20),
    apellidos VARCHAR (40),
    dni CHAR (9),
    fecha_nacimiento DATETIME,
    direccion VARCHAR (50),
    telefono BIGINT (14), /*Se consideran la existencia de tel. extranjeros...*/
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);


CREATE TABLE IF NOT EXISTS motocicleta
(
    matricula CHAR (8) PRIMARY KEY, /*Uso de "CHAR" para mayor velocidad de búsqueda...*/
    nombre_garaje CHAR (16),
    numero_bastidor VARCHAR (30),
    marca VARCHAR (15),
    modelo VARCHAR (15),
    color VARCHAR (30),
    fecha_adquicision DATE,
    fecha_ult_guardado DATETIME
);


CREATE TABLE IF NOT EXISTS garaje
(
	nombre CHAR (16) PRIMARY KEY, /*Uso de "CHAR" para mayor velocidad de búsqueda...*/
    nombre_ciudad CHAR (16),
    direccion VARCHAR (50)
);


CREATE TABLE IF NOT EXISTS reserva
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    id_agente INT,
    matricula_moto CHAR (8),
    precio MEDIUMINT,/*Se considera precios no tan altos como para emplear "INTEGER"...*/
    fecha_reserva TIMESTAMP DEFAULT CURRENT_TIMESTAMP(),
    fecha_inicio DATETIME,
    fecha_fin DATETIME
);




/*------------------------------------------------------------------------------*/
/*      EDICIÓN DE TABLAS: CREACIÓN DE RELACIONES...                            */
/*------------------------------------------------------------------------------*/


ALTER TABLE agencia
    ADD FOREIGN KEY (id_lista_agentes) REFERENCES lista_agentes(id),
    ADD FOREIGN KEY (id_lista_motos) REFERENCES lista_motocicletas(id),
    ADD FOREIGN KEY (id_lista_telefonos) REFERENCES lista_telefonos(id),
    ADD FOREIGN KEY (nombre_ciudad) REFERENCES ciudad(nombre)
;


ALTER TABLE lista_agentes
    ADD FOREIGN KEY (id_agente) REFERENCES agente(id)
;


ALTER TABLE motocicleta
    ADD FOREIGN KEY (nombre_garaje) REFERENCES garaje(nombre)
;


ALTER TABLE lista_motocicletas
    ADD FOREIGN KEY (matricula_moto) REFERENCES motocicleta(matricula)
;


ALTER TABLE garaje
    ADD FOREIGN KEY (nombre_ciudad) REFERENCES ciudad(nombre)
;


ALTER TABLE reserva
    ADD FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    ADD FOREIGN KEY (id_agente) REFERENCES agente(id),
    ADD FOREIGN KEY (matricula_moto) REFERENCES motocicleta(matricula)
;



/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------*/