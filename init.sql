-- MySQL dump 10.13  Distrib 5.5.24, for Win64 (x86)
--
-- Host: localhost    Database: sir
-- ------------------------------------------------------
-- Server version	5.5.24

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
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `record_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `car_garage_record_id` int(10) unsigned NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `plate_number` varchar(50) DEFAULT NULL,
  `price` double(23,6) unsigned DEFAULT NULL,
  `availability` tinyint(1) unsigned DEFAULT '1',
  `void_status` tinyint(1) unsigned DEFAULT NULL,
  `void_reason` varchar(100) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,1,'Innova','BK 1998 AK',120000.000000,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `record_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `no` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `birthplace` varchar(45) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `point` int(10) unsigned DEFAULT NULL,
  `void_status` tinyint(1) unsigned DEFAULT NULL,
  `void_reason` varchar(100) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'C0001','Sutandi','Jln. Berjaya No.8y','061-4143650','sutandii@icloud.com','Medan','1998-02-07','M',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'C0002','Mario','Jln. mana aja','0812391248','mario.yaputra@gmail.com','Medan','1999-10-07','M',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'C0003','Sony','Jln. itu lho','061239831','sony.winarto@gmail.com','Medan','2016-10-11','M',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'C0004','Jono','Jln. apa adanay','0810231298','jono@gmail.com','Kisaran','2016-10-12','M',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'C0005','Jimmy','Jln. malik','0821387412','24jimmy@gmail.com','Medan','2016-10-12','M',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employer`
--

DROP TABLE IF EXISTS `employer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employer` (
  `record_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `no` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `birthplace` varchar(45) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `void_status` tinyint(1) unsigned DEFAULT NULL,
  `void_reason` varchar(100) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employer`
--

LOCK TABLES `employer` WRITE;
/*!40000 ALTER TABLE `employer` DISABLE KEYS */;
INSERT INTO `employer` VALUES (1,'Admin','Admin','Jln.mana aja','088218379','admin@gmail.com','Medan','2016-10-12','M',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'2','Administrator','jlasd','08928131','2@gmail.com','Medan','2016-10-12','M',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `employer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `garage`
--

DROP TABLE IF EXISTS `garage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `garage` (
  `record_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  `record_version` int(10) unsigned DEFAULT NULL,
  `default_status` tinyint(1) unsigned DEFAULT NULL,
  `void_status` tinyint(1) unsigned DEFAULT NULL,
  `void_reason` varchar(100) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `create_Datetime` datetime DEFAULT NULL,
  `create_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `edit_Datetime` datetime DEFAULT NULL,
  `edit_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `garage`
--

LOCK TABLES `garage` WRITE;
/*!40000 ALTER TABLE `garage` DISABLE KEYS */;
INSERT INTO `garage` VALUES (1,'Gudang Kecil','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `garage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `record_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `employee_record_id` int(10) unsigned DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `access_record_id` int(10) unsigned DEFAULT NULL,
  `void_status` tinyint(1) unsigned DEFAULT NULL,
  `void_reason` varchar(100) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,2,'Administrator','employer39',1,0,NULL,NULL,0,NULL,0,NULL,0,NULL,0,NULL,0);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_access`
--

DROP TABLE IF EXISTS `login_access`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_access` (
  `record_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `void_status` tinyint(1) unsigned DEFAULT NULL,
  `void_reason` varchar(100) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_access`
--

LOCK TABLES `login_access` WRITE;
/*!40000 ALTER TABLE `login_access` DISABLE KEYS */;
INSERT INTO `login_access` VALUES (1,'Administrator','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'Admin','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'Jala','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'Java','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'Hahaa','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'test','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'testing','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'Menu','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'Menu','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'Menu','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'Menu','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'Menu','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,'Menu2','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,'Menu2','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'asd','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,'tes','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,'Adminn','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(18,'Rental','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `login_access` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_access_detail`
--

DROP TABLE IF EXISTS `login_access_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_access_detail` (
  `record_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `access_record_id` int(10) unsigned NOT NULL,
  `name_menu` varchar(50) DEFAULT NULL,
  `view_data` tinyint(1) DEFAULT NULL,
  `add_data` tinyint(1) DEFAULT NULL,
  `edit_data` tinyint(1) DEFAULT NULL,
  `delete_data` tinyint(1) DEFAULT NULL,
  `print` tinyint(1) DEFAULT NULL,
  `export` tinyint(1) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(100) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `edit_Datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_Record_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`record_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_access_detail`
--

LOCK TABLES `login_access_detail` WRITE;
/*!40000 ALTER TABLE `login_access_detail` DISABLE KEYS */;
INSERT INTO `login_access_detail` VALUES (1,16,'Customer',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,16,'Employer',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,16,'Garage',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,16,'Rent',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,16,'Purchase Request',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,16,'Purchase Order',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,16,'Purchase Payment',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,16,'Report',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,17,'Customer',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,17,'Employer',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,17,'Garage',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,17,'Rent',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,17,'Purchase Request',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,17,'Purchase Order',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,17,'Purchase Payment',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,17,'Report',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,18,'Customer',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(18,18,'Employer',0,0,0,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(19,18,'Garage',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(20,18,'Rent',1,1,1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(21,18,'Purchase Request',1,1,1,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(22,18,'Purchase Order',0,0,0,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(23,18,'Purchase Payment',0,0,0,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(24,18,'Report',0,0,0,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `login_access_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-21 20:06:51
