/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : car

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2019-12-17 15:37:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account_identifyinfo
-- ----------------------------
DROP TABLE IF EXISTS `account_identifyinfo`;
CREATE TABLE `account_identifyinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `telephone` varchar(50) DEFAULT NULL COMMENT '电话号码',
  `id_card` varchar(50) DEFAULT NULL COMMENT '身份证号码',
  `id_card_image1` varchar(255) DEFAULT NULL COMMENT '身份证正面图片',
  `id_card_image2` varchar(255) DEFAULT NULL COMMENT '身份证反面图片',
  `apply_createtime` datetime DEFAULT NULL COMMENT '账号认证申请时间',
  `deal_time` datetime DEFAULT NULL COMMENT '后台管理处理时间',
  `user_type` int(11) DEFAULT NULL COMMENT '1-企业用户，0-个人用户',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `license_no` varchar(255) DEFAULT NULL COMMENT '公司营业执照编号',
  `license_image` varchar(255) DEFAULT NULL COMMENT '营业执照照片',
  `auth_image` varchar(255) DEFAULT NULL COMMENT '单位申请书（盖公章）图片',
  `comment` varchar(255) DEFAULT NULL COMMENT '审核反馈',
  `status` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '1-认证审核通过，0-未审核，2-认证审核未通过',
  `handler_id` int(11) DEFAULT NULL COMMENT '处理该条申请记录的管理员',
  PRIMARY KEY (`id`),
  KEY `fk_handler_id` (`handler_id`),
  KEY `fk_user_id` (`user_id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `auth_user` (`id`),
  CONSTRAINT `fk_handler_id` FOREIGN KEY (`handler_id`) REFERENCES `auth_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_identifyinfo
-- ----------------------------
INSERT INTO `account_identifyinfo` VALUES ('1', '1', '张三一', '189276739297', '72384732947920', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=1e33b0fc305e39f668dc312f6f07c7be&imgtype=0&src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F110715%2F9128-110G514440969.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=645474b70daae9ed7017cac27c0770f6&imgtype=0&src=http%3A%2F%2Fpic27.nipic.com%2F20130326%2F1682937_000918100000_2.jpg', '2019-09-30 16:18:20', '2019-11-17 17:38:13', '1', '百度有限公司', null, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434027&di=22ae3071aa9f03e737914bd10440cac3&imgtype=0&src=http%3A%2F%2Fwww.81.cn%2Fsyjdt%2Fattachement%2Fjpg%2Fsite351%2F20141003%2F180373316289159906c707.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434026&di=47416dba19595e19c71461f821e2d2de&imgtype=0&src=http%3A%2F%2Fup.enterdesk.com%2Fedpic%2Fa2%2F25%2F96%2Fa22596afdffcc0fa234ec904a1b800d8.jpg', 'ff', '1', '4');
INSERT INTO `account_identifyinfo` VALUES ('2', '2', '李四一', '189263756288', '12342343534534', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434028&di=2ec5e6b43a5b99106640a70b4039bdd3&imgtype=0&src=http%3A%2F%2Fpic34.nipic.com%2F20131023%2F8821914_221904429000_2.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=1e33b0fc305e39f668dc312f6f07c7be&imgtype=0&src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F110715%2F9128-110G514440969.jpg', '2019-11-01 15:18:26', '2019-12-13 10:44:21', '0', '', null, '', '', '增加标签', '2', '4');
INSERT INTO `account_identifyinfo` VALUES ('3', '3', '王五', '156378283789', '35464565467567', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434028&di=b0e285a308d789adfa0e9169172e7512&imgtype=0&src=http%3A%2F%2Fpic11.nipic.com%2F20101125%2F2457331_114536300000_2.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434027&di=22ae3071aa9f03e737914bd10440cac3&imgtype=0&src=http%3A%2F%2Fwww.81.cn%2Fsyjdt%2Fattachement%2Fjpg%2Fsite351%2F20141003%2F180373316289159906c707.jpg', '2019-12-02 16:18:31', '2019-12-13 10:44:14', '1', '腾讯有限公司', null, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434028&di=2ec5e6b43a5b99106640a70b4039bdd3&imgtype=0&src=http%3A%2F%2Fpic34.nipic.com%2F20131023%2F8821914_221904429000_2.jpg', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2860396138,3400477231&fm=26&gp=0.jpg', '增加标签', '1', '4');
INSERT INTO `account_identifyinfo` VALUES ('4', '2', '李四二', '152738738934', '23748375945989', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=1e33b0fc305e39f668dc312f6f07c7be&imgtype=0&src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F110715%2F9128-110G514440969.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434027&di=c25b76498d4cda8c47cc8906cf4f8b8f&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-08-15%2F5b739582b7e78.jpg', '2019-12-03 16:19:00', '2019-11-17 17:19:15', '0', null, null, '', '', '水电费水电费', '1', '4');
INSERT INTO `account_identifyinfo` VALUES ('5', '1', '张三二', '189263756288', '12342343534534', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434028&di=b0e285a308d789adfa0e9169172e7512&imgtype=0&src=http%3A%2F%2Fpic11.nipic.com%2F20101125%2F2457331_114536300000_2.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=645474b70daae9ed7017cac27c0770f6&imgtype=0&src=http%3A%2F%2Fpic27.nipic.com%2F20130326%2F1682937_000918100000_2.jpg', '2019-12-04 16:19:06', '2019-12-13 10:44:18', '1', '爱奇艺有限公司', null, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=1e33b0fc305e39f668dc312f6f07c7be&imgtype=0&src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F110715%2F9128-110G514440969.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434023&di=7850b95cc180772a48052c3a37695ffa&imgtype=0&src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201401%2F28%2F20140128234326_HGPSf.thumb.700_0.jpeg', 'SFSFA', '1', '4');
INSERT INTO `account_identifyinfo` VALUES ('6', '4', '李志琪', '172634824789', '3463763284738947389', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1573915001741&di=83f4ac9deb2074811e35ec0aae9a7769&imgtype=0&src=http%3A%2F%2Fimg2015.zdface.com%2F20180627%2F87b365bb4faeab2f0604450c6c0f579e.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1573914890321&di=ca827a8b9027fa9915b1404c52093bcd&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201803%2F19%2F20180319175413_lEYlj.thumb.700_0.jpeg', '2019-12-05 16:19:10', '2019-11-21 13:06:27', '0', null, null, '', '', '多大师傅师傅', '2', '4');

-- ----------------------------
-- Table structure for auth_permission
-- ----------------------------
DROP TABLE IF EXISTS `auth_permission`;
CREATE TABLE `auth_permission` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) DEFAULT NULL COMMENT '父级权限id',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `value` varchar(200) DEFAULT NULL COMMENT '权限值',
  `type` int(1) DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
  `uri` varchar(200) DEFAULT NULL COMMENT '前端资源路径',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用状态；0->禁用；1->启用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='后台用户权限表';

-- ----------------------------
-- Records of auth_permission
-- ----------------------------
INSERT INTO `auth_permission` VALUES ('1', '1', '管理员权限', '后台所有操作', '0', '/admin', '1', '2018-09-29 16:15:14', '0');
INSERT INTO `auth_permission` VALUES ('2', '2', '用户权限', null, null, '/user', '1', '2019-10-03 21:06:00', null);

-- ----------------------------
-- Table structure for auth_role
-- ----------------------------
DROP TABLE IF EXISTS `auth_role`;
CREATE TABLE `auth_role` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `user_count` int(11) DEFAULT NULL COMMENT '后台用户数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用状态：0->禁用；1->启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='后台用户角色表';

-- ----------------------------
-- Records of auth_role
-- ----------------------------
INSERT INTO `auth_role` VALUES ('0', 'user', '已认证个人用户', null, '2019-10-03 21:02:16', '1');
INSERT INTO `auth_role` VALUES ('1', 'user', '已认证企业用户', null, '2019-10-10 21:42:55', '1');
INSERT INTO `auth_role` VALUES ('2', 'user', '未认证用户', null, '2019-10-23 16:03:22', '1');
INSERT INTO `auth_role` VALUES ('3', 'admin', '管理员', null, '2019-10-26 14:24:00', '1');

-- ----------------------------
-- Table structure for auth_role_permission_relation
-- ----------------------------
DROP TABLE IF EXISTS `auth_role_permission_relation`;
CREATE TABLE `auth_role_permission_relation` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `role_id` int(20) DEFAULT NULL,
  `permission_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `permission_id_index` (`permission_id`) USING BTREE,
  KEY `fk_role_id` (`role_id`),
  CONSTRAINT `fk_role_id` FOREIGN KEY (`role_id`) REFERENCES `auth_role` (`id`),
  CONSTRAINT `fk_permission_id` FOREIGN KEY (`permission_id`) REFERENCES `auth_permission` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='后台用户角色和权限关系表';

-- ----------------------------
-- Records of auth_role_permission_relation
-- ----------------------------
INSERT INTO `auth_role_permission_relation` VALUES ('1', '1', '1');
INSERT INTO `auth_role_permission_relation` VALUES ('2', '2', '2');
INSERT INTO `auth_role_permission_relation` VALUES ('3', '3', null);
INSERT INTO `auth_role_permission_relation` VALUES ('4', null, null);

-- ----------------------------
-- Table structure for auth_user
-- ----------------------------
DROP TABLE IF EXISTS `auth_user`;
CREATE TABLE `auth_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL COMMENT '头像',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `telephone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '帐号状态：0->禁用；1->启用；',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='后台用户表';

-- ----------------------------
-- Records of auth_user
-- ----------------------------
INSERT INTO `auth_user` VALUES ('1', 'justin', '$2a$10$yVYD6IQ2cfIAm6zK32ogO.zflrAbLMzlEEsOLHwmwsPsEg9NpoOAG', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572593660&di=f287fd59a69e610b32df21eb22149294&imgtype=jpg&er=1&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-06-27%2F5b33706749475.jpg', 'string', 'string1', '32642748@qq.com', '18267364832', '2019-10-20 20:26:59', '2019-10-20 20:21:16', '1');
INSERT INTO `auth_user` VALUES ('2', 'string', '$2a$10$Ys/NYkA1.M5JU9x//ITyQ.0Ddieu1WZ3RvCTlIjPnq2EwQBwXcJo.', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998954332&di=f52c79f6cd423a96c9e8816e1160dee7&imgtype=jpg&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D312440173%2C484202537%26fm%3D214%26gp%3D0.jpg', 'string', 'string2', '2637264872@qq.com', '18725365778', '2019-10-20 20:34:08', '2019-10-20 20:32:07', '1');
INSERT INTO `auth_user` VALUES ('3', 'zyt', '$2a$10$4W2xcRvuoCfNcDbCNL5C0.Veqg8DnADjAOtpfDvbcRgFLY3ftCR.O', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998954332&di=f52c79f6cd423a96c9e8816e1160dee7&imgtype=jpg&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D312440173%2C484202537%26fm%3D214%26gp%3D0.jpg', 'string', 'string3', '346873@163.com', '15626376483', '2019-10-20 20:38:58', '2019-10-20 20:32:07', '1');
INSERT INTO `auth_user` VALUES ('4', 'admin', '$2a$10$E/5Z1HZeAD5XHeBe13Td0uhsQ1x9iLGKjSvrj6HEwYc2.ZoBab492', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998954332&di=f52c79f6cd423a96c9e8816e1160dee7&imgtype=jpg&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D312440173%2C484202537%26fm%3D214%26gp%3D0.jpg', 'string', 'string4', '346378@qq.com', '15926376788', '2019-10-20 21:28:26', '2019-10-20 21:07:31', '1');
INSERT INTO `auth_user` VALUES ('5', 'zzz', null, null, null, null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for auth_user_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `auth_user_role_relation`;
CREATE TABLE `auth_user_role_relation` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) DEFAULT NULL,
  `role_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk1_user_id` (`user_id`),
  KEY `fk2_role_id` (`role_id`),
  CONSTRAINT `fk2_role_id` FOREIGN KEY (`role_id`) REFERENCES `auth_role` (`id`),
  CONSTRAINT `fk1_user_id` FOREIGN KEY (`user_id`) REFERENCES `auth_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='后台用户和角色关系表';

-- ----------------------------
-- Records of auth_user_role_relation
-- ----------------------------
INSERT INTO `auth_user_role_relation` VALUES ('1', '1', '1');
INSERT INTO `auth_user_role_relation` VALUES ('2', '2', '0');
INSERT INTO `auth_user_role_relation` VALUES ('3', '3', '1');
INSERT INTO `auth_user_role_relation` VALUES ('4', '4', '0');

-- ----------------------------
-- Table structure for license_applyinfo
-- ----------------------------
DROP TABLE IF EXISTS `license_applyinfo`;
CREATE TABLE `license_applyinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `image_company_id` int(11) DEFAULT NULL,
  `image_person_id` int(11) DEFAULT NULL,
  `plate_no` varchar(50) DEFAULT NULL COMMENT '车牌号',
  `plate_type` varchar(255) DEFAULT NULL COMMENT '车牌类型',
  `pass_license_type` int(11) DEFAULT NULL COMMENT '通行证类型',
  `start_position` varchar(255) DEFAULT NULL COMMENT '起点位置',
  `end_position` varchar(255) DEFAULT NULL COMMENT '终点位置',
  `apply_route` varchar(255) DEFAULT NULL COMMENT '申请路线',
  `start_date` datetime DEFAULT NULL COMMENT '开始日期',
  `end_date` datetime DEFAULT NULL COMMENT '结束日期',
  `driver_name` varchar(255) DEFAULT NULL COMMENT '司机姓名',
  `driver_idcard_no` varchar(255) DEFAULT NULL COMMENT '身份证号码',
  `apply_createtime` datetime DEFAULT NULL COMMENT '申请日期',
  `deal_time` datetime DEFAULT NULL COMMENT '后台管理处理日期',
  `comment` varchar(255) DEFAULT NULL COMMENT '审核反馈',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '1-审核通过，0-未审核，2-审核未通过',
  `handler_id` int(11) DEFAULT NULL COMMENT '处理该申请记录的后台管理员',
  PRIMARY KEY (`id`),
  KEY `fk3_user_id` (`user_id`),
  KEY `fk image_company_id` (`image_company_id`),
  KEY `fk_uimage_person_id` (`image_person_id`),
  KEY `fk1 handler_id` (`handler_id`),
  KEY `fk_pass_license_type` (`pass_license_type`),
  CONSTRAINT `fk_pass_license_type` FOREIGN KEY (`pass_license_type`) REFERENCES `pass_license_type` (`id`),
  CONSTRAINT `fk image_company_id` FOREIGN KEY (`image_company_id`) REFERENCES `license_image_company` (`id`),
  CONSTRAINT `fk1 handler_id` FOREIGN KEY (`handler_id`) REFERENCES `auth_user_role_relation` (`id`),
  CONSTRAINT `fk3_user_id` FOREIGN KEY (`user_id`) REFERENCES `auth_user` (`id`),
  CONSTRAINT `fk_uimage_person_id` FOREIGN KEY (`image_person_id`) REFERENCES `license_image_person` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of license_applyinfo
-- ----------------------------
INSERT INTO `license_applyinfo` VALUES ('1', '1', '4', null, '冀A2376483', '黄牌', '2', '唐山', '沧州', '北京路，长寿路', '2019-10-09 17:48:33', '2019-10-17 17:53:22', '李四', '232482983748933', '2019-10-24 17:48:58', '2019-11-06 22:13:10', '安顺高速对光反射', '1', '4');
INSERT INTO `license_applyinfo` VALUES ('2', '2', null, '1', '冀B34737658', '蓝牌', '1', '天津', '北京', '上下九，帅特龙', '2019-10-07 17:53:16', '2019-10-22 17:53:27', '大傻', '347839659356839', '2019-10-21 17:53:52', '2019-12-13 10:45:02', 'SFSFA', '1', '4');
INSERT INTO `license_applyinfo` VALUES ('3', '3', '3', null, '冀A2376483', '黄牌', '1', '唐山', '秦皇岛', '荔湾区，天河区', '2019-10-24 17:54:53', '2019-10-25 17:54:56', '二蛋', '237489234693856', '2019-10-18 17:55:17', '2019-10-28 22:13:19', null, '1', '4');
INSERT INTO `license_applyinfo` VALUES ('4', '1', '2', null, '京C3748379', '蓝牌', '1', '南昌', '上饶', '紫金山，白云区', '2019-10-10 15:51:07', '2019-10-31 15:51:16', '三傻子', '348573289759309', '2019-10-09 15:51:59', '2019-12-13 10:44:58', '增加标签', '2', '4');
INSERT INTO `license_applyinfo` VALUES ('5', '1', '1', null, '赣D8437830', '黄牌', '1', '武汉', '重庆', '海珠区，坑口', '2019-10-04 15:51:12', '2019-10-30 15:51:21', '二愣子', '263745834538998', '2019-09-30 15:52:05', '2019-10-28 22:13:28', null, '1', '4');
INSERT INTO `license_applyinfo` VALUES ('8', '2', null, null, null, null, '2', null, null, null, null, null, null, null, null, null, null, '1', null);

-- ----------------------------
-- Table structure for license_image_company
-- ----------------------------
DROP TABLE IF EXISTS `license_image_company`;
CREATE TABLE `license_image_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `license_front` varchar(255) DEFAULT NULL COMMENT '驾驶证正面照',
  `license_back` varchar(255) DEFAULT NULL COMMENT '驾驶证背面照',
  `velicense_front` varchar(255) DEFAULT NULL COMMENT '机动驾驶证正面',
  `velicense_back` varchar(255) DEFAULT NULL COMMENT '机动驾驶证背面',
  `car_front` varchar(255) DEFAULT NULL COMMENT '车辆正面照（有车牌）',
  `car_back` varchar(255) DEFAULT NULL COMMENT '车辆背面照',
  `contract` varchar(255) DEFAULT NULL COMMENT '合同照片',
  `license_A` varchar(255) DEFAULT NULL COMMENT '甲方营业执照',
  `license_B` varchar(255) DEFAULT NULL COMMENT '乙方营业执照',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of license_image_company
-- ----------------------------
INSERT INTO `license_image_company` VALUES ('1', 'http://img2.imgtn.bdimg.com/it/u=4267960257,1042480437&fm=26&gp=0.jpg', 'http://img5.imgtn.bdimg.com/it/u=332257937,3338791380&fm=15&gp=0.jpg', 'http://img5.imgtn.bdimg.com/it/u=1672741377,1101970268&fm=26&gp=0.jpg', 'http://img0.imgtn.bdimg.com/it/u=2910842602,3300845256&fm=26&gp=0.jpg', 'http://img0.imgtn.bdimg.com/it/u=1945634756,4075657160&fm=26&gp=0.jpg', 'http://img5.imgtn.bdimg.com/it/u=203488864,3793027771&fm=15&gp=0.jpg', 'http://img4.imgtn.bdimg.com/it/u=3454527765,1006875497&fm=11&gp=0.jpg', 'http://img4.imgtn.bdimg.com/it/u=1395238607,2879389751&fm=15&gp=0.jpg', 'http://img4.imgtn.bdimg.com/it/u=3390748340,2841050442&fm=15&gp=0.jpg');
INSERT INTO `license_image_company` VALUES ('2', 'http://img4.imgtn.bdimg.com/it/u=3903458335,2344927303&fm=15&gp=0.jpg', 'http://img3.imgtn.bdimg.com/it/u=4043001827,2847731306&fm=26&gp=0.jpg', 'http://img1.imgtn.bdimg.com/it/u=3806881165,1615009096&fm=26&gp=0.jpg', 'http://img0.imgtn.bdimg.com/it/u=2836680768,2834051578&fm=15&gp=0.jpg', 'http://img2.imgtn.bdimg.com/it/u=3777942880,499631194&fm=26&gp=0.jpg', 'http://img4.imgtn.bdimg.com/it/u=811583437,1498126737&fm=26&gp=0.jpg', 'http://img4.imgtn.bdimg.com/it/u=3289435288,3499350898&fm=26&gp=0.jpg', 'http://img4.imgtn.bdimg.com/it/u=3690114820,256380900&fm=26&gp=0.jpg', 'http://img3.imgtn.bdimg.com/it/u=3880266746,2294673083&fm=26&gp=0.jpg');
INSERT INTO `license_image_company` VALUES ('3', null, null, null, null, null, null, null, null, null);
INSERT INTO `license_image_company` VALUES ('4', null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for license_image_person
-- ----------------------------
DROP TABLE IF EXISTS `license_image_person`;
CREATE TABLE `license_image_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `license_front` varchar(255) DEFAULT NULL COMMENT '驾驶证正面照',
  `license_back` varchar(255) DEFAULT NULL COMMENT '驾驶证背面照',
  `velicense_front` varchar(255) DEFAULT NULL COMMENT '机动驾驶证正面',
  `velicense_back` varchar(255) DEFAULT NULL COMMENT '机动驾驶证背面',
  `car_front` varchar(255) DEFAULT NULL COMMENT '车辆正面照（有车牌）',
  `car_back` varchar(255) DEFAULT NULL COMMENT '车辆背面照',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of license_image_person
-- ----------------------------
INSERT INTO `license_image_person` VALUES ('1', 'http://img5.imgtn.bdimg.com/it/u=1018258513,360300976&fm=26&gp=0.jpg', 'http://img0.imgtn.bdimg.com/it/u=2568989953,509272919&fm=26&gp=0.jpg', 'http://img2.imgtn.bdimg.com/it/u=1470829935,4000292745&fm=26&gp=0.jpg', 'http://img3.imgtn.bdimg.com/it/u=2744126419,3568227252&fm=26&gp=0.jpg', 'http://img2.imgtn.bdimg.com/it/u=1705895000,2767981534&fm=26&gp=0.jpg', 'http://img3.imgtn.bdimg.com/it/u=4163858232,3497630695&fm=26&gp=0.jpg');
INSERT INTO `license_image_person` VALUES ('2', 'http://img2.imgtn.bdimg.com/it/u=1705895000,2767981534&fm=26&gp=0.jpg', 'http://img3.imgtn.bdimg.com/it/u=1377851098,2128435361&fm=26&gp=0.jpg', 'http://img3.imgtn.bdimg.com/it/u=2925377407,3598218810&fm=26&gp=0.jpg', 'http://img3.imgtn.bdimg.com/it/u=2925377407,3598218810&fm=26&gp=0.jpg', 'http://img3.imgtn.bdimg.com/it/u=2925377407,3598218810&fm=26&gp=0.jpg', '');
INSERT INTO `license_image_person` VALUES ('3', null, null, null, null, null, null);
INSERT INTO `license_image_person` VALUES ('4', null, null, null, null, null, null);
INSERT INTO `license_image_person` VALUES ('5', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for message_inform
-- ----------------------------
DROP TABLE IF EXISTS `message_inform`;
CREATE TABLE `message_inform` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL COMMENT '系统推送消息内容',
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '1-已读，0-未读',
  `create_time` datetime DEFAULT NULL COMMENT '消息推送时间',
  PRIMARY KEY (`id`),
  KEY `fk2` (`user_id`),
  CONSTRAINT `fk2` FOREIGN KEY (`user_id`) REFERENCES `auth_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message_inform
-- ----------------------------

-- ----------------------------
-- Table structure for note_label
-- ----------------------------
DROP TABLE IF EXISTS `note_label`;
CREATE TABLE `note_label` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '后台管理员的id',
  `label` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk1` (`user_id`),
  CONSTRAINT `fk1` FOREIGN KEY (`user_id`) REFERENCES `auth_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of note_label
-- ----------------------------
INSERT INTO `note_label` VALUES ('3', '4', '增加标签');
INSERT INTO `note_label` VALUES ('4', '2', '审核通过');
INSERT INTO `note_label` VALUES ('5', '2', '照片模糊');
INSERT INTO `note_label` VALUES ('6', '2', '路段过长');
INSERT INTO `note_label` VALUES ('7', '1', '哈啊');
INSERT INTO `note_label` VALUES ('9', '4', 'SFSFA');
INSERT INTO `note_label` VALUES ('10', '4', 'FFA');
INSERT INTO `note_label` VALUES ('11', '4', 'FAS');
INSERT INTO `note_label` VALUES ('14', '4', '多大师傅师傅');
INSERT INTO `note_label` VALUES ('15', '4', '法法师舒服舒服');

-- ----------------------------
-- Table structure for pass_license_type
-- ----------------------------
DROP TABLE IF EXISTS `pass_license_type`;
CREATE TABLE `pass_license_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `license_type_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pass_license_type
-- ----------------------------
INSERT INTO `pass_license_type` VALUES ('1', '货运临时通行证');
INSERT INTO `pass_license_type` VALUES ('2', '货运长期通行证');
INSERT INTO `pass_license_type` VALUES ('3', '渣土车通行证');
INSERT INTO `pass_license_type` VALUES ('4', '大罐车同通行证');
INSERT INTO `pass_license_type` VALUES ('5', '危化品车通行证');
INSERT INTO `pass_license_type` VALUES ('6', '新能源车通行证');
INSERT INTO `pass_license_type` VALUES ('7', '皮卡通行证');
