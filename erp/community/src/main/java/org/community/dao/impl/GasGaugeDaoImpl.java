package org.community.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.community.dao.GasGaugeDao;
import org.community.model.GasGauge;
import org.springframework.stereotype.Component;

/**
 * 天然气表DB相关操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
@Component
public class GasGaugeDaoImpl extends BaseDao implements GasGaugeDao {

	@Override
	public List<GasGauge> query(int communityid, int pageNo, int pageNum) {
		RowBounds rawBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.GasGaugeDao.getList", communityid, rawBounds);
	}

	@Override
	public List<GasGauge> queryByUid(int communityid, long uid, int pageNo,
			int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GasGauge> queryByHid(int communityid, long hid, int pageNo,
			int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GasGauge queryById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateOneById(GasGauge t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addOne(GasGauge t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int dropOne(GasGauge t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(GasGauge t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
