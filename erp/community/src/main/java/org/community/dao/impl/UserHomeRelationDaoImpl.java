package org.community.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.community.dao.UserHomeRelationDao;
import org.community.model.UserHomeRelation;
import org.springframework.stereotype.Component;

/**
 * 用户与房屋关系Dao<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/02
 */
@Component
public class UserHomeRelationDaoImpl extends BaseDao implements UserHomeRelationDao {

	@Override
	public List<UserHomeRelation> queryByCid(int communityid, int pageNo, int pageNum) {
		RowBounds rowBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.UserHomeRelationDao.getList", communityid, rowBounds);
	}

	@Override
	public int addOne(UserHomeRelation userHomeRelation) {
		return this.sqlSession.insert("org.community.dao.UserHomeRelationDao.addOne", userHomeRelation);
	}

	@Override
	public int updateOne(UserHomeRelation userHomeRelation) {
		return this.sqlSession.update("org.community.dao.UserHomeRelationDao.updateOne", userHomeRelation);
	}

	@Override
	public int deleteOne(UserHomeRelation userHomeRelation) {
		return this.sqlSession.delete("org.community.dao.UserHomeRelationDao.deleteOne", userHomeRelation);
	}

	@Override
	public int dropOne(UserHomeRelation userHomeRelation) {
		return this.sqlSession.update("org.community.dao.UserHomeRelationDao.dropOne", userHomeRelation);
	}

}
