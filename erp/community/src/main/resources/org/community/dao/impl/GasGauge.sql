create table `gas_gauge` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '天然气表主键ID',
  `no` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '天然气表编号',
  `community_id` int(11) DEFAULT NULL COMMENT '社区ID',
  `type` tinyint(4) DEFAULT NULL COMMENT '天然气表类型:1-住户，2-商铺，3-公摊',
  `num` float(12,5) DEFAULT NULL COMMENT '天然气表读数',
  `operator` varchar(512) DEFAULT NULL COMMENT '读表员',
  `year` int(8) DEFAULT NULL COMMENT '读数的年',
  `month` int(8) DEFAULT NULL COMMENT '读数的月',
  `create_time` datetime DEFAULT NULL COMMENT '数据创建的时间',
  `update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新的时间',
  `data_status` tinyint(4) DEFAULT 1 COMMENT '数据状态：0-无效，1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin
