package org.community.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.community.dao.UserInfoDao;
import org.community.model.UserInfo;
import org.springframework.stereotype.Component;

/**
 * 用户相关DB操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2014/12/13
 */
@Component
public class UserInfoDaoImpl extends BaseDao implements UserInfoDao {

	@Override
	public List<UserInfo> query(Map map) {
		return this.sqlSession.selectList("org.community.dao.UserInfoDao.getList", map);
	}

	@Override
	public UserInfo queryById(long id) {
		return this.sqlSession.selectOne("org.community.dao.UserInfoDao.getById", id);
	}

	@Override
	public int addOne(UserInfo userinfo) {
		return this.sqlSession.insert("org.community.dao.UserInfoDao.addOne", userinfo);
	}

	@Override
	public int updateOne(UserInfo userinfo) {
		return this.sqlSession.update("org.community.dao.UserInfoDao.updateOne", userinfo);
	}

	@Override
	public int dropOne(UserInfo userinfo) {
		return this.sqlSession.update("org.community.dao.UserInfoDao.dropOne", userinfo);
	}

	@Override
	public int deleteOne(UserInfo userinfo) {
		return this.sqlSession.delete("org.community.dao.UserInfoDao.deleteOne", userinfo);
	}

	@Override
	public List<UserInfo> queryByMap(Map map, int pageNo, int pageNum) {
		RowBounds rowBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.UserInfoDao.getListByMap", map, rowBounds);
	}
}
