package org.community.dao.impl;

import java.util.List;

import org.community.dao.FeeItemDao;
import org.community.model.FeeItem;
import org.springframework.stereotype.Component;

/**
 * 费用项DB相关操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/01/04
 */
@Component
public class FeeItemDaoImpl extends BaseDao implements FeeItemDao {

	public List<FeeItem> query(int communityId) {
		return this.sqlSession.selectList("org.community.dao.FeeItemDao.getAllFeeItemByCommunityId",communityId);
	}

	public FeeItem insert(FeeItem feeItem) {
		this.sqlSession.insert("org.community.dao.FeeItemDao.insertFeeItem", feeItem);
		return null;
	}

	public FeeItem update(FeeItem feeItem) {
		this.sqlSession.update("org.community.dao.FeeItemDao.updateFeeItem", feeItem);
		return null;
	}

	public FeeItem drop(FeeItem feeItem) {
		this.sqlSession.update("org.community.dao.FeeItemDao.dropFeeItem", feeItem);		
		return null;
	}

	public FeeItem delete(FeeItem feeItem) {
		this.sqlSession.delete("org.community.dao.FeeItemDao.deleteFeeItem", feeItem);
		return null;
	}

}
