create database base;

use base;

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `cliente` (
  `cpf` varchar(15) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `status` smallint,
  PRIMARY KEY `cpf` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;