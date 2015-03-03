CREATE TABLE `community_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '社区ID',
  `community_name` varchar(128) DEFAULT NULL COMMENT '社区名',
  `developer_name` varchar(128) DEFAULT NULL COMMENT '开发商',
  `property_id` int(11) DEFAULT 0 COMMENT '物业ID',
  `address` varchar(1024) DEFAULT NULL COMMENT '社区地址',
  `province` varchar(45) DEFAULT NULL COMMENT '省份',
  `city` varchar(45) DEFAULT NULL COMMENT '城市',
  `county` varchar(45) DEFAULT NULL COMMENT '县',
  `build_area` float(10,2) DEFAULT -1 COMMENT '建筑面积',
  `used_area` float(10,2) DEFAULT -1 COMMENT '使用面积',
  `covered_area` float(10,2) DEFAULT -1 COMMENT '占地面积',
  `road_area` float(10,2) DEFAULT -1 COMMENT '道路面积',
  `green_area` float(10,2) DEFAULT -1 COMMENT '绿化面积',
  `description` varchar(1024) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '数据创建的时间',
  `update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新的时间',
  `data_status` tinyint(4) DEFAULT 1 COMMENT '数据状态：0-无效，1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin