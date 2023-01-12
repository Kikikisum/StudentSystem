/*
 Navicat Premium Data Transfer

 Source Server         : Students
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 12/01/2023 20:52:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `num` int NULL DEFAULT NULL,
  `stu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `enter_time` datetime NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES (20, 'StudentMangerSystem.Student@510f3d34', '2023-01-12 00:00:00');
INSERT INTO `class` VALUES (20, 'StudentMangerSystem.Student@2de23121', '2023-01-12 00:00:00');
INSERT INTO `class` VALUES (19, 'StudentMangerSystem.Student@c0c2f8d', '2023-01-12 00:00:00');
INSERT INTO `class` VALUES (20, 'StudentMangerSystem.Student@1ff4931d', '2023-01-12 00:00:00');
INSERT INTO `class` VALUES (20, 'StudentMangerSystem.Student@4009e306', '2023-01-12 00:00:00');
INSERT INTO `class` VALUES (19, 'StudentMangerSystem.Student@22fcf7ab', '2023-01-12 00:00:00');

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students`  (
  `sid` int NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `age` int NOT NULL,
  `classnum` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES (12, '叶耶耶', 18, '20');
INSERT INTO `students` VALUES (13, '赵羊羊', 25, '20');
INSERT INTO `students` VALUES (19, '段短短', 28, '52');

SET FOREIGN_KEY_CHECKS = 1;
