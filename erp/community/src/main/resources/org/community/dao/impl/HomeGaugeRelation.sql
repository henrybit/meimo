create table home_gauge_relation (
  `id` bigint DEFAULT NULL AUTO_INCREMENT COMMENT '主键ID',
  `home_id` bigint DEFAULT NULL COMMENT '房间ID',
  `community_id` int DEFAULT NULL COMMENT '社区ID',
  `water_gauge_id` bigint DEFAULT NULL COMMENT '水表ID',
  `electric_gauge_id` bigint DEFAULT NULL COMMENT '电表ID',
  `gas_gauge_id` bigint DEFAULT NULL COMMENT '天然气表ID',
  `pure_water_gauge_id` bigint DEFAULT NULL COMMENT '纯净水表ID',
  `create_time` datetime DEFAULT NULL COMMENT '数据创建的时间',
  `update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新的时间',
  `data_status` tinyint(4) DEFAULT 1 COMMENT '数据状态：0-无效，1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin
