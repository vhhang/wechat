/*
Navicat MySQL Data Transfer

Source Server         : aaaa
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : wechat

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2019-01-25 20:12:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for source
-- ----------------------------
DROP TABLE IF EXISTS `source`;
CREATE TABLE `source` (
  `source_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源id',
  `source_name` varchar(255) DEFAULT NULL COMMENT '资源名',
  `source_url` varchar(255) DEFAULT NULL COMMENT '资源链接',
  `source_pwd` varchar(255) DEFAULT NULL COMMENT '资源密码',
  `source_type` int(10) DEFAULT NULL COMMENT '0，电影',
  PRIMARY KEY (`source_id`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of source
-- ----------------------------
INSERT INTO `source` VALUES ('60', '寄生兽', 'https://pan.baidu.com/s/1D8QvigTZrNwnn3suI3PMcg ', '54dO', '0');
INSERT INTO `source` VALUES ('61', '龙猫2018', 'https://pan.baidu.com/s/1ERZ0mjMR-vvDgARFo31Wwg ', 'w7Mq', '0');
INSERT INTO `source` VALUES ('62', '黄飞鸿之怒海雄风', 'https://pan.baidu.com/s/1e1FcOBv4ARaP2qlyOZ8PSA ', '9MYn', '0');
INSERT INTO `source` VALUES ('63', '印度合伙人/护垫侠 ', 'https://pan.baidu.com/s/1sqjj30F_11WktimWp7S40w ', '6G62', '0');
INSERT INTO `source` VALUES ('64', '羊与钢的森林', 'https://pan.baidu.com/s/1qjAWI_lUq3x2W41h_GDJNA ', '20Bq', '0');
INSERT INTO `source` VALUES ('65', '狗十三', 'https://pan.baidu.com/s/1AH4-peOyfaKNPZyfAl-KXw ', 'NGJ3', '0');
INSERT INTO `source` VALUES ('66', '海王', 'https://pan.baidu.com/s/1j4c4JbL16b5Q-SslMNxAHg ', 'LhkZ', '0');
INSERT INTO `source` VALUES ('67', '昨日青空高清版！！！', 'https://pan.baidu.com/s/1vZ6jmpVOoelOGWdt3c6p2Q ', 'i563', '0');
INSERT INTO `source` VALUES ('68', '死神真人版', 'https://pan.baidu.com/s/1uMNu1cHjrW87MxricCzbaQ ', 'MQSw', '0');
INSERT INTO `source` VALUES ('69', '雪怪大冒险', 'https://pan.baidu.com/s/1Z0MgfiTqUpR2sly9By1YoQ ', '5231', '0');
INSERT INTO `source` VALUES ('70', '小美人鱼真人版', 'https://pan.baidu.com/s/15x14I1LP9MM-TNK0J3E05g ', '8o58', '0');
INSERT INTO `source` VALUES ('71', '影 高清', 'https://pan.baidu.com/s/138IKTyL7Ei6IVb2nu9ZNlg ', '8Sye', '0');
INSERT INTO `source` VALUES ('72', '森林奇缘', 'https://pan.baidu.com/s/1BJ9KuwoMwQbK4QnvNHguZQ ', '1Z7U', '0');
INSERT INTO `source` VALUES ('73', '恋如雨止', 'https://pan.baidu.com/s/1ONMiy0H8oPc_y9gOWpZ9EA ', 'oN6h', '0');
INSERT INTO `source` VALUES ('74', '无敌破坏王2种子', 'https://pan.baidu.com/s/1ZixUa-EDuhgFGdGPgEfUvw ', '7q85', '0');
INSERT INTO `source` VALUES ('75', '无敌破坏王2视频', 'https://pan.baidu.com/s/1t6XfwzPVn5KgmubvtGt7Ug ', '4cS7  ', '0');
INSERT INTO `source` VALUES ('76', '神奇动物2', 'https://pan.baidu.com/s/1cZgz-qrO7CCnb_KxyR0oKw ', 'Y3SU', '0');
INSERT INTO `source` VALUES ('77', '憨豆特工3', 'https://pan.baidu.com/s/1_Z9adzeghs6KmPecQ2Pfzg ', 'a5G0', '0');
INSERT INTO `source` VALUES ('78', '大象席地而坐', 'https://pan.baidu.com/s/1n75NSiyEMw8ORnJy9yNcow ', 'W3P2', '0');
INSERT INTO `source` VALUES ('79', '无名之辈种子', 'https://pan.baidu.com/s/1V-shqUHPujtMrlSOiLSdsA ', '3m06', '0');
INSERT INTO `source` VALUES ('80', '无名之辈视频', 'https://pan.baidu.com/s/18i2JO7jpIqU2ebZnHLkSiQ ', 'Q64b', '0');
INSERT INTO `source` VALUES ('81', '一个明星的诞生', 'https://pan.baidu.com/s/1GMnovblyhECW8u6TX5iQBw ', '3U9i  ', '0');
INSERT INTO `source` VALUES ('82', '胡桃夹子与四个王国', 'https://pan.baidu.com/s/1rWkx0OMrmBfP6s5fZP0EHA ', 'ZM3J', '0');
INSERT INTO `source` VALUES ('83', '悲伤逆流成河高清版', 'https://pan.baidu.com/s/1KU3jYXE4zcDOLG3d7j5ZrA ', 'LO7x', '0');
INSERT INTO `source` VALUES ('84', '有5个姐姐 ', 'https://pan.baidu.com/s/1AUzpRUek1sdKe3Yh4OjnqQ ', 'cCzJ', '0');
INSERT INTO `source` VALUES ('85', '女哭声', 'https://pan.baidu.com/s/1kppuQVNlRHiG0zwHywRcxg ', '8O95', '0');
INSERT INTO `source` VALUES ('86', '猖獗', 'https://pan.baidu.com/s/1eCWdf9Dg7rSKKxVYxFzHIg ', '2XgV', '0');
INSERT INTO `source` VALUES ('87', '蜡笔小新剧场版-功夫男孩', 'https://pan.baidu.com/s/1d4V640JJd2G1KdtY9MMlSw ', 'r982', '0');
INSERT INTO `source` VALUES ('88', '新灰姑娘', 'https://pan.baidu.com/s/1dWH5-bA29AbfNbrh-PdfAQ ', '91L0', '0');
INSERT INTO `source` VALUES ('89', '哆啦A梦大雄的金银岛', 'https://pan.baidu.com/s/1qYcqC2MnegixcCeK97nnVg ', '6Bt3', '0');
INSERT INTO `source` VALUES ('90', '铁血战士高清版', 'https://pan.baidu.com/s/1zy98lKgqKFRwoiLJldRNXQ ', '049B', '0');
INSERT INTO `source` VALUES ('91', '流浪猫鲍勃', 'https://pan.baidu.com/s/1clDv1q1N50GwNncFeGwBJw ', '24k2', '0');
INSERT INTO `source` VALUES ('92', '生化危机', 'https://pan.baidu.com/s/1j3ZD3z8jYvCPypMZc3sDIw ', '7WB0', '0');
INSERT INTO `source` VALUES ('93', '狄仁杰之西域妖姬', 'https://pan.baidu.com/s/1jHbfQiST6dJBg4-z24iB1g ', 'eJ4U', '0');
INSERT INTO `source` VALUES ('94', '超大号美人', 'https://pan.baidu.com/s/1oqeGnJpmrYN-eThPqqy1sg ', '6G8w', '0');
INSERT INTO `source` VALUES ('95', '新哆啦A梦', 'https://pan.baidu.com/s/100BQ19daiCrVGQkWVGGIWQ ', '85Lh', '0');
INSERT INTO `source` VALUES ('96', '鬼修女', 'https://pan.baidu.com/s/1S2DMBx0q09Bl9ycaEJnNEw ', '754G', '0');
INSERT INTO `source` VALUES ('97', '瞒天过海美人计', 'https://pan.baidu.com/s/1mconFaXU_WSCrR4VdHatXQ ', 'UWJ9', '0');
INSERT INTO `source` VALUES ('98', '花牌情缘：终结', 'https://pan.baidu.com/s/1oJ-YfyT7f553De-5soe6FA ', 'Q4pB', '0');
INSERT INTO `source` VALUES ('99', '西虹市首富（超清）', 'https://pan.baidu.com/s/1h2HJWFi1ZgVPMMy2DhvIfg ', '912p', '0');
INSERT INTO `source` VALUES ('100', '生化危机1-6 ', 'https://pan.baidu.com/s/1uAwwGBkhflqHacx-lgPTjg ', '832j', '0');
INSERT INTO `source` VALUES ('101', '大闹西游', 'https://pan.baidu.com/s/1VhHax1LKdLdILGIwV-9tnQ ', 'f8F0', '0');
