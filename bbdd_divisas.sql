DROP DATABASE if EXISTS bbdd_divisas;
CREATE DATABASE bbdd_divisas;

USE bbdd_divisas;

DROP TABLE if EXISTS divisas;
CREATE TABLE if NOT EXISTS divisas (
	
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(12) NOT NULL,
	valor FLOAT NOT NULL
);

INSERT INTO divisas (nombre, valor) VALUES ('EUR', 1);
INSERT INTO divisas (nombre, valor) VALUES ('YEN', 0.0074);
INSERT INTO divisas (nombre, valor) VALUES ('USD', 0.94);