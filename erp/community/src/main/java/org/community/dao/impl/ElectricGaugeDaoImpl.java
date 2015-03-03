package org.community.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.community.dao.ElectricGaugeDao;
import org.community.model.ElectricGauge;
import org.springframework.stereotype.Component;

/**
 * 电表DB相关操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
@Component
public class ElectricGaugeDaoImpl extends BaseDao implements ElectricGaugeDao {

	@Override
	public List<ElectricGauge> query(int communityid, int pageNo, int pageNum) {
		RowBounds rawBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.ElectricGaugeDao.getList", communityid, rawBounds);
	}

	@Override
	public List<ElectricGauge> queryByUid(int communityid, long uid,
			int pageNo, int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ElectricGauge> queryByHid(int communityid, long hid,
			int pageNo, int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElectricGauge queryById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateOneById(ElectricGauge t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addOne(ElectricGauge t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int dropOne(ElectricGauge t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(ElectricGauge t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
