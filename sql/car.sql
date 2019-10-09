/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : car

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2019-10-09 17:25:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account_companyinfo
-- ----------------------------
DROP TABLE IF EXISTS `account_companyinfo`;
CREATE TABLE `account_companyinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `identify_id` int(11) DEFAULT NULL,
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `license_no` int(11) DEFAULT NULL COMMENT '公司营业执照编号',
  `license_image` blob COMMENT '营业执照照片',
  `auth_image` blob COMMENT '单位申请书（盖公章）图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for account_identifyinfo
-- ----------------------------
DROP TABLE IF EXISTS `account_identifyinfo`;
CREATE TABLE `account_identifyinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `telephone` varchar(30) DEFAULT NULL COMMENT '电话号码',
  `id_card` varchar(30) DEFAULT NULL COMMENT '身份证号码',
  `id_card_image1` blob COMMENT '身份证正面图片',
  `id_card_image2` blob COMMENT '身份证反面图片',
  `apply_createtime` datetime DEFAULT NULL COMMENT '账号认证申请时间',
  `deal_time` datetime DEFAULT NULL COMMENT '后台管理处理时间',
  `user_type` int(11) DEFAULT NULL COMMENT '1-企业用户，0-个人用户',
  `comment` varchar(255) DEFAULT NULL COMMENT '审核反馈',
  `status` int(11) DEFAULT NULL COMMENT '1-认证通过，0-认证未通过',
  `handler_id` int(11) DEFAULT NULL COMMENT '处理该条申请记录的管理员',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for auth_permission
-- ----------------------------
DROP TABLE IF EXISTS `auth_permission`;
CREATE TABLE `auth_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) DEFAULT NULL COMMENT '父级权限id',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `value` varchar(200) DEFAULT NULL COMMENT '权限值',
  `type` int(1) DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
  `uri` varchar(200) DEFAULT NULL COMMENT '前端资源路径',
  `status` int(1) DEFAULT NULL COMMENT '启用状态；0->禁用；1->启用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='后台用户权限表';

-- ----------------------------
-- Table structure for auth_role
-- ----------------------------
DROP TABLE IF EXISTS `auth_role`;
CREATE TABLE `auth_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `user_count` int(11) DEFAULT NULL COMMENT '后台用户数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(1) DEFAULT '1' COMMENT '启用状态：0->禁用；1->启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='后台用户角色表';

-- ----------------------------
-- Table structure for auth_role_permission_relation
-- ----------------------------
DROP TABLE IF EXISTS `auth_role_permission_relation`;
CREATE TABLE `auth_role_permission_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `permission_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='后台用户角色和权限关系表';

-- ----------------------------
-- Table structure for auth_user
-- ----------------------------
DROP TABLE IF EXISTS `auth_user`;
CREATE TABLE `auth_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `telephone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` int(1) DEFAULT '1' COMMENT '帐号启用状态：0->禁用；1->启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='后台用户表';

-- ----------------------------
-- Table structure for auth_user_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `auth_user_role_relation`;
CREATE TABLE `auth_user_role_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='后台用户和角色关系表';

-- ----------------------------
-- Table structure for license_applyinfo
-- ----------------------------
DROP TABLE IF EXISTS `license_applyinfo`;
CREATE TABLE `license_applyinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `plate_no` int(11) DEFAULT NULL COMMENT '车牌号',
  `plate_type` varchar(255) DEFAULT NULL COMMENT '车牌类型',
  `pass_license_type` varchar(255) DEFAULT NULL COMMENT '通行证类型',
  `apply_posit` varchar(255) DEFAULT NULL COMMENT '起止位置',
  `apply_route` varchar(255) DEFAULT NULL COMMENT '申请路线',
  `apply_date` datetime DEFAULT NULL COMMENT '起止日期',
  `name` varchar(255) DEFAULT NULL COMMENT '司机姓名',
  `idcard_no` int(11) DEFAULT NULL COMMENT '身份证号码',
  `apply_createtime` datetime DEFAULT NULL COMMENT '申请日期',
  `deal_time` datetime DEFAULT NULL COMMENT '后台管理处理日期',
  `comment` varchar(255) DEFAULT NULL COMMENT '审核反馈',
  `status` int(11) DEFAULT NULL COMMENT '1-已处理，0-未处理',
  `handler_id` int(11) DEFAULT NULL COMMENT '处理该申请记录的后台管理员',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for license_image_company
-- ----------------------------
DROP TABLE IF EXISTS `license_image_company`;
CREATE TABLE `license_image_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `applyInfo_id` int(11) DEFAULT NULL,
  `license_front` blob COMMENT '驾驶证正面照',
  `license_back` blob COMMENT '驾驶证背面照',
  `velicense_front` blob COMMENT '机动驾驶证正面',
  `velicense_back` blob COMMENT '机动驾驶证背面',
  `car_front` blob COMMENT '车辆正面照（有车牌）',
  `car_back` blob COMMENT '车辆背面照',
  `contract` blob COMMENT '合同照片',
  `license_A` blob COMMENT '甲方营业执照',
  `license_B` blob COMMENT '乙方营业执照',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for license_image_person
-- ----------------------------
DROP TABLE IF EXISTS `license_image_person`;
CREATE TABLE `license_image_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `applyInfo_id` int(11) DEFAULT NULL,
  `license_front` blob COMMENT '驾驶证正面照',
  `license_back` blob COMMENT '驾驶证背面照',
  `velicense_front` blob COMMENT '机动驾驶证正面',
  `velicense_back` blob COMMENT '机动驾驶证背面',
  `car_front` blob COMMENT '车辆正面照（有车牌）',
  `car_back` blob COMMENT '车辆背面照',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for note_label
-- ----------------------------
DROP TABLE IF EXISTS `note_label`;
CREATE TABLE `note_label` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '后台管理员的id',
  `label1` varchar(255) DEFAULT NULL,
  `label2` varchar(255) DEFAULT NULL,
  `label3` varchar(255) DEFAULT NULL,
  `label4` varchar(255) DEFAULT NULL,
  `label5` varchar(255) DEFAULT NULL,
  `label6` varchar(255) DEFAULT NULL,
  `label7` varchar(255) DEFAULT NULL,
  `label8` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
