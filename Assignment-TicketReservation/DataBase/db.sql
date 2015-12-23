-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: ticket
-- ------------------------------------------------------
-- Server version	5.6.24-log

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
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie` (
  `movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `moviename` varchar(45) DEFAULT NULL,
  `release_date` date DEFAULT NULL,
  `no_of_show` varchar(45) DEFAULT NULL,
  `createddate` varchar(45) DEFAULT NULL,
  `updateddate` varchar(45) DEFAULT NULL,
  `createdby` varchar(45) DEFAULT NULL,
  `updatedby` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'Thanioruvan','2016-02-15','3','2015-12-22-07.07.33','2015-12-22-07.07.33','santhosh','santhosh'),(2,'kathi','2016-01-15','2','2015-12-22-07.08.12','2015-12-22-07.36.53','santhosh','santhosh'),(3,'Kapali','2016-01-15','4','2015-12-22-07.08.47','2015-12-22-07.08.47','santhosh','santhosh');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_has_timing`
--

DROP TABLE IF EXISTS `movie_has_timing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie_has_timing` (
  `movie_movie_id` int(11) NOT NULL,
  `timing_timing_id` int(11) NOT NULL,
  KEY `fk_movie_has_timing_timing1_idx` (`timing_timing_id`),
  KEY `fk_movie_has_timing_movie1_idx` (`movie_movie_id`),
  CONSTRAINT `fk_movie_has_timing_movie1` FOREIGN KEY (`movie_movie_id`) REFERENCES `movie` (`movie_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_movie_has_timing_timing1` FOREIGN KEY (`timing_timing_id`) REFERENCES `timing` (`timing_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_has_timing`
--

LOCK TABLES `movie_has_timing` WRITE;
/*!40000 ALTER TABLE `movie_has_timing` DISABLE KEYS */;
INSERT INTO `movie_has_timing` VALUES (1,1),(1,2),(1,3),(2,1),(2,2),(3,1),(3,2),(3,3),(3,4),(2,1),(2,2);
/*!40000 ALTER TABLE `movie_has_timing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation` (
  `reservation_id` int(11) NOT NULL AUTO_INCREMENT,
  `reservation_count` int(10) DEFAULT NULL,
  `reservation_date` varchar(45) DEFAULT NULL,
  `createddate` varchar(45) DEFAULT NULL,
  `updateddate` varchar(45) DEFAULT NULL,
  `createdby` varchar(45) DEFAULT NULL,
  `updatedby` varchar(45) DEFAULT NULL,
  `reservation_status_reservation_status_id` int(11) NOT NULL,
  `user_userid` int(11) NOT NULL,
  `movie_movie_id` int(11) NOT NULL,
  `timing_timing_id` int(11) NOT NULL,
  PRIMARY KEY (`reservation_id`),
  KEY `fk_reservation_reservation_status1_idx` (`reservation_status_reservation_status_id`),
  KEY `fk_reservation_user1_idx` (`user_userid`),
  KEY `fk_reservation_movie1_idx` (`movie_movie_id`),
  KEY `fk_reservation_timing1_idx` (`timing_timing_id`),
  CONSTRAINT `fk_reservation_movie1` FOREIGN KEY (`movie_movie_id`) REFERENCES `movie` (`movie_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservation_reservation_status1` FOREIGN KEY (`reservation_status_reservation_status_id`) REFERENCES `reservation_status` (`reservation_status_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservation_timing1` FOREIGN KEY (`timing_timing_id`) REFERENCES `timing` (`timing_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservation_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` VALUES (1,3,'2016-02-15','2015-12-22-06.57.13','2015-12-22-06.57.13','santhosh','santhosh',1,1,1,1),(2,2,'2016-02-15','2015-12-22-06.58.41','2015-12-22-06.58.41','santhosh','santhosh',1,1,1,3);
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation_seat`
--

DROP TABLE IF EXISTS `reservation_seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation_seat` (
  `reservation_seat_id` int(11) NOT NULL AUTO_INCREMENT,
  `reservation_seat_no` varchar(45) DEFAULT NULL,
  `reservation_reservation_id` int(11) NOT NULL,
  PRIMARY KEY (`reservation_seat_id`),
  KEY `fk_reservation_seat_reservation1_idx` (`reservation_reservation_id`),
  CONSTRAINT `fk_reservation_seat_reservation1` FOREIGN KEY (`reservation_reservation_id`) REFERENCES `reservation` (`reservation_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation_seat`
--

LOCK TABLES `reservation_seat` WRITE;
/*!40000 ALTER TABLE `reservation_seat` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation_seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation_status`
--

DROP TABLE IF EXISTS `reservation_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation_status` (
  `reservation_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `reservation_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`reservation_status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation_status`
--

LOCK TABLES `reservation_status` WRITE;
/*!40000 ALTER TABLE `reservation_status` DISABLE KEYS */;
INSERT INTO `reservation_status` VALUES (1,'Booking'),(2,'Cancelling');
/*!40000 ALTER TABLE `reservation_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `roleid` int(11) NOT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin'),(2,'user');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_rate`
--

DROP TABLE IF EXISTS `ticket_rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_rate` (
  `ticket_rate_id` int(11) NOT NULL AUTO_INCREMENT,
  `ticket_rate` varchar(45) DEFAULT NULL,
  `createddate` varchar(45) DEFAULT NULL,
  `updateddate` varchar(45) DEFAULT NULL,
  `createdby` varchar(45) DEFAULT NULL,
  `updatedby` varchar(45) DEFAULT NULL,
  `ticket_type_ticket_type_id` int(11) NOT NULL,
  `movie_movie_id` int(11) NOT NULL,
  PRIMARY KEY (`ticket_rate_id`),
  KEY `fk_ticket_rate_ticket_type1_idx` (`ticket_type_ticket_type_id`),
  KEY `fk_ticket_rate_movie1_idx` (`movie_movie_id`),
  CONSTRAINT `fk_ticket_rate_movie1` FOREIGN KEY (`movie_movie_id`) REFERENCES `movie` (`movie_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ticket_rate_ticket_type1` FOREIGN KEY (`ticket_type_ticket_type_id`) REFERENCES `ticket_type` (`ticket_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_rate`
--

LOCK TABLES `ticket_rate` WRITE;
/*!40000 ALTER TABLE `ticket_rate` DISABLE KEYS */;
INSERT INTO `ticket_rate` VALUES (1,'200','2015-12-22-07.07.33','2015-12-22-07.07.33','santhosh','santhosh',1,1),(2,'250','2015-12-22-07.07.33','2015-12-22-07.07.33','santhosh','santhosh',2,1),(3,'150','2015-12-22-07.08.12','2015-12-22-07.08.12','santhosh','santhosh',1,2),(4,'200','2015-12-22-07.08.12','2015-12-22-07.08.12','santhosh','santhosh',2,2),(5,'200','2015-12-22-07.08.47','2015-12-22-07.08.47','santhosh','santhosh',1,3),(6,'250','2015-12-22-07.08.47','2015-12-22-07.08.47','santhosh','santhosh',2,3),(7,'150','2015-12-22-07.36.53','2015-12-22-07.36.53','santhosh','santhosh',1,2),(8,'150','2015-12-22-07.36.53','2015-12-22-07.36.53','santhosh','santhosh',2,2);
/*!40000 ALTER TABLE `ticket_rate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_type`
--

DROP TABLE IF EXISTS `ticket_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_type` (
  `ticket_type_id` int(11) NOT NULL,
  `ticket_type` varchar(45) DEFAULT NULL,
  `ticket_count` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ticket_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_type`
--

LOCK TABLES `ticket_type` WRITE;
/*!40000 ALTER TABLE `ticket_type` DISABLE KEYS */;
INSERT INTO `ticket_type` VALUES (1,'Firstclass','20'),(2,'Bolconey','15');
/*!40000 ALTER TABLE `ticket_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timing`
--

DROP TABLE IF EXISTS `timing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timing` (
  `timing_id` int(11) NOT NULL,
  `timing` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`timing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timing`
--

LOCK TABLES `timing` WRITE;
/*!40000 ALTER TABLE `timing` DISABLE KEYS */;
INSERT INTO `timing` VALUES (1,'9.00AM to 12.00PM'),(2,'12.30PM to 3.30PM'),(3,'4.00PM to 7.00PM'),(4,'8.00Pm to 11.00Pm');
/*!40000 ALTER TABLE `timing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `createddate` varchar(45) DEFAULT NULL,
  `updateddate` varchar(45) DEFAULT NULL,
  `createdby` varchar(45) DEFAULT NULL,
  `updatedby` varchar(45) DEFAULT NULL,
  `role_roleid` int(11) NOT NULL,
  PRIMARY KEY (`userid`),
  KEY `fk_user_role_idx` (`role_roleid`),
  CONSTRAINT `fk_user_role` FOREIGN KEY (`role_roleid`) REFERENCES `role` (`roleid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'mohan','1','mohan@gmail.com','mohan','santhosh','trichy','2015-12-22-07.04.05','2015-12-22-07.04.05','mohan','mohan',2),(2,'nishan','1','nishan@gmail.com','nishan','mano','trichy','2015-12-22-07.04.55','2015-12-22-07.04.55','nishan','nishan',2),(3,'santhosh','1','rmohansanthosh@gmail.com','Santhosh','Mohan','trichy','2015-12-22-07.06.38','2015-12-22-07.06.38','santhosh','santhosh',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-23  9:22:59
