-- MySQL dump 10.16  Distrib 10.1.38-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: filmes
-- ------------------------------------------------------
-- Server version	10.1.38-MariaDB

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
-- Table structure for table `bilheterias`
--

DROP TABLE IF EXISTS `bilheterias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bilheterias` (
  `Ranking` int(11) NOT NULL AUTO_INCREMENT,
  `Ano` int(11) NOT NULL,
  `Filme` varchar(50) NOT NULL,
  `Distribuidor` varchar(50) NOT NULL,
  `BilheteriaU$` decimal(12,2) NOT NULL,
  PRIMARY KEY (`Ranking`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bilheterias`
--

LOCK TABLES `bilheterias` WRITE;
/*!40000 ALTER TABLE `bilheterias` DISABLE KEYS */;
INSERT INTO `bilheterias` VALUES (1,2009,'Avatar','20th Century Fox',2787965087.00),(2,2019,'Avengers: Endgame','Walt Disney Studios Motion Pictures',2796000000.00),(3,1997,'Titanic','Paramount Pictures/20th Century Fox',2186772302.00),(4,2015,'Star Wars: The Force Awakens','Walt Disney Studios Motion Pictures',2068223624.00),(5,2015,'Jurassic World','Universal Pictures',1671713206.00),(6,2012,'Marvel: The Avengers','Walt Disney Studios Motion Pictures',1518812988.00),(7,2015,'Furious 7','Universal Pictures',1516045911.00),(8,2015,'Avengers: Age of Ultron','Walt Disney Studios Motion Pictures',1405403694.00);
/*!40000 ALTER TABLE `bilheterias` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-27 15:04:00
