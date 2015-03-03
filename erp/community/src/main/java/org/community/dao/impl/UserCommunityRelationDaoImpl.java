package org.community.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.community.dao.UserCommunityRelationDao;
import org.community.model.UserCommunityRelation;
import org.springframework.stereotype.Component;

/**
 * 用户与社区关系Dao<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/28
 */
@Component
public class UserCommunityRelationDaoImpl extends BaseDao implements UserCommunityRelationDao {

	@Override
	public List<UserCommunityRelation> queryByCid(int communityid, int pageNo, int pageNum) {
		RowBounds rowBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.UserCommunityRelationDao.getList", communityid, rowBounds);
	}

	@Override
	public int addOne(UserCommunityRelation userCommunityRelation) {
		return this.sqlSession.insert("org.community.dao.UserCommunityRelationDao.addOne", userCommunityRelation);
	}

	@Override
	public int updateOne(UserCommunityRelation userCommunityRelation) {
		return this.sqlSession.update("org.community.dao.UserCommunityRelationDao.updateOne", userCommunityRelation);
	}

	@Override
	public int dropOne(UserCommunityRelation userCommunityRelation) {
		return this.sqlSession.update("org.community.dao.UserCommunityRelationDao.dropOne", userCommunityRelation);
	}

	@Override
	public int deleteOne(UserCommunityRelation userCommunityRelation) {
		return this.sqlSession.delete("org.community.dao.UserCommunityRelationDao.deleteOne", userCommunityRelation);
	}
	
}
