package org.community.dao;

import java.util.List;
import java.util.Map;

import org.community.model.WaterGauge;
import org.community.model.complex.ComplexWaterGauge;

/**
 * 水表Dao相关操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2014/02/25
 */
public interface WaterGaugeDao extends GaugeDao<WaterGauge> {
	/**
	 * 根据Map检索水表信息<br>
	 * @param map 检索条件
	 * @param pageNo 分页号
	 * @param pageNum 分页数量
	 * @return List-符合条件的集合
	 */
	List<ComplexWaterGauge> queryListComplex(Map<String, String> map, int pageNo, int pageNum);
}
