CREATE DATABASE practica;

USE practica;

CREATE TABLE estado (
    id_estado INT NOT NULL AUTO_INCREMENT,
    pais VARCHAR(45) NOT NULL,
    estado VARCHAR(45) NOT NULL,
    capital VARCHAR(45) NOT NULL,
    poblacion VARCHAR(45) NOT NULL,
    idioma VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_estado)
);

create user 'usuario_practica'@'%' identified by 'la_Clave';

grant all privileges on practica.* to 'usuario_practica'@'%';

flush privileges;

drop USER 'usuario_practica'@'%';