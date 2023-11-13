DROP TABLE IF EXISTS almacenes;
CREATE TABLE almacenes (
    codigo INT NOT NULL,
    lugar VARCHAR(255) NOT NULL,
    capacidad INT NOT NULL,
    PRIMARY KEY (codigo)
);

DROP TABLE IF EXISTS cajas;
CREATE TABLE cajas (
  numReferencia varchar(255) NOT NULL,
  contenido varchar(255) NOT NULL,
  valor double NOT NULL,
  almacen int NOT NULL,
  PRIMARY KEY (numReferencia),
  FOREIGN KEY (almacen) REFERENCES almacenes (codigo)
);