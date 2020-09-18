/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 18/09/2020 14:26:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '学术部');
INSERT INTO `dept` VALUES (2, '教职部');
INSERT INTO `dept` VALUES (3, '财务部');
INSERT INTO `dept` VALUES (4, '管理部');
INSERT INTO `dept` VALUES (5, '管理部2');
INSERT INTO `dept` VALUES (6, '测试注解');
INSERT INTO `dept` VALUES (7, '测试注解');
INSERT INTO `dept` VALUES (8, '学术部');
INSERT INTO `dept` VALUES (9, '学术部6');
INSERT INTO `dept` VALUES (10, '学术部7');
INSERT INTO `dept` VALUES (11, '学术部6');
INSERT INTO `dept` VALUES (12, '学术部7');

SET FOREIGN_KEY_CHECKS = 1;
