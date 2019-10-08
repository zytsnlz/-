/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : cartest

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2019-10-08 21:00:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for company_autoinfo
-- ----------------------------
DROP TABLE IF EXISTS `company_autoinfo`;
CREATE TABLE `company_autoinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(255) NOT NULL,
  `credit_code` varchar(255) NOT NULL,
  `license_image` blob NOT NULL,
  `authorizen_image` blob NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `telephone` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_autoinfo
-- ----------------------------
DROP TABLE IF EXISTS `user_autoinfo`;
CREATE TABLE `user_autoinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `telephone` varchar(11) NOT NULL,
  `idcard_no` varchar(18) NOT NULL,
  `idcard_image1` blob NOT NULL,
  `idcard_image2` blob NOT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `credit_code` varchar(255) DEFAULT NULL,
  `license_image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_company_relation
-- ----------------------------
DROP TABLE IF EXISTS `user_company_relation`;
CREATE TABLE `user_company_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `company_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
