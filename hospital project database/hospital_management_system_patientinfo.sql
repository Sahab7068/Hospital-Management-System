-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hospital_management_system
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `patientinfo`
--

DROP TABLE IF EXISTS `patientinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patientinfo` (
  `ID` varchar(20) DEFAULT NULL,
  `Number` varchar(20) DEFAULT NULL,
  `Name` varchar(40) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Patient_Disease` varchar(30) DEFAULT NULL,
  `Room_Number` varchar(30) DEFAULT NULL,
  `Time` varchar(30) DEFAULT NULL,
  `Diposit` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientinfo`
--

LOCK TABLES `patientinfo` WRITE;
/*!40000 ALTER TABLE `patientinfo` DISABLE KEYS */;
INSERT INTO `patientinfo` VALUES ('Adhar ','541212555','Alpna','Female','Dengu','1050','Fri Jan 31 13:47:51 IST 2025','500'),('Adhar ','125245421','Gautaom','Male','Bhukhar','200','Fri Jan 31 13:48:48 IST 2025','200'),('Adhar ','4564654','Sahab Lal','Male','Maleria','200','Sat Feb 01 12:32:39 IST 2025','500'),('Adhar ','1254545','Vaibhav','Male','Corona','201','Sat Feb 01 13:11:59 IST 2025','500'),('voter','45454','Arjun','Male','Dengu','101','Sat Feb 01 16:29:52 IST 2025','100'),('Adhar ','','','null','','100','Mon Feb 03 01:56:57 IST 2025',''),('voter','123','ram','Male','dengu','102','Mon Feb 03 14:13:19 IST 2025','500'),('voter','2121','2451','Male','51','102','Mon Feb 03 19:16:53 IST 2025','400'),('Adhar ','6595656','655323','Male','2000','103','Mon Feb 03 19:17:21 IST 2025','200'),('voter','64564','enw','Male','dharam','101','Mon Feb 03 19:17:51 IST 2025','600'),('voter','2121','2121','Female','22154','101','Mon Feb 03 19:18:29 IST 2025','51'),('Adhar ','120','202','Female','212510','102','Mon Feb 03 19:18:59 IST 2025','2000'),('Driveing ','UPDLE545815','Neeraj','Male','corona','200','Mon Feb 03 19:19:24 IST 2025','2000'),('Adhar ','','','null','','103','Wed Feb 05 11:53:26 IST 2025','200'),('Adhar ','','','null','','103','Wed Feb 05 11:54:23 IST 2025','');
/*!40000 ALTER TABLE `patientinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-12 21:03:22
