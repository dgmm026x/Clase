DROP DATABASE if EXISTS dam_dgm_bbddwordle2;
CREATE DATABASE if NOT EXISTS dam_dgm_bbddwordle2;
USE dam_dgm_bbddwordle2;

CREATE TABLE if NOT EXISTS palabras (
	
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	palabra VARCHAR(5) NOT NULL
);

INSERT INTO palabras (palabra) VALUES ('letra');
INSERT INTO palabras (palabra) VALUES ('arbol');
INSERT INTO palabras (palabra) VALUES ('pedra');
INSERT INTO palabras (palabra) VALUES ('libro');
INSERT INTO palabras (palabra) VALUES ('nuevo');
INSERT INTO palabras (palabra) VALUES ('viejo');
INSERT INTO palabras (palabra) VALUES ('morir');
INSERT INTO palabras (palabra) VALUES ('abrir');
INSERT INTO palabras (palabra) VALUES ('chale');
INSERT INTO palabras (palabra) VALUES ('negro');
INSERT INTO palabras (palabra) VALUES ('verde');
INSERT INTO palabras (palabra) VALUES ('labia');
INSERT INTO palabras (palabra) VALUES ('rabia');
INSERT INTO palabras (palabra) VALUES ('armas');
INSERT INTO palabras (palabra) VALUES ('bruto');