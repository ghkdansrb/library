-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: library
-- ------------------------------------------------------
-- Server version	5.5.54-log

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `admin_no` int(11) NOT NULL AUTO_INCREMENT,
  `library_no` int(11) NOT NULL,
  `admin_id` varchar(45) NOT NULL,
  `admin_pw` varchar(45) NOT NULL,
  `admin_name` varchar(45) NOT NULL,
  PRIMARY KEY (`admin_no`),
  UNIQUE KEY `admin_id_UNIQUE` (`admin_id`),
  KEY `admin_library_idx` (`library_no`),
  CONSTRAINT `admin_library` FOREIGN KEY (`library_no`) REFERENCES `library` (`library_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,1,'admin','1234','관리자');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `book_no` int(11) NOT NULL AUTO_INCREMENT,
  `library_no` int(11) NOT NULL,
  `book_name` varchar(45) NOT NULL,
  `category_no` int(11) NOT NULL,
  `book_writer` varchar(45) NOT NULL,
  `book_publisher` varchar(45) NOT NULL,
  `book_startday` datetime DEFAULT NULL,
  `book_totalrental` int(10) unsigned NOT NULL DEFAULT '0',
  `book_rentalstate` varchar(45) NOT NULL DEFAULT '대여가능',
  `book_state` varchar(45) DEFAULT NULL,
  `book_date` date NOT NULL,
  `book_deleteday` datetime DEFAULT NULL,
  PRIMARY KEY (`book_no`),
  KEY `library_no_idx` (`library_no`),
  KEY `category_no_idx` (`category_no`),
  CONSTRAINT `book_category` FOREIGN KEY (`category_no`) REFERENCES `category` (`category_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `book_library` FOREIGN KEY (`library_no`) REFERENCES `library` (`library_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (13,1,'너의이름은',1,'신카이마코토','대원씨아이',NULL,0,'대여가능',NULL,'2017-02-07',NULL),(14,1,'너의이름은2',1,'신카이마코토','대원씨아이',NULL,0,'대여가능',NULL,'2017-02-07',NULL),(15,1,'너의이름은3',1,'신카이마코토','대원씨아이',NULL,0,'대여가능',NULL,'2017-02-07',NULL),(16,1,'해리포터:불의잔',1,'j.k롤링','문학수첩',NULL,0,'대여가능',NULL,'2017-02-07',NULL),(17,1,'해리포터:아즈카반의죄수',1,'j.k롤링','문학수첩',NULL,0,'대여가능',NULL,'2017-02-07',NULL);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `category_no` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45) NOT NULL,
  PRIMARY KEY (`category_no`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'소설'),(2,'시/에세이'),(3,'자기계발'),(4,'역사/문화'),(5,'인문'),(6,'사회/정치'),(7,'과학');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `library`
--

DROP TABLE IF EXISTS `library`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `library` (
  `library_no` int(11) NOT NULL AUTO_INCREMENT,
  `library_name` varchar(45) NOT NULL,
  `local_no` int(11) NOT NULL,
  PRIMARY KEY (`library_no`),
  KEY `local_no_idx` (`local_no`),
  CONSTRAINT `library_local` FOREIGN KEY (`local_no`) REFERENCES `local` (`local_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `library`
--

LOCK TABLES `library` WRITE;
/*!40000 ALTER TABLE `library` DISABLE KEYS */;
INSERT INTO `library` VALUES (1,'삼천도서관',1);
/*!40000 ALTER TABLE `library` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `local`
--

DROP TABLE IF EXISTS `local`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `local` (
  `local_no` int(11) NOT NULL AUTO_INCREMENT,
  `local_name` varchar(45) NOT NULL,
  PRIMARY KEY (`local_no`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local`
--

LOCK TABLES `local` WRITE;
/*!40000 ALTER TABLE `local` DISABLE KEYS */;
INSERT INTO `local` VALUES (1,'서울'),(2,'인천'),(3,'경기'),(4,'세종'),(5,'대전'),(6,'충청'),(7,'강원'),(8,'광주'),(9,'전라'),(10,'대구'),(11,'울산'),(12,'부산'),(13,'경상'),(14,'제주');
/*!40000 ALTER TABLE `local` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `member_no` int(11) NOT NULL AUTO_INCREMENT,
  `library_no` int(11) NOT NULL,
  `member_name` varchar(45) NOT NULL,
  `member_level` varchar(45) NOT NULL,
  `member_address` varchar(45) NOT NULL,
  `member_phone` varchar(13) NOT NULL,
  `member_date` date NOT NULL,
  PRIMARY KEY (`member_no`),
  KEY `library_no_idx` (`library_no`),
  CONSTRAINT `member_library` FOREIGN KEY (`library_no`) REFERENCES `library` (`library_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (24,1,'황문규','회원','삼천동','111','2017-02-06'),(26,1,'홍인용','회원','서신동','111','2017-02-06'),(27,1,'허준','회원','중화산동','222','2017-02-06'),(28,1,'임문환','회원','중화산동','333','2017-02-06');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment` (
  `payment_no` int(11) NOT NULL AUTO_INCREMENT,
  `member_no` int(11) NOT NULL,
  `rental_no` int(11) NOT NULL,
  `payment_price` int(11) DEFAULT NULL,
  `payment_state` varchar(45) NOT NULL DEFAULT '결제전',
  `prepayment` int(11) DEFAULT NULL,
  PRIMARY KEY (`payment_no`),
  KEY `member_no_idx` (`member_no`),
  KEY `rental_no_idx` (`rental_no`),
  CONSTRAINT `payment_member` FOREIGN KEY (`member_no`) REFERENCES `member` (`member_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `payment_rental` FOREIGN KEY (`rental_no`) REFERENCES `rental` (`rental_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `price`
--

DROP TABLE IF EXISTS `price`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `price` (
  `price_no` int(11) NOT NULL,
  `price_value` int(11) NOT NULL,
  `member_level` varchar(45) NOT NULL,
  PRIMARY KEY (`price_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `price`
--

LOCK TABLES `price` WRITE;
/*!40000 ALTER TABLE `price` DISABLE KEYS */;
INSERT INTO `price` VALUES (1,100,'회원'),(2,200,'일반');
/*!40000 ALTER TABLE `price` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rental`
--

DROP TABLE IF EXISTS `rental`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rental` (
  `rental_no` int(11) NOT NULL AUTO_INCREMENT,
  `member_no` int(11) NOT NULL,
  `book_no` int(11) DEFAULT NULL,
  `rental_startday` datetime NOT NULL,
  `rental_endday` datetime DEFAULT NULL,
  PRIMARY KEY (`rental_no`),
  KEY `member_no_idx` (`member_no`),
  KEY `rental_book_idx` (`book_no`),
  CONSTRAINT `rental_book` FOREIGN KEY (`book_no`) REFERENCES `book` (`book_no`) ON DELETE SET NULL ON UPDATE NO ACTION,
  CONSTRAINT `rental_member` FOREIGN KEY (`member_no`) REFERENCES `member` (`member_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rental`
--

LOCK TABLES `rental` WRITE;
/*!40000 ALTER TABLE `rental` DISABLE KEYS */;
/*!40000 ALTER TABLE `rental` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-07 14:26:34
