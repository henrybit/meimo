CREATE TABLE `home_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '房屋ID',
  `community_id` int(11) DEFAULT NULL COMMENT '社区ID',
  `home_no` varchar(256) DEFAULT NULL COMMENT '房屋编号',
  `building_no` varchar(256) DEFAULT NULL COMMENT '楼栋号',
  `type` int(8) DEFAULT NULL COMMENT '房间类型：1-1居室,2-2居室,3-3居室,4-4居室,5-复式房,6-别墅',
  `build_area` float(8,1) DEFAULT NULL COMMENT '建筑面积',
  `used_area` float(8,1) DEFAULT NULL COMMENT '使用面积',
  `pool_area` float(8,1) DEFAULT NULL COMMENT '公摊面积',
  `struct_pic` varchar(1024) DEFAULT NULL COMMENT '户型图',
  `builded_year` int(8) DEFAULT NULL COMMENT '建筑面积',
  `age` int(8) DEFAULT NULL COMMENT '房龄',
  `description` varchar(1024) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '数据创建的时间',
  `update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新的时间',
  `data_status` tinyint(4) DEFAULT 1 COMMENT '数据状态：0-无效，1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin