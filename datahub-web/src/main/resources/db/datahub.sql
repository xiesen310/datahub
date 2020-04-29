/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : datahub

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-04-29 09:15:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_business
-- ----------------------------
DROP TABLE IF EXISTS `tb_business`;
CREATE TABLE `tb_business` (
  `business_id` varchar(50) NOT NULL DEFAULT '' COMMENT '业务id',
  `business_name` varchar(50) DEFAULT NULL COMMENT '业务名称',
  `business_comments` varchar(1024) DEFAULT NULL COMMENT '业务描述',
  PRIMARY KEY (`business_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='业务表';

-- ----------------------------
-- Records of tb_business
-- ----------------------------
INSERT INTO `tb_business` VALUES ('1', '111', '111');
INSERT INTO `tb_business` VALUES ('2', '111', '111');

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role` (
  `role_id` varchar(50) NOT NULL DEFAULT '' COMMENT '角色id 主键',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of tb_role
-- ----------------------------

-- ----------------------------
-- Table structure for tb_topic_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_topic_info`;
CREATE TABLE `tb_topic_info` (
  `topic_id` varchar(50) NOT NULL DEFAULT '' COMMENT 'topic id 主键',
  `topic_name` varchar(50) DEFAULT NULL COMMENT '主题名称',
  `partition_num` int(3) DEFAULT NULL COMMENT '分区数',
  `replication_num` int(3) DEFAULT NULL COMMENT '副本数',
  `ttl` int(11) DEFAULT NULL COMMENT '生命周期',
  `config` varchar(512) DEFAULT NULL COMMENT '配置信息',
  `user_id` varchar(50) DEFAULT NULL COMMENT '用户id',
  `comments` varchar(1000) DEFAULT NULL COMMENT '描述信息',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`topic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='topic 信息';

-- ----------------------------
-- Records of tb_topic_info
-- ----------------------------

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` varchar(50) NOT NULL COMMENT '用户主键',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `paas_word` varchar(100) DEFAULT NULL COMMENT '密码',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `status` int(2) DEFAULT NULL COMMENT '状态',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of tb_user
-- ----------------------------

-- ----------------------------
-- Table structure for tb_user_to_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_to_role`;
CREATE TABLE `tb_user_to_role` (
  `user_to_role_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户角色id',
  `user_id` varchar(50) DEFAULT NULL COMMENT '用户id',
  `role_id` varchar(50) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`user_to_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色映射表';

-- ----------------------------
-- Records of tb_user_to_role
-- ----------------------------
