package org.community.dao;

import java.util.List;

import org.community.model.FeeItem;

/**
 * 费用项Dao<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/01/04
 */
public interface FeeItemDao {
	/**
	 * 根据社区ID查询所有费用项<br>
	 * @param communityId
	 * @return List
	 */
	List<FeeItem> query(int communityId);
	
	/**
	 * 插入一条费用项数据<br>
	 * @param feeItem
	 * @return FeeItem
	 */
	FeeItem insert(FeeItem feeItem);
	
	/**
	 * 更新一条费用项数据<br>
	 * @param feeItem
	 * @return FeeItem
	 */
	FeeItem update(FeeItem feeItem);
	
	/**
	 * 逻辑删除一条费用项数据<br>
	 * @param feeItem
	 * @return FeeItem
	 */
	FeeItem drop(FeeItem feeItem);
	
	/**
	 * 物理删除一条费用项数据<br>
	 * @param feeItem
	 * @return FeeItem
	 */
	FeeItem delete(FeeItem feeItem);
}
