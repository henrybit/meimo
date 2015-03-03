package org.community.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.community.dao.WaterGaugeDao;
import org.community.model.WaterGauge;
import org.community.model.complex.ComplexWaterGauge;
import org.springframework.stereotype.Component;

/**
 * 水表Dao相关操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
@Component
public class WaterGaugeDaoImpl extends BaseDao implements WaterGaugeDao {

	@Override
	public List query(int communityid, int pageNo, int pageNum) {
		//mybatis的逻辑分页-改造物理分页
		RowBounds rowBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.WaterGaugeDao.getList", communityid, rowBounds);
	}

	@Override
	public List queryByUid(int communityid, long uid, int pageNo, int pageNum) {
		// TODO
		return null;
	}

	@Override
	public List queryByHid(int communityid, long hid, int pageNo, int pageNum) {
		// TODO
		return null;
	}

	@Override
	public WaterGauge queryById(long id) {
		return this.sqlSession.selectOne("org.community.dao.WaterGaugeDao.getById", id);
	}

	@Override
	public int updateOneById(WaterGauge waterGauge) {
		return this.sqlSession.update("org.community.dao.WaterGaugeDao.updateOne", waterGauge);
	}

	@Override
	public List<ComplexWaterGauge> queryListComplex(Map<String, String> map, int pageNo, int pageNum) {
		RowBounds rowBounds = new RowBounds(pageNo, pageNum);
		return this.sqlSession.selectList("org.community.dao.WaterGaugeDao.queryListComplex", map, rowBounds);
	}

	@Override
	public int addOne(WaterGauge waterGauge) {
		return this.sqlSession.insert("org.community.dao.WaterGaugeDao.addOne", waterGauge);
	}

	@Override
	public int dropOne(WaterGauge waterGauge) {
		return this.sqlSession.update("org.community.dao.WaterGaugeDao.dropOne", waterGauge);
	}

	@Override
	public int deleteOne(WaterGauge waterGauge) {
		return this.sqlSession.delete("org.community.dao.WaterGaugeDao.deleteOne", waterGauge);
	}
	
}
