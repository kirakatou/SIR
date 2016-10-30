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
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,2,'BMW','B 21 G',200000.000000,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,1,'Panther','BK 1231 K',90000.000000,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,1,'CRV','BK 921 PO',110000.000000,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,2,'TRUK','BK 9231 OI',100000.000000,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
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
  `gender` tinyint(1) DEFAULT NULL,
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
INSERT INTO `customer` VALUES (1,'C0001','Sutandi','Jln. Berjaya No.8y','061-4143650','sutandii@icloud.com','Medan','1998-02-06',0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'C0002','Mario','Jln. mana aja','0812391248','mario.yaputra@gmail.com','Medan','1997-10-19',1,0,NULL,NULL,NULL,NULL,NULL,NULL,'2016-10-23 23:40:06',2,NULL,NULL,NULL,NULL),(3,'C0003','Sony','Jln. itu lho','061239831','sony.winarto@gmail.com','Medan','2016-10-11',0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2016-10-24 00:09:39',2),(4,'C0004','Jono','Jln. apa adanay','0810231298','jono@gmail.com','Kisaran','2016-10-12',0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'C0005','Jimmy','Jln. malik','0821387412','24jimmy@gmail.com','Medan','2016-10-12',0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2016-10-24 00:08:15',2);
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
  `gender` tinyint(1) unsigned DEFAULT NULL,
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
INSERT INTO `employer` VALUES (1,'Admin','Admin','Jln.mana aja','088218379','admin@gmail.com','Medan','2016-10-12',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2016-10-24 11:43:04',2),(2,'2','Administrator','jlasd','08928131','2@gmail.com','Medan','2016-10-12',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
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
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `garage`
--

LOCK TABLES `garage` WRITE;
/*!40000 ALTER TABLE `garage` DISABLE KEYS */;
INSERT INTO `garage` VALUES (1,'Gudang Kecil','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'Gudang Besar','Mobil Besar',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `garage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `journal`
--

DROP TABLE IF EXISTS `journal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `journal` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `no` varchar(50) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `transaction_from` int(10) unsigned DEFAULT NULL,
  `transaction_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `debet_base` double(23,6) DEFAULT NULL,
  `credit_base` double(23,6) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=908 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `journal`
--

LOCK TABLES `journal` WRITE;
/*!40000 ALTER TABLE `journal` DISABLE KEYS */;
/*!40000 ALTER TABLE `journal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `journal_detail`
--

DROP TABLE IF EXISTS `journal_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `journal_detail` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `journal_record_id` int(10) unsigned zerofill NOT NULL,
  `account_chart_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `debet_transaction` double(23,6) DEFAULT NULL,
  `credit_transaction` double(23,6) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`,`journal_record_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=2891 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `journal_detail`
--

LOCK TABLES `journal_detail` WRITE;
/*!40000 ALTER TABLE `journal_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `journal_detail` ENABLE KEYS */;
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

--
-- Table structure for table `purchase_invoice`
--

DROP TABLE IF EXISTS `purchase_invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_invoice` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `purchase_order_record_id` int(10) unsigned zerofill NOT NULL DEFAULT '0000000000',
  `supplier_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `no` varchar(50) DEFAULT NULL,
  `tax_no` varchar(30) DEFAULT NULL,
  `tax_date` date DEFAULT NULL,
  `date` date DEFAULT NULL,
  `as_service` tinyint(1) DEFAULT NULL,
  `total_qty_item` int(11) DEFAULT NULL,
  `total_qty_basic_uom` double(23,6) DEFAULT NULL,
  `total_qty_uom_1` double(23,6) DEFAULT NULL,
  `total_qty_uom_2` double(23,6) DEFAULT NULL,
  `currency_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `exchange_rate` double(23,6) DEFAULT NULL,
  `sub_total` double(23,6) DEFAULT NULL,
  `tax_percent` double(23,6) DEFAULT NULL,
  `tax_value` double(23,6) DEFAULT NULL,
  `disc_percent` double(23,6) DEFAULT NULL,
  `disc_value` double(23,6) DEFAULT NULL,
  `sub_total_after_disc` double(23,6) DEFAULT '0.000000',
  `grand_total_transaction` double(23,6) DEFAULT NULL,
  `grand_total_base` double(23,6) DEFAULT NULL,
  `paid` double(23,6) DEFAULT NULL,
  `unpaid` double(23,6) DEFAULT NULL,
  `total_voucher_payment` double(23,6) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `journal_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `debit_chart_record_id` int(10) unsigned DEFAULT NULL,
  `tax_chart_record_id` int(10) unsigned DEFAULT NULL,
  `credit_chart_record_id` int(10) unsigned DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `record_version` int(10) unsigned DEFAULT NULL,
  `default_status` tinyint(1) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`,`purchase_order_record_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=2346 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_invoice`
--

LOCK TABLES `purchase_invoice` WRITE;
/*!40000 ALTER TABLE `purchase_invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_invoice_detail`
--

DROP TABLE IF EXISTS `purchase_invoice_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_invoice_detail` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `purchase_invoice_record_id` int(10) unsigned zerofill NOT NULL,
  `purchase_order_record_id` int(10) unsigned zerofill NOT NULL,
  `product_record_id` int(10) unsigned zerofill NOT NULL,
  `inventory_date` date DEFAULT NULL,
  `warehouse_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `qty_basic_uom` double(23,6) DEFAULT NULL,
  `basic_uom_as_price` tinyint(1) DEFAULT NULL,
  `qty_uom_1` double(23,6) DEFAULT NULL,
  `uom_1_as_price` tinyint(1) DEFAULT NULL,
  `qty_uom_2` double(23,6) DEFAULT NULL,
  `uom_2_as_price` tinyint(1) DEFAULT NULL,
  `currency_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `exchange_rate` double(23,6) DEFAULT NULL,
  `price` double(23,6) DEFAULT NULL,
  `disc_1_percent` double(23,6) DEFAULT NULL,
  `disc_1_value` double(23,6) DEFAULT NULL,
  `disc_2_percent` double(23,6) DEFAULT NULL,
  `disc_2_value` double(23,6) DEFAULT NULL,
  `disc_3_percent` double(23,6) DEFAULT NULL,
  `disc_3_value` double(23,6) DEFAULT NULL,
  `disc_4_percent` double(23,6) DEFAULT NULL,
  `disc_4_value` double(23,6) DEFAULT NULL,
  `disc_5_percent` double(23,6) DEFAULT NULL,
  `disc_5_value` double(23,6) DEFAULT NULL,
  `price_after_disc` double(23,6) DEFAULT NULL,
  `sub_total_transaction` double(23,6) DEFAULT NULL,
  `sub_total_base` double(23,6) DEFAULT NULL,
  `budget_plan_record_id` int(10) unsigned zerofill DEFAULT '0000000000',
  `remaining_budget` double(23,6) DEFAULT NULL,
  `service` varchar(200) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `record_version` int(10) unsigned DEFAULT NULL,
  `default_status` tinyint(1) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`,`purchase_invoice_record_id`,`purchase_order_record_id`,`product_record_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_invoice_detail`
--

LOCK TABLES `purchase_invoice_detail` WRITE;
/*!40000 ALTER TABLE `purchase_invoice_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_invoice_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_order`
--

DROP TABLE IF EXISTS `purchase_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_order` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `no` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `as_service` tinyint(1) DEFAULT NULL,
  `supplier_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `currency_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `exchange_rate` double(23,6) DEFAULT NULL,
  `total_qty_item` int(11) DEFAULT NULL,
  `total_qty_basic_uom` double(23,6) DEFAULT NULL,
  `total_qty_uom_1` double(23,6) DEFAULT NULL,
  `total_qty_uom_2` double(23,6) DEFAULT NULL,
  `DPP` double(23,6) DEFAULT '0.000000',
  `sub_total` double(23,6) DEFAULT NULL,
  `disc_percent` double(23,6) DEFAULT NULL,
  `disc_value` double(23,6) DEFAULT NULL,
  `sub_total_after_disc` double(23,6) DEFAULT NULL,
  `tax_percent` double(23,6) DEFAULT NULL,
  `tax_value` double(23,6) DEFAULT NULL,
  `tax22_percent` double(23,6) DEFAULT NULL,
  `tax22_value` double(23,6) DEFAULT NULL,
  `total_dp` double(23,6) DEFAULT NULL,
  `grand_total_transaction` double(23,6) DEFAULT NULL,
  `grand_total_base` double(23,6) DEFAULT NULL,
  `payment_type` varchar(20) DEFAULT NULL,
  `payment_description` varchar(200) DEFAULT '',
  `term_of_payment` int(10) unsigned DEFAULT NULL,
  `delivery_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `no_resi` varchar(100) DEFAULT NULL,
  `delivery_date` date DEFAULT NULL,
  `delivery_place` varchar(100) DEFAULT NULL,
  `cost` double(23,6) DEFAULT NULL,
  `cost_as_capital` tinyint(1) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `record_version` int(10) unsigned DEFAULT NULL,
  `default_status` tinyint(1) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=7464 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_order`
--

LOCK TABLES `purchase_order` WRITE;
/*!40000 ALTER TABLE `purchase_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_order_detail`
--

DROP TABLE IF EXISTS `purchase_order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_order_detail` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `purchase_order_record_id` int(10) unsigned zerofill NOT NULL,
  `purchase_request_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `purchase_request_detail_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `employee_record_id` int(10) unsigned zerofill DEFAULT '0000000000',
  `product_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `warehouse_record_id` int(10) unsigned zerofill DEFAULT '0000000000',
  `transaction_category` varchar(200) DEFAULT '',
  `qty_basic_uom` double(23,6) DEFAULT NULL,
  `basic_uom_as_price` tinyint(1) DEFAULT NULL,
  `qty_uom_1` double(23,6) DEFAULT NULL,
  `uom_1_as_price` tinyint(1) DEFAULT NULL,
  `qty_uom_2` double(23,6) DEFAULT NULL,
  `uom_2_as_price` tinyint(1) DEFAULT NULL,
  `invoiced_qty_basic_uom` double(23,6) DEFAULT NULL,
  `invoiced_qty_uom_1` double(23,6) DEFAULT NULL,
  `invoiced_qty_uom_2` double(23,6) DEFAULT NULL,
  `currency_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `exchange_rate` double(23,6) DEFAULT NULL,
  `price` double(23,6) DEFAULT NULL,
  `as_dpp_1` tinyint(1) DEFAULT '0',
  `base_1` double(23,6) DEFAULT '0.000000',
  `multiplier_1` double(23,6) DEFAULT '0.000000',
  `final_1` double(23,6) DEFAULT '0.000000',
  `as_dpp_2` tinyint(1) DEFAULT '0',
  `base_2` double(23,6) DEFAULT '0.000000',
  `multiplier_2` double(23,6) DEFAULT '0.000000',
  `final_2` double(23,6) DEFAULT '0.000000',
  `as_dpp_3` tinyint(1) DEFAULT '0',
  `base_3` double(23,6) DEFAULT '0.000000',
  `multiplier_3` double(23,6) DEFAULT '0.000000',
  `final_3` double(23,6) DEFAULT '0.000000',
  `as_dpp_4` tinyint(1) DEFAULT '0',
  `base_4` double(23,6) DEFAULT '0.000000',
  `multiplier_4` double(23,6) DEFAULT '0.000000',
  `final_4` double(23,6) DEFAULT '0.000000',
  `as_dpp_5` tinyint(1) DEFAULT '0',
  `base_5` double(23,6) DEFAULT '0.000000',
  `multiplier_5` double(23,6) DEFAULT '0.000000',
  `final_5` double(23,6) DEFAULT '0.000000',
  `as_dpp_6` tinyint(1) DEFAULT '0',
  `base_6` double(23,6) DEFAULT '0.000000',
  `multiplier_6` double(23,6) DEFAULT '0.000000',
  `final_6` double(23,6) DEFAULT '0.000000',
  `as_dpp_7` tinyint(1) DEFAULT '0',
  `base_7` double(23,6) DEFAULT '0.000000',
  `multiplier_7` double(23,6) DEFAULT '0.000000',
  `final_7` double(23,6) DEFAULT '0.000000',
  `as_dpp_8` tinyint(1) DEFAULT '0',
  `base_8` double(23,6) DEFAULT '0.000000',
  `multiplier_8` double(23,6) DEFAULT '0.000000',
  `final_8` double(23,6) DEFAULT '0.000000',
  `as_dpp_9` tinyint(1) DEFAULT '0',
  `base_9` double(23,6) DEFAULT '0.000000',
  `multiplier_9` double(23,6) DEFAULT '0.000000',
  `final_9` double(23,6) DEFAULT '0.000000',
  `as_dpp_10` tinyint(1) DEFAULT '0',
  `base_10` double(23,6) DEFAULT '0.000000',
  `multiplier_10` double(23,6) DEFAULT '0.000000',
  `final_10` double(23,6) DEFAULT '0.000000',
  `DPP` double(23,6) DEFAULT '0.000000',
  `disc_1_percent` double(23,6) DEFAULT NULL,
  `disc_1_value` double(23,6) DEFAULT NULL,
  `disc_2_percent` double(23,6) DEFAULT NULL,
  `disc_2_value` double(23,6) DEFAULT NULL,
  `disc_3_percent` double(23,6) DEFAULT NULL,
  `disc_3_value` double(23,6) DEFAULT NULL,
  `disc_4_percent` double(23,6) DEFAULT NULL,
  `disc_4_value` double(23,6) DEFAULT NULL,
  `disc_5_percent` double(23,6) DEFAULT NULL,
  `disc_5_value` double(23,6) DEFAULT NULL,
  `price_after_disc` double(23,6) DEFAULT NULL,
  `sub_total_transaction` double(23,6) DEFAULT NULL,
  `sub_total_base` double(23,6) DEFAULT NULL,
  `budget_plan_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `remaining_budget` double(23,6) DEFAULT NULL,
  `service` varchar(200) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `record_version` int(10) unsigned DEFAULT NULL,
  `default_status` tinyint(1) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`,`purchase_order_record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=53 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_order_detail`
--

LOCK TABLES `purchase_order_detail` WRITE;
/*!40000 ALTER TABLE `purchase_order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_payment`
--

DROP TABLE IF EXISTS `purchase_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_payment` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `voucher_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `no` varchar(50) DEFAULT NULL,
  `tax_no` varchar(30) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `supplier_receipt_no` varchar(50) DEFAULT NULL,
  `supplier_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `employee_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `currency_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `exchange_rate` double(23,6) DEFAULT NULL,
  `total_payable_base` double(23,6) DEFAULT NULL,
  `total_cash_base` double(23,6) DEFAULT NULL,
  `total_bank_base` double(23,6) DEFAULT NULL,
  `total_giro_base` double(23,6) DEFAULT NULL,
  `total_CN_DN_base` double(23,6) DEFAULT NULL,
  `total_others_base` double(23,6) DEFAULT NULL,
  `total_return_base` double(23,6) DEFAULT NULL,
  `total_payment_base` double(23,6) DEFAULT NULL,
  `journal_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `record_version` int(10) unsigned DEFAULT NULL,
  `default_status` tinyint(1) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_payment`
--

LOCK TABLES `purchase_payment` WRITE;
/*!40000 ALTER TABLE `purchase_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_payment_invoice`
--

DROP TABLE IF EXISTS `purchase_payment_invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_payment_invoice` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `purchase_payment_record_id` int(10) unsigned zerofill NOT NULL,
  `purchase_invoice_record_id` int(10) unsigned zerofill NOT NULL,
  `payable_value` double(23,6) DEFAULT NULL,
  `currency_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `exchange_rate` double(23,6) DEFAULT NULL,
  `cash_transaction` double(23,6) DEFAULT NULL,
  `cash_base` double(23,6) DEFAULT NULL,
  `bank_transaction` double(23,6) DEFAULT NULL,
  `bank_base` double(23,6) DEFAULT NULL,
  `giro_transaction` double(23,6) DEFAULT NULL,
  `giro_base` double(23,6) DEFAULT NULL,
  `CN_DN_transaction` double(23,6) DEFAULT NULL,
  `CN_DN_base` double(23,6) DEFAULT NULL,
  `other_transaction` double(23,6) DEFAULT NULL,
  `other_base` double(23,6) DEFAULT NULL,
  `return_transaction` double(23,6) DEFAULT NULL,
  `return_base` double(23,6) DEFAULT NULL,
  `total_payment_transaction` double(23,6) DEFAULT NULL,
  `total_payment_base` double(23,6) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `record_version` int(10) unsigned DEFAULT NULL,
  `default_status` tinyint(1) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`,`purchase_payment_record_id`,`purchase_invoice_record_id`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_payment_invoice`
--

LOCK TABLES `purchase_payment_invoice` WRITE;
/*!40000 ALTER TABLE `purchase_payment_invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_payment_invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_request`
--

DROP TABLE IF EXISTS `purchase_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_request` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `no` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `request_by_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `total` double(23,6) DEFAULT NULL,
  `date_needed` date DEFAULT NULL,
  `agreed_by_top_management` tinyint(1) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `record_version` int(10) unsigned DEFAULT NULL,
  `default_status` tinyint(1) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6080 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_request`
--

LOCK TABLES `purchase_request` WRITE;
/*!40000 ALTER TABLE `purchase_request` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_request_detail`
--

DROP TABLE IF EXISTS `purchase_request_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_request_detail` (
  `record_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `purchase_request_record_id` int(10) unsigned zerofill NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `est_price` double(23,6) DEFAULT NULL,
  `qty` int(10) unsigned DEFAULT NULL,
  `subtotal` double(23,6) DEFAULT NULL,
  `void_status` tinyint(1) DEFAULT NULL,
  `void_reason` varchar(200) DEFAULT NULL,
  `void_datetime` datetime DEFAULT NULL,
  `void_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `create_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `edit_datetime` datetime DEFAULT NULL,
  `edit_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `authorize_datetime` datetime DEFAULT NULL,
  `authorize_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  `delete_datetime` datetime DEFAULT NULL,
  `delete_by_user_record_id` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`record_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=76 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_request_detail`
--

LOCK TABLES `purchase_request_detail` WRITE;
/*!40000 ALTER TABLE `purchase_request_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_request_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rent`
--

DROP TABLE IF EXISTS `rent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rent` (
  `record_id` int(10) unsigned NOT NULL,
  `customer_profiles_record_id` int(10) unsigned NOT NULL,
  `no` varchar(40) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `subtotal` double(23,6) DEFAULT NULL,
  `discount` double(23,6) unsigned DEFAULT NULL,
  `total` double(23,6) unsigned DEFAULT NULL,
  `returned` tinyint(1) unsigned DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
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
  `delete_by_user_record_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rent`
--

LOCK TABLES `rent` WRITE;
/*!40000 ALTER TABLE `rent` DISABLE KEYS */;
INSERT INTO `rent` VALUES (7,1,'R0001','2016-10-28',2700000.000000,0.000000,1800000.000000,NULL,'',NULL,NULL,NULL,NULL,'2016-10-28 12:16:58',2,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `rent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rent_detail`
--

DROP TABLE IF EXISTS `rent_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rent_detail` (
  `record_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `rent_record_id` int(10) unsigned DEFAULT NULL,
  `car_record_id` int(10) unsigned DEFAULT NULL,
  `price` double(23,6) DEFAULT NULL,
  `period` int(10) unsigned DEFAULT NULL,
  `subtotal` double(23,6) unsigned DEFAULT NULL,
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
-- Dumping data for table `rent_detail`
--

LOCK TABLES `rent_detail` WRITE;
/*!40000 ALTER TABLE `rent_detail` DISABLE KEYS */;
INSERT INTO `rent_detail` VALUES (1,7,2,90000.000000,20,1800000.000000,NULL,NULL,NULL,NULL,'2016-10-28 12:16:58',2,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `rent_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-30 22:44:47
