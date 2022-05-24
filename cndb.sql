-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: cndb
-- ------------------------------------------------------
-- Server version	8.0.28

CREATE DATABASE cndb;
USE cndb;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `book_name` varchar(30) NOT NULL,
  `author` varchar(30) NOT NULL,
  `amount` int NOT NULL,
  `brief` varchar(400) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `publish_year` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'三体','刘慈欣',5,'文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……','2008'),(2,'Head First Java','Kathy Sierra',2,'《Head First Java》是本完整的面向对象（object-oriented，OO）程序设计和Java的学习指导。此书是根据学习理论所设计的，让你可以从学习程序语言的基础开始一直到包括线程、网络与分布式程序等项目。最重要的，你会学会如何像个面向对象开发者一样去思考。','2007'),(3,'计算机网络','谢希仁',0,'全书分为9章，比较全面系统地介绍了计算机网络的发展和原理体系结构、物理层、数据链路层（包括局域网）、网络层、运输层、应用层、网络安全、互联网上的音频/视频服务，以及无线网络和移动网络等内容。','2021'),(4,'软件工程与计算','刘钦',6,'《高等院校软件工程专业规划教材：软件工程与计算（卷2）：软件开发的技术基础》作为国家精品课程“软件工程与计算”系列课程的第二门课程配套教材，《高等院校软件工程专业规划教材：软件工程与计算（卷2）：软件开发的技术基础》以经典软件工程方法与技术为主线，软件开发技术与程序设计知识为教学重点，培养学生简单小组级别、中小规模软件系统的软件开发能力。','2012'),(5,'置身事内','兰小欢',0,'通过对中国政治经济体系的论述，作者简明地刻画了地方政府进行经济治理的基本方式，并指出，中国政府通过深度介入工业化和城市化的进程，在发展经济的同时逐步推动了市场机制的建立和完善，以一种有别于所谓发达国家经验的方式实现了经济奇迹。基于对改革历程与社会矛盾的回顾与分析，作者也在书中对当前推进的市场化改革与政府转型进行了解读，帮助读者增进对中国发展现实的把握。','2021'),(6,'杀死一只知更鸟','哈珀李',4,'成长总是个让人烦恼的命题。成长有时会很缓慢，如小溪般唱着叮咚的歌曲趟过，有时却如此突如其来，如暴雨般劈头盖脸……三个孩子因为小镇上的几桩冤案经历了猝不及防的成长——痛苦与迷惑，悲伤与愤怒，也有温情与感动。这是爱与真知的成长经典。','2012'),(7,'活着','余华',10,'《活着(新版)》讲述了农村人福贵悲惨的人生遭遇。福贵本是个阔少爷，可他嗜赌如命，终于赌光了家业，一贫如洗。他的父亲被他活活气死，母亲则在穷困中患了重病，福贵前去求药，却在途中被国民党抓去当壮丁。经过几番波折回到家里，才知道母亲早已去世，妻子家珍含辛茹苦地养大两个儿女。此后更加悲惨的命运一次又一次降临到福贵身上，他的妻子、儿女和孙子相继死去，最后只剩福贵和一头老牛相依为命，但老人依旧活着，仿佛比往日更加洒脱与坚强。','2012'),(8,'挪威的森林','村上春树',5,'《挪威的森林》是日本作家村上春树所著的一部长篇爱情小说，影响了几代读者的青春名作。故事讲述主角渡边纠缠在情绪不稳定且患有精神疾病的直子和开朗活泼的小林绿子之间，苦闷彷徨，最终展开了自我救赎和成长的旅程。彻头彻尾的现实笔法，描绘了逝去的青春风景，小说中弥散着特有的感伤和孤独气氛。自1987年在日本问世后，该小说在年轻人中引起共鸣，风靡不息。上海译文出版社于2018年2月，推出该书的全新纪念版。','2018'),(9,'强风吹拂','三浦紫苑',5,'因为全身细胞都在蠢蠢欲动，想要感受强风迎面吹拂的滋味。”','2015'),(10,'1','1',1,'1','1'),(11,'2','2',2,'2','2'),(12,'3','3',3,'3','3'),(13,'4','4',4,'4','4'),(14,'5','5',5,'5','5'),(15,'6','6',6,'6','6'),(16,'7','7',7,'7','7'),(17,'8','8',8,'8','8'),(18,'9','9',9,'9','9'),(19,'10','10',10,'10','10'),(20,'11','11',11,'11','11'),(21,'12','12',12,'12','12'),(22,'13','13',13,'13','13'),(23,'14','14',14,'14','14'),(24,'15','15',15,'15','15'),(25,'16','16',16,'16','16'),(26,'17','17',17,'17','17'),(27,'18','18',18,'18','18'),(28,'19','19',19,'19','19'),(29,'20','20',20,'20','20'),(30,'21','21',21,'21','21'),(31,'22','22',22,'22','22');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `record` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `book_id` int NOT NULL,
  `date` date NOT NULL,
  `status` int NOT NULL,
  `borrow_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `record_FK` (`user_id`),
  KEY `record_FK_1` (`book_id`),
  CONSTRAINT `record_FK` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `record_FK_1` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
INSERT INTO `record` VALUES (1,1,1,'2022-05-14',0,-1),(2,1,4,'2022-05-15',0,-1),(3,1,1,'2022-05-15',0,-1),(5,1,2,'2022-05-15',0,-1),(7,1,1,'2022-05-15',1,1),(8,1,2,'2022-05-15',1,5),(9,2,1,'2022-05-15',0,-1),(10,2,3,'2022-05-15',0,0),(11,2,1,'2022-05-15',1,9),(12,2,7,'2022-05-15',0,-1),(13,2,7,'2022-05-15',1,12),(14,1,1,'2022-05-15',0,-1),(15,1,1,'2022-05-15',1,3),(16,1,4,'2022-05-15',0,-1),(17,1,4,'2022-05-15',1,16),(18,1,1,'2022-05-15',0,-1),(19,1,2,'2022-05-15',0,-1),(20,1,4,'2022-05-15',1,2),(21,1,1,'2022-05-15',1,18),(22,1,1,'2022-05-15',1,14),(23,1,2,'2022-05-15',1,19),(24,1,1,'2022-05-16',0,0),(25,1,2,'2022-05-16',0,-1),(26,1,4,'2022-05-16',0,-1),(27,1,2,'2022-05-16',1,25),(28,1,1,'2022-05-24',0,0),(29,1,4,'2022-05-24',1,26),(30,4,15,'2022-05-24',0,-1),(31,4,1,'2022-05-24',0,0),(32,4,4,'2022-05-24',0,0),(33,4,15,'2022-05-24',1,30);
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin'),(2,'123','123'),(3,'hoyt','123'),(4,'小蓝鲸','123');
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

-- Dump completed on 2022-05-24 13:43:44
