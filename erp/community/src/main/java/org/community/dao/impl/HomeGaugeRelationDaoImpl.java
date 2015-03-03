package org.community.dao.impl;

import java.util.List;
import java.util.Map;

import org.community.dao.HomeGaugeRelationDao;
import org.community.model.HomeGaugeRelation;
import org.springframework.stereotype.Component;

/**
 * TODO
 * 房屋与表相关关系DB操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
@Component
public class HomeGaugeRelationDaoImpl implements HomeGaugeRelationDao {

	@Override
	public HomeGaugeRelation query(long homeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Long, HomeGaugeRelation> queryByWaterGauge(
			List<Long> waterGaugeIds) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
