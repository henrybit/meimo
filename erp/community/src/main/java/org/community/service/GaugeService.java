package org.community.service;

import java.util.List;

import org.community.param.WaterGaugeParam;
import org.community.vo.ElectricGaugeVO;
import org.community.vo.GasGaugeVO;
import org.community.vo.WaterGaugeVO;

/**
 * 读表相关服务Service层<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
public interface GaugeService {
	/**
	 * 分页获取某个社区的水表集合<br>
	 * @param communityid 社区ID
	 * @param pageNo 分页号
	 * @param pageNum 一页的数量
	 * @return List<WaterGaugeVO>-水表集合
	 */
	List<WaterGaugeVO> getWaterGaugeList(int communityid, int pageNo, int pageNum);
	
	/**
	 * 分页获取某个社区的电表集合<br>
	 * @param communityid 社区ID
	 * @param pageNo 分页号
	 * @param pageNum 一页的数量
	 * @return List<ElectricGaugeVO>-电表集合
	 */
	List<ElectricGaugeVO> getElectricGaugeList(int communityid, int pageNo, int pageNum);
	
	/**
	 * 分页获取某个社区的天然气表集合<br>
	 * @param communityid 社区ID
	 * @param pageNo 分页号
	 * @param pageNum 一页的数量
	 * @return List<GasGaugeVO>-天然气表集合
	 */
	List<GasGaugeVO> getGasGaugeList(int communityid, int pageNo, int pageNum);
	
	/**
	 * 根据水表ID获取水表信息<br>
	 * @param id 水表ID
	 * @return WaterGaugeVO
	 */
	WaterGaugeVO getWaterGauge(long id);
	
	/**
	 * 根据电表ID获取电表信息<br>
	 * @param id 电表ID
	 * @return ElectricGaugeVO
	 */
	ElectricGaugeVO getElectricGauge(long id);
	
	/**
	 * 根据天然气表ID获取天然气信息<br>
	 * @param id 天然气表ID
	 * @return GasGaugeVO
	 */
	GasGaugeVO getGasGauge(long id);
	
	/**
	 * 更新指定的水表数据<br>
	 * @param vo 水表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean updateWaterGauge(WaterGaugeVO vo);
	/**
	 * 更新指定的电表数据<br>
	 * @param vo 电表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean updateElectricGauge(ElectricGaugeVO vo);
	/**
	 * 更新指定的天然气表数据<br>
	 * @param vo 天然气表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean updateGasGauge(GasGaugeVO vo);
	/**
	 * 增加指定的水表数据<br>
	 * @param vo 水表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean addWaterGauge(WaterGaugeVO vo);
	/**
	 * 增加指定的电表数据<br>
	 * @param vo 电表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean addElectricGauge(ElectricGaugeVO vo);
	/**
	 * 增加指定的天然气表数据<br>
	 * @param vo 天然气表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean addGasGauge(GasGaugeVO vo);
	/**
	 * 逻辑删除指定的水表数据<br>
	 * @param vo 水表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean dropWaterGauge(WaterGaugeVO vo);
	/**
	 * 逻辑删除指定的电表数据<br>
	 * @param vo 电表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean dropElectricGauge(ElectricGaugeVO vo);
	/**
	 * 逻辑删除指定的天然气表数据<br>
	 * @param vo 天然气表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean dropGasGauge(GasGaugeVO vo);
	/**
	 * 物理删除指定的水表数据<br>
	 * @param vo 水表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean deleteWaterGauge(WaterGaugeVO vo);
	/**
	 * 物理删除指定的电表数据<br>
	 * @param vo 电表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean deleteElectricGauge(ElectricGaugeVO vo);
	/**
	 * 物理删除指定的天然气表数据<br>
	 * @param vo 天然气表数据VO
	 * @return boolean-true:成功;false:失败.
	 */
	boolean deleteGasGauge(GasGaugeVO vo);
	/**
	 * 高级查询（提供复杂的前端检索条件进行搜索符合条件的数据集合）<br>
	 * @param waterGaugeParam 查询条件对象
	 * @return List-符合条件的对象集合
	 */
	List<WaterGaugeVO> queryWaterGaugeListByParam(WaterGaugeParam waterGaugeParam);
}
