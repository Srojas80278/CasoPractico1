CREATE DATABASE cinelitas;
use cinelitas;

CREATE TABLE `salas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `capacidad` int(7) NOT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `salas` VALUES (1,'4D',300);

CREATE TABLE `peliculas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `costo` decimal(7) NOT NULL, 
  `fecha` varchar(50) NOT NULL,
  `codigo_sala` int(7) NOT NULL,
  `salas_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`salas_id`),
  KEY `fk_peliculas_salas_idx` (`salas_id`),
  CONSTRAINT `fk_peliculas_salas` FOREIGN KEY (`salas_id`) REFERENCES `salas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;

INSERT INTO `peliculas` VALUES (1,'Spiderman',3500,'22/2/2022','3',1);
INSERT INTO `peliculas` VALUES (1,'batman',3240,'22/2/2022','3',2);
INSERT INTO `peliculas` VALUES (1,'End Game',7600,'22/2/2022','3',3);
