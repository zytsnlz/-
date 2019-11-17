/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : car

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2019-11-17 17:26:51
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_identifyinfo
-- ----------------------------
INSERT INTO `account_identifyinfo` VALUES ('1', '1', '张三一', '189276739297', '72384732947920', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=1e33b0fc305e39f668dc312f6f07c7be&imgtype=0&src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F110715%2F9128-110G514440969.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=645474b70daae9ed7017cac27c0770f6&imgtype=0&src=http%3A%2F%2Fpic27.nipic.com%2F20130326%2F1682937_000918100000_2.jpg', '2019-09-30 16:18:20', null, '1', '百度有限公司', null, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434027&di=22ae3071aa9f03e737914bd10440cac3&imgtype=0&src=http%3A%2F%2Fwww.81.cn%2Fsyjdt%2Fattachement%2Fjpg%2Fsite351%2F20141003%2F180373316289159906c707.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434026&di=47416dba19595e19c71461f821e2d2de&imgtype=0&src=http%3A%2F%2Fup.enterdesk.com%2Fedpic%2Fa2%2F25%2F96%2Fa22596afdffcc0fa234ec904a1b800d8.jpg', null, '0', null);
INSERT INTO `account_identifyinfo` VALUES ('2', '2', '李四一', '189263756288', '12342343534534', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434028&di=2ec5e6b43a5b99106640a70b4039bdd3&imgtype=0&src=http%3A%2F%2Fpic34.nipic.com%2F20131023%2F8821914_221904429000_2.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=1e33b0fc305e39f668dc312f6f07c7be&imgtype=0&src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F110715%2F9128-110G514440969.jpg', '2019-11-01 15:18:26', null, '0', '', null, '', '', null, '0', null);
INSERT INTO `account_identifyinfo` VALUES ('3', '3', '王五', '156378283789', '35464565467567', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434028&di=b0e285a308d789adfa0e9169172e7512&imgtype=0&src=http%3A%2F%2Fpic11.nipic.com%2F20101125%2F2457331_114536300000_2.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434027&di=22ae3071aa9f03e737914bd10440cac3&imgtype=0&src=http%3A%2F%2Fwww.81.cn%2Fsyjdt%2Fattachement%2Fjpg%2Fsite351%2F20141003%2F180373316289159906c707.jpg', '2019-12-02 16:18:31', '2019-11-17 17:24:26', '1', '腾讯有限公司', null, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434028&di=2ec5e6b43a5b99106640a70b4039bdd3&imgtype=0&src=http%3A%2F%2Fpic34.nipic.com%2F20131023%2F8821914_221904429000_2.jpg', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2860396138,3400477231&fm=26&gp=0.jpg', '爱上对方说', '2', '4');
INSERT INTO `account_identifyinfo` VALUES ('4', '2', '李四二', '152738738934', '23748375945989', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=1e33b0fc305e39f668dc312f6f07c7be&imgtype=0&src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F110715%2F9128-110G514440969.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434027&di=c25b76498d4cda8c47cc8906cf4f8b8f&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-08-15%2F5b739582b7e78.jpg', '2019-12-03 16:19:00', '2019-11-17 17:19:15', '0', null, null, '', '', '水电费水电费', '1', '4');
INSERT INTO `account_identifyinfo` VALUES ('5', '1', '张三二', '189263756288', '12342343534534', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434028&di=b0e285a308d789adfa0e9169172e7512&imgtype=0&src=http%3A%2F%2Fpic11.nipic.com%2F20101125%2F2457331_114536300000_2.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=645474b70daae9ed7017cac27c0770f6&imgtype=0&src=http%3A%2F%2Fpic27.nipic.com%2F20130326%2F1682937_000918100000_2.jpg', '2019-12-04 16:19:06', null, '1', '爱奇艺有限公司', null, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998938522&di=1e33b0fc305e39f668dc312f6f07c7be&imgtype=0&src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F110715%2F9128-110G514440969.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434023&di=7850b95cc180772a48052c3a37695ffa&imgtype=0&src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201401%2F28%2F20140128234326_HGPSf.thumb.700_0.jpeg', null, '0', null);
INSERT INTO `account_identifyinfo` VALUES ('6', '4', '李志琪', '172634824789', '3463763284738947389', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1573915001741&di=83f4ac9deb2074811e35ec0aae9a7769&imgtype=0&src=http%3A%2F%2Fimg2015.zdface.com%2F20180627%2F87b365bb4faeab2f0604450c6c0f579e.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1573914890321&di=ca827a8b9027fa9915b1404c52093bcd&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201803%2F19%2F20180319175413_lEYlj.thumb.700_0.jpeg', '2019-12-05 16:19:10', null, '0', null, null, '', '', null, '0', null);

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
  PRIMARY KEY (`id`)
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
  `id` int(20) NOT NULL AUTO_INCREMENT,
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='后台用户表';

-- ----------------------------
-- Records of auth_user
-- ----------------------------
INSERT INTO `auth_user` VALUES ('1', 'justin', '$2a$10$yVYD6IQ2cfIAm6zK32ogO.zflrAbLMzlEEsOLHwmwsPsEg9NpoOAG', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572593660&di=f287fd59a69e610b32df21eb22149294&imgtype=jpg&er=1&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-06-27%2F5b33706749475.jpg', 'string', 'string1', '32642748@qq.com', '18267364832', '2019-10-20 20:26:59', '2019-10-20 20:21:16', '1');
INSERT INTO `auth_user` VALUES ('2', 'string', '$2a$10$Ys/NYkA1.M5JU9x//ITyQ.0Ddieu1WZ3RvCTlIjPnq2EwQBwXcJo.', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998954332&di=f52c79f6cd423a96c9e8816e1160dee7&imgtype=jpg&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D312440173%2C484202537%26fm%3D214%26gp%3D0.jpg', 'string', 'string2', '2637264872@qq.com', '18725365778', '2019-10-20 20:34:08', '2019-10-20 20:32:07', '1');
INSERT INTO `auth_user` VALUES ('3', 'zyt', '$2a$10$4W2xcRvuoCfNcDbCNL5C0.Veqg8DnADjAOtpfDvbcRgFLY3ftCR.O', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998954332&di=f52c79f6cd423a96c9e8816e1160dee7&imgtype=jpg&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D312440173%2C484202537%26fm%3D214%26gp%3D0.jpg', 'string', 'string3', '346873@163.com', '15626376483', '2019-10-20 20:38:58', '2019-10-20 20:32:07', '1');
INSERT INTO `auth_user` VALUES ('4', 'admin', '$2a$10$E/5Z1HZeAD5XHeBe13Td0uhsQ1x9iLGKjSvrj6HEwYc2.ZoBab492', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571998954332&di=f52c79f6cd423a96c9e8816e1160dee7&imgtype=jpg&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D312440173%2C484202537%26fm%3D214%26gp%3D0.jpg', 'string', 'string4', '346378@qq.com', '15926376788', '2019-10-20 21:28:26', '2019-10-20 21:07:31', '1');

-- ----------------------------
-- Table structure for auth_user_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `auth_user_role_relation`;
CREATE TABLE `auth_user_role_relation` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) DEFAULT NULL,
  `role_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='后台用户和角色关系表';

-- ----------------------------
-- Records of auth_user_role_relation
-- ----------------------------
INSERT INTO `auth_user_role_relation` VALUES ('1', '1', '1');
INSERT INTO `auth_user_role_relation` VALUES ('2', '2', '0');
INSERT INTO `auth_user_role_relation` VALUES ('3', '3', '1');
INSERT INTO `auth_user_role_relation` VALUES ('4', '4', '3');

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
  `pass_license_type` varchar(255) DEFAULT NULL COMMENT '通行证类型',
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of license_applyinfo
-- ----------------------------
INSERT INTO `license_applyinfo` VALUES ('1', '1', '4', null, '冀A2376483', '黄牌', '短期通行证', '唐山', '沧州', '北京路，长寿路', '2019-10-09 17:48:33', '2019-10-17 17:53:22', '李四', '232482983748933', '2019-10-24 17:48:58', '2019-11-06 22:13:10', '安顺高速对光反射', '0', '4');
INSERT INTO `license_applyinfo` VALUES ('2', '2', null, '1', '冀B34737658', '蓝牌', '长期通行证', '天津', '北京', '上下九，帅特龙', '2019-10-07 17:53:16', '2019-10-22 17:53:27', '大傻', '347839659356839', '2019-10-21 17:53:52', '2019-11-01 22:13:15', null, '0', '2');
INSERT INTO `license_applyinfo` VALUES ('3', '3', '3', null, '冀A2376483', '黄牌', '短期通行证', '唐山', '秦皇岛', '荔湾区，天河区', '2019-10-24 17:54:53', '2019-10-25 17:54:56', '二蛋', '237489234693856', '2019-10-18 17:55:17', '2019-10-28 22:13:19', null, '0', '4');
INSERT INTO `license_applyinfo` VALUES ('4', '1', '2', null, '京C3748379', '蓝牌', '短期通行证', '南昌', '上饶', '紫金山，白云区', '2019-10-10 15:51:07', '2019-10-31 15:51:16', '三傻子', '348573289759309', '2019-10-09 15:51:59', '2019-10-31 22:13:23', null, '0', '2');
INSERT INTO `license_applyinfo` VALUES ('5', '1', '1', null, '赣D8437830', '黄牌', '长期通行证', '武汉', '重庆', '海珠区，坑口', '2019-10-04 15:51:12', '2019-10-30 15:51:21', '二愣子', '263745834538998', '2019-09-30 15:52:05', '2019-10-28 22:13:28', null, '0', '4');

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
INSERT INTO `license_image_company` VALUES ('1', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521796&di=fbc621e6ba45e37f75bb692e793283ff&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fd%2F56e7d6e2a1e56.jpg', '%2F89%2F111%2FceZXuwwDtXoUE.jpg', '%2F89%2F111%2FceZXuwwDtXoUE.jpg', '120619220I962.jpg', '%2F20130818095959193.jpg', '%2F20131205%2F13970765_125528427354_2.jpg', '%2F201511%2F30%2F20151130171033_TvuSd.jpeg', '21%2FU105P28T3D758524F326DT20050621155734.jpg', '%2F89%2F111%2FceZXuwwDtXoUE.jpg');
INSERT INTO `license_image_company` VALUES ('2', '%2F201511%2F30%2F20151130171033_TvuSd.jpeg', '%2F20130818095959193.jpg', '%2F201511%2F30%2F20151130171033_TvuSd.jpeg', '120619220I962.jpg', '%2F20130818095959193.jpg', '21%2FU105P28T3D758524F326DT20050621155734.jpg', '%2F20131205%2F13970765_125528427354_2.jpg', '%2F201511%2F30%2F20151130171033_TvuSd.jpeg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521796&di=d44037fd596f15bee0b397e7f46b259d&imgtype=0&src=http%3A%2F%2Fpic18.nipic.com%2F20111223%2F2457331_222522032324_2.jpg');
INSERT INTO `license_image_company` VALUES ('3', '%2F89%2F111%2FceZXuwwDtXoUE.jpg', '%2F20131205%2F13970765_125528427354_2.jpg', '%2F201511%2F30%2F20151130171033_TvuSd.jpeg', '%2F89%2F111%2FceZXuwwDtXoUE.jpg', '%2F89%2F111%2FceZXuwwDtXoUE.jpg', '%2F89%2F111%2FceZXuwwDtXoUE.jpg', '%2F20130818095959193.jpg', '120619220I962.jpg', '%2F201511%2F30%2F20151130171033_TvuSd.jpeg');
INSERT INTO `license_image_company` VALUES ('4', '120619220I962.jpg', '%2F20130818095959193.jpg', '120619220I962.jpg', '%2F201511%2F30%2F20151130171033_TvuSd.jpeg', '120619220I962.jpg', '%2F89%2F111%2FceZXuwwDtXoUE.jpg', '%2F89%2F111%2FceZXuwwDtXoUE.jpg', '%2F201511%2F30%2F20151130171033_TvuSd.jpeg', '21%2FU105P28T3D758524F326DT20050621155734.jpg');

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
INSERT INTO `license_image_person` VALUES ('1', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434023&di=4f798c91be06058d1735bb8f9ba6feff&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fblog%2F201511%2F30%2F20151130171033_TvuSd.jpeg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521798&di=60f39a9dfc75d29520c62b23e84dc826&imgtype=0&src=http%3A%2F%2Fimg.taopic.com%2Fuploads%2Fallimg%2F120702%2F201976-120F20Z40884.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434020&di=2a59e82b105c6817183df01877898d8c&imgtype=0&src=http%3A%2F%2Fbpic.588ku.com%2Felement_origin_min_pic%2F16%2F07%2F08%2F23577fcc09f0600.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521800&di=71311878460dfd748aba1e48c92e4f7f&imgtype=0&src=http%3A%2F%2Fimg.taopic.com%2Fuploads%2Fallimg%2F120619%2F188078-120619220I962.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434022&di=005e3c0aaa263a0da4816d00aaa92009&imgtype=0&src=http%3A%2F%2Fimage2.sina.com.cn%2Fent%2Fd%2F2005-06-21%2FU105P28T3D758524F326DT20050621155734.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521799&di=3e382dbd4fff983f5a3ebe8a066c6828&imgtype=0&src=http%3A%2F%2Fimg01.taopic.com%2F141018%2F235088-14101Q0233999.jpg');
INSERT INTO `license_image_person` VALUES ('2', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434022&di=005e3c0aaa263a0da4816d00aaa92009&imgtype=0&src=http%3A%2F%2Fimage2.sina.com.cn%2Fent%2Fd%2F2005-06-21%2FU105P28T3D758524F326DT20050621155734.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434021&di=5fa8ba5685cddebef118199828c7ec06&imgtype=0&src=http%3A%2F%2Fimg2.zol.com.cn%2Fproduct%2F89%2F111%2FceZXuwwDtXoUE.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434023&di=eba40072368f9935c854898d9b3887bd&imgtype=0&src=http%3A%2F%2Fpic36.nipic.com%2F20131205%2F13970765_125528427354_2.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521797&di=e25e7d27e50d4d489904cb86a827f004&imgtype=0&src=http%3A%2F%2Fwww.022meishu.com%2Fuploadfile%2F20130818095959193.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000605862&di=131bdfc525f343fe54933524027c8198&imgtype=jpg&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D291557912%2C3137627084%26fm%3D214%26gp%3D0.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521797&di=693c6ff985080e0ef27b71d7db1c8dbb&imgtype=0&src=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20150318%2Fyewandemaotouyingyijiarenshishangshiliangdongwuchahua_4024572.jpg');
INSERT INTO `license_image_person` VALUES ('3', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521798&di=60f39a9dfc75d29520c62b23e84dc826&imgtype=0&src=http%3A%2F%2Fimg.taopic.com%2Fuploads%2Fallimg%2F120702%2F201976-120F20Z40884.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434022&di=005e3c0aaa263a0da4816d00aaa92009&imgtype=0&src=http%3A%2F%2Fimage2.sina.com.cn%2Fent%2Fd%2F2005-06-21%2FU105P28T3D758524F326DT20050621155734.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521797&di=e25e7d27e50d4d489904cb86a827f004&imgtype=0&src=http%3A%2F%2Fwww.022meishu.com%2Fuploadfile%2F20130818095959193.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521796&di=db683f8994f934a43843cccfa45cec0f&imgtype=0&src=http%3A%2F%2Fpic17.nipic.com%2F20111011%2F8574312_144542232117_2.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521796&di=fbc621e6ba45e37f75bb692e793283ff&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fd%2F56e7d6e2a1e56.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521799&di=3e382dbd4fff983f5a3ebe8a066c6828&imgtype=0&src=http%3A%2F%2Fimg01.taopic.com%2F141018%2F235088-14101Q0233999.jpg');
INSERT INTO `license_image_person` VALUES ('4', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521800&di=71311878460dfd748aba1e48c92e4f7f&imgtype=0&src=http%3A%2F%2Fimg.taopic.com%2Fuploads%2Fallimg%2F120619%2F188078-%2F201511%2F30%2F20151130171033_TvuSd.jpeg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434023&di=4f798c91be06058d1735bb8f9ba6feff&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fblog%2F201511%2F30%2F20151130171033_TvuSd.jpeg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434022&di=005e3c0aaa263a0da4816d00aaa92009&imgtype=0&src=http%3A%2F%2Fimage2.sina.com.cn%2Fent%2Fd%2F2005-06-21%2FU105P28T3D758524F326DT20050621155734.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434021&di=5fa8ba5685cddebef118199828c7ec06&imgtype=0&src=http%3A%2F%2Fimg2.zol.com.cn%2Fproduct%2F89%2F111%2FceZXuwwDtXoUE.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434020&di=2a59e82b105c6817183df01877898d8c&imgtype=0&src=http%3A%2F%2Fbpic.588ku.com%2Felement_origin_min_pic%2F16%2F07%2F08%2F23577fcc09f0600.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000605862&di=131bdfc525f343fe54933524027c8198&imgtype=jpg&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D291557912%2C3137627084%26fm%3D214%26gp%3D0.jpg');
INSERT INTO `license_image_person` VALUES ('5', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434023&di=eba40072368f9935c854898d9b3887bd&imgtype=0&src=http%3A%2F%2Fpic36.nipic.com%2F20131205%2F13970765_125528427354_2.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434020&di=2a59e82b105c6817183df01877898d8c&imgtype=0&src=http%3A%2F%2Fbpic.588ku.com%2Felement_origin_min_pic%2F16%2F07%2F08%2F23577fcc09f0600.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434021&di=5fa8ba5685cddebef118199828c7ec06&imgtype=0&src=http%3A%2F%2Fimg2.zol.com.cn%2Fproduct%2F89%2F111%2FceZXuwwDtXoUE.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434022&di=005e3c0aaa263a0da4816d00aaa92009&imgtype=0&src=http%3A%2F%2Fimage2.sina.com.cn%2Fent%2Fd%2F2005-06-21%2FU105P28T3D758524F326DT20050621155734.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572000521797&di=693c6ff985080e0ef27b71d7db1c8dbb&imgtype=0&src=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20150318%2Fyewandemaotouyingyijiarenshishangshiliangdongwuchahua_4024572.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571999434023&di=4f798c91be06058d1735bb8f9ba6feff&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fblog%2F201511%2F30%2F20151130171033_TvuSd.jpeg');

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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message_inform
-- ----------------------------
INSERT INTO `message_inform` VALUES ('1', '1', '审核成功', '0', '2019-11-05 16:44:44');
INSERT INTO `message_inform` VALUES ('2', '2', 'chengnng ', '0', '2019-11-05 00:00:00');
INSERT INTO `message_inform` VALUES ('3', '4', '用户认证审核通过', '0', '2019-11-17 17:19:15');
INSERT INTO `message_inform` VALUES ('5', '3', '用户认证审核未通过', '0', '2019-11-17 17:24:26');
INSERT INTO `message_inform` VALUES ('6', '3', '用户认证审核未通过', '0', '2019-11-17 17:24:26');

-- ----------------------------
-- Table structure for note_label
-- ----------------------------
DROP TABLE IF EXISTS `note_label`;
CREATE TABLE `note_label` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '后台管理员的id',
  `label` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of note_label
-- ----------------------------
INSERT INTO `note_label` VALUES ('1', '4', '神经兮兮');
INSERT INTO `note_label` VALUES ('2', '4', '逼逼赖赖');
INSERT INTO `note_label` VALUES ('3', '4', '增加标签');
INSERT INTO `note_label` VALUES ('4', '2', '审核通过');
INSERT INTO `note_label` VALUES ('5', '2', '照片模糊');
INSERT INTO `note_label` VALUES ('6', '2', '路段过长');
INSERT INTO `note_label` VALUES ('7', '1', '哈啊');
INSERT INTO `note_label` VALUES ('9', '4', 'SFSFA');
INSERT INTO `note_label` VALUES ('10', '4', 'FFA');
INSERT INTO `note_label` VALUES ('11', '4', 'FAS');
INSERT INTO `note_label` VALUES ('13', '4', '哈哈哈');
