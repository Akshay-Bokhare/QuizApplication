-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: student
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `quizquestion`
--

DROP TABLE IF EXISTS `quizquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quizquestion` (
  `Id` int DEFAULT NULL,
  `Question` varchar(150) DEFAULT NULL,
  `Option1` varchar(150) DEFAULT NULL,
  `Option2` varchar(150) DEFAULT NULL,
  `Option3` varchar(150) DEFAULT NULL,
  `Option4` varchar(150) DEFAULT NULL,
  `Answer` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quizquestion`
--

LOCK TABLES `quizquestion` WRITE;
/*!40000 ALTER TABLE `quizquestion` DISABLE KEYS */;
INSERT INTO `quizquestion` VALUES (1,' What is polymorphism ?','Polymorphism is a technique to define different objects of same type.',' Polymorphism is the ability of an object to take on many forms.','Polymorphism is a technique to define different methods of same type.','None of the above','2'),(2,' What is function overloading?','Methods with same name but different parameters.',' Methods with same name but different return types.','Methods with same name, same parameter types but different parameter names.','None of the above','1'),(3,'Where does the system stores parameters and local variables whenever a method is invoked?','Heap','Stack','Array','Tree','1'),(4,'Method overloading is done during ____?','Runtime','Dynamic binding','Program compilation','Late binding','3'),(5,'Which of the below are Not unchecked exceptions in java ?','RuntimeException',' ClassCastException','NullPointerException','SQLException','4'),(NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'Which of the following is not a Java features?','Dynamic','Architecture Neutral','Use of pointers','Object-oriented','3'),(7,'_____ is used to find and fix bugs in the Java programs.?','JVM','JRE','JDK','JDB','4'),(8,'Which package contains the Random class?','java.util package','java.lang package','java.awt package','java.io package','1'),(9,'Which keyword is used for accessing the features of a package?','package','import','extends','export','2'),(10,'What is meant by the classes and objects that dependents on each other?','Tight Coupling','Cohesion','Loose Coupling','None of the above','1');
/*!40000 ALTER TABLE `quizquestion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-22 10:52:01
