package org.community.dao;

import java.util.List;
import java.util.Map;

import org.community.model.HomeGaugeRelation;

/**
 * 房屋与表关系DB操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
public interface HomeGaugeRelationDao {
	/**
	 * 根据房屋ID获取相关表数据<br>
	 * @param homeId 房屋ID
	 * @return HomeGaugeRelation
	 */
	HomeGaugeRelation query(long homeId);
	
	/**
	 * 根据水表ID集合查询符合的关系集合<br>
	 * @param waterGaugeIds 水表ID集合
	 * @return map-key:水表ID，HomeGaugeRelation:房屋与表的关系图
	 */
	Map<Long, HomeGaugeRelation> queryByWaterGauge(List<Long> waterGaugeIds);
}
