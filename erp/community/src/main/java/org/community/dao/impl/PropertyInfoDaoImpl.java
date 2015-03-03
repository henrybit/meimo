package org.community.dao.impl;

import org.community.dao.PropertyInfoDao;
import org.community.model.PropertyInfo;
import org.springframework.stereotype.Component;

/**
 * 物业信息Dao<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/28
 */
@Component
public class PropertyInfoDaoImpl extends BaseDao implements PropertyInfoDao {

	@Override
	public PropertyInfo queryById(int propertyId) {
		return this.sqlSession.selectOne("org.community.dao.PropertyInfoDao.getById", propertyId);
	}

	@Override
	public int addOne(PropertyInfo propertyInfo) {
		return this.sqlSession.insert("org.community.dao.PropertyInfoDao.addOne", propertyInfo);
	}

	@Override
	public int updateOne(PropertyInfo propertyInfo) {
		return this.sqlSession.update("org.community.dao.PropertyInfoDao.updateOne", propertyInfo);
	}

	@Override
	public int dropOne(PropertyInfo propertyInfo) {
		return this.sqlSession.update("org.community.dao.PropertyInfoDao.dropOne", propertyInfo);
	}

	@Override
	public int deleteOne(PropertyInfo propertyInfo) {
		return this.sqlSession.delete("org.community.dao.PropertyInfoDao.deleteOne", propertyInfo);
	}
	@Override
	public PropertyInfo queryByLogin(PropertyInfo propertyInfo) {
		return this.sqlSession.selectOne("org.community.dao.PropertyInfoDao.getByLogin", propertyInfo);
	}

}
