CREATE DATABASE api_biblioteca;
USE api_biblioteca;

CREATE TABLE Libro (
    idlibro INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    isbn VARCHAR(40) NOT NULL,
    paginas INT NOT NULL,
    fechaPublicacion DATE NOT NULL
);

CREATE TABLE Autor (
    idautor INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(40) NOT NULL,
    primerApellido VARCHAR(40) NOT NULL,
    segundoApellido VARCHAR(40) NOT NULL,
    dni INT NOT NULL,
    profesion VARCHAR(30) NOT NULL,
    idlibro INT,
    CONSTRAINT fk_libro FOREIGN KEY (idlibro) REFERENCES Libro(idlibro)
);

ALTER TABLE Autor
MODIFY COLUMN primerApellido VARCHAR(40) NULL,
MODIFY COLUMN segundoApellido VARCHAR(40) NULL,
MODIFY COLUMN profesion VARCHAR(30) NULL;

ALTER TABLE Autor MODIFY COLUMN segundoApellido VARCHAR(40) DEFAULT 'Desconocido';
ALTER TABLE Autor MODIFY COLUMN profesion VARCHAR(30) DEFAULT 'No especificado';

ALTER TABLE Libro
MODIFY COLUMN nombre VARCHAR(40) NULL,
MODIFY COLUMN isbn VARCHAR(40) NULL,
MODIFY COLUMN paginas INT NULL,
MODIFY COLUMN fechaPublicacion DATE NULL;
