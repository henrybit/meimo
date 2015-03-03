CREATE TABLE `property_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '物业ID',
  `property_name` varchar(1024) DEFAULT NULL COMMENT '物业名称',
  `login_name` varchar(512) DEFAULT NULL COMMENT '登陆账户',
  `password` varchar(512) DEFAULT NULL COMMENT '密码',
  `email` varchar(512) DEFAULT NULL COMMENT '邮箱',
  `telephone` varchar(512) DEFAULT NULL COMMENT '联系方式',
  `status` int(4) DEFAULT 1 COMMENT '账户状态:1-新注册,2-可用，3-审核未通过，4-禁用,5-停用',
  `description` varchar(512) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '数据创建的时间',
  `update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新的时间',
  `data_status` tinyint(4) DEFAULT 1 COMMENT '数据状态：0-无效，1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin