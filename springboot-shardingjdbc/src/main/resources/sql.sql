/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.7.13-log : Database - ds_shop_0
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ds_shop_0` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ds_shop_0`;

/*Table structure for table `t_order_0` */

DROP TABLE IF EXISTS `t_order_0`;

CREATE TABLE `t_order_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=465195838718062595 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_1` */

DROP TABLE IF EXISTS `t_order_1`;

CREATE TABLE `t_order_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=465195838688702466 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_detail_0` */

DROP TABLE IF EXISTS `t_order_detail_0`;

CREATE TABLE `t_order_detail_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '详情ID',
  `order_id` bigint(20) NOT NULL COMMENT '订单ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=465195838722256897 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_detail_1` */

DROP TABLE IF EXISTS `t_order_detail_1`;

CREATE TABLE `t_order_detail_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '详情ID',
  `order_id` bigint(20) NOT NULL COMMENT '订单ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=465195838692896770 DEFAULT CHARSET=utf8;




CREATE DATABASE /*!32312 IF NOT EXISTS*/`ds_shop_1` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ds_shop_1`;

/*Table structure for table `t_order_0` */

DROP TABLE IF EXISTS `t_order_0`;

CREATE TABLE `t_order_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=465195838718062595 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_1` */

DROP TABLE IF EXISTS `t_order_1`;

CREATE TABLE `t_order_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=465195838688702466 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_detail_0` */

DROP TABLE IF EXISTS `t_order_detail_0`;

CREATE TABLE `t_order_detail_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '详情ID',
  `order_id` bigint(20) NOT NULL COMMENT '订单ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=465195838722256897 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_detail_1` */

DROP TABLE IF EXISTS `t_order_detail_1`;

CREATE TABLE `t_order_detail_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '详情ID',
  `order_id` bigint(20) NOT NULL COMMENT '订单ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=465195838692896770 DEFAULT CHARSET=utf8;