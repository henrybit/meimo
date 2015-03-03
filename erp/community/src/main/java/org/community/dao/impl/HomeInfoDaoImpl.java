package org.community.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.community.dao.HomeInfoDao;
import org.community.model.HomeInfo;
import org.community.util.ConvertTools;
import org.springframework.stereotype.Component;

/**
 * 房屋信息相关DB操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
@Component
public class HomeInfoDaoImpl extends BaseDao implements HomeInfoDao {

	@Override
	public List<HomeInfo> query(int communityid, int pageNo, int pageNum) {
		RowBounds rowBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.HomeInfoDao.getList", communityid, rowBounds);
	}

	//TODO
	@Override
	public List<HomeInfo> queryByUid(int communityid, long uid, int pageNo, int pageNum) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("communityid", ConvertTools.intToString(communityid));
		map.put("uid", ConvertTools.longToString(uid));
		RowBounds rowBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.HomeInfoDao.getListByUid", map, rowBounds);
	}

	@Override
	public HomeInfo queryById(long id) {
		return this.sqlSession.selectOne("org.community.dao.HomeInfoDao.getById", id);
	}

	@Override
	public int addOne(HomeInfo homeInfo) {
		return this.sqlSession.insert("org.community.dao.HomeInfoDao.addOne", homeInfo);
	}

	@Override
	public int updateOne(HomeInfo homeInfo) {
		return this.sqlSession.update("org.community.dao.HomeInfoDao.updateOne", homeInfo);
	}

	@Override
	public int deleteOne(HomeInfo homeInfo) {
		return this.sqlSession.delete("org.community.dao.HomeInfoDao.deleteOne", homeInfo);
	}

	@Override
	public int dropOne(HomeInfo homeInfo) {
		return this.sqlSession.update("org.community.dao.HomeInfoDao.dropOne", homeInfo);
	}
	
}
