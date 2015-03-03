package org.community.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * DB操作基类<br>
 * 注入Spring的SqlSessionTemplate，该类实现MyBatis的SqlSession，拥有线程安全的特性<br>
 * @author henrybit
 * @version 1.0
 * @since 2014/12/13
 */
@Component
public class BaseDao{
	@Autowired
	public SqlSessionTemplate sqlSession;

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
}
