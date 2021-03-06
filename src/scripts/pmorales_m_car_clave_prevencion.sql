-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: pmorales
-- ------------------------------------------------------
-- Server version	5.1.65-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `m_car_calificacion_cartera`
--

DROP TABLE IF EXISTS `pmorales_m_car_clave_prevencion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */
CREATE TABLE `pmorales_m_car_clave_prevencion` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bur_solnum` int(11) NOT NULL,
  `sg_uno_no_usuarios` varchar(2) DEFAULT NULL,
  `sg_uno_no_calificacion` varchar(2) DEFAULT NULL,
  `sg_dos_no_usuarios` varchar(2) DEFAULT NULL,
  `sg_dos_no_calificacion` varchar(2) DEFAULT NULL,
  `fecha_creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COMMENT='Tabla de parámetros para solicitud a buró de PMorales';

--
-- Dumping data for table `m_car_calificacion_cartera`
--

LOCK TABLES `pmorales_m_car_clave_prevencion` WRITE;
/*!40000 ALTER TABLE `m_car_calificacion_cartera` DISABLE KEYS */;
INSERT INTO `pmorales_m_car_clave_prevencion` VALUES VALUES (1,1,'02','A1','01','B1')
/*!40000 ALTER TABLE `m_car_calificacion_cartera` ENABLE KEYS */;
UNLOCK TABLES;