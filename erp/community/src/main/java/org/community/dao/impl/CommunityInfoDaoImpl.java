package org.community.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.community.dao.CommunityInfoDao;
import org.community.model.CommunityInfo;
import org.springframework.stereotype.Component;

/**
 * 社区信息Dao<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/28
 */
@Component
public class CommunityInfoDaoImpl extends BaseDao implements CommunityInfoDao {

	@Override
	public List<CommunityInfo> query(int pageNo, int pageNum) {
		RowBounds rowBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.CommunityInfoDao.getList", null, rowBounds);
	}

	@Override
	public CommunityInfo queryById(int communityid) {
		return this.sqlSession.selectOne("org.community.dao.CommunityInfoDao.getById", communityid);
	}

	@Override
	public int addOne(CommunityInfo communityInfo) {
		return this.sqlSession.insert("org.community.dao.CommunityInfoDao.addOne", communityInfo);
	}

	@Override
	public int updateOne(CommunityInfo communityInfo) {
		return this.sqlSession.update("org.community.dao.CommunityInfoDao.updateOne", communityInfo);
	}

	@Override
	public int deleteOne(CommunityInfo communityInfo) {
		return this.sqlSession.delete("org.community.dao.CommunityInfoDao.deleteOne", communityInfo);
	}

	@Override
	public int dropOne(CommunityInfo communityInfo) {
		return this.sqlSession.update("org.community.dao.CommunityInfoDao.dropOne", communityInfo);
	}

	@Override
	public List<CommunityInfo> queryByPid(int propertyid) {
		return this.sqlSession.selectList("org.community.dao.CommunityInfoDao.getListByPid", propertyid);
	}
	
}
