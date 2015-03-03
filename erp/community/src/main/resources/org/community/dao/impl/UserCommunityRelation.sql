CREATE TABLE `user_community_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `uid` bigint(20) NOT NULL COMMENT '用户ID',
  `cid` int(11) NOT NULL COMMENT '社区ID',
  `create_time` datetime DEFAULT NULL COMMENT '数据创建的时间',
  `update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新的时间',
  `data_status` tinyint(4) DEFAULT 1 COMMENT '数据状态：0-无效，1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin