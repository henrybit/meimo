package org.community.service.impl;

import org.community.dao.PropertyInfoDao;
import org.community.model.PropertyInfo;
import org.community.service.PropertyInfoService;
import org.community.util.Constant;
import org.community.util.ConvertTools;
import org.community.util.TimeTools;
import org.community.vo.PropertyInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 物业信息Service层<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/02
 */
@Service
public class PropertyInfoServiceImpl extends BaseService implements PropertyInfoService {
	@Autowired
	private PropertyInfoDao propertyInfoDao;
	public PropertyInfoDao getPropertyInfoDao() {
		return propertyInfoDao;
	}
	public void setPropertyInfoDao(PropertyInfoDao propertyInfoDao) {
		this.propertyInfoDao = propertyInfoDao;
	}

	@Override
	public PropertyInfoVO queryById(int id) {
		PropertyInfoVO vo = null;
		try {
			PropertyInfo propertyInfo = this.propertyInfoDao.queryById(id);
			vo = ConvertTools.propertyInfoModelToVo(propertyInfo);
		} catch (Exception e){
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public boolean addOne(PropertyInfoVO vo) {
		boolean success = false;
		try {
			PropertyInfo propertyInfo = ConvertTools.propertyInfoVoToModel(vo);
			propertyInfo.setCreateTime(TimeTools.getCurrentTime());
			propertyInfo.setDataStatus(Constant.DATA_STATUS_VALID);
			int lineNum = this.propertyInfoDao.addOne(propertyInfo);
			if(lineNum > 0) {
				success = true;
				vo.setId(propertyInfo.getId());
			}
		} catch (Exception e) {
			success = false;
		}
		return success;
	}

	@Override
	public boolean updateOne(PropertyInfoVO vo) {
		boolean success = false;
		try {
			PropertyInfo propertyInfo = ConvertTools.propertyInfoVoToModel(vo);
			int lineNum = this.propertyInfoDao.updateOne(propertyInfo);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}

	@Override
	public boolean dropOne(PropertyInfoVO vo) {
		boolean success = false;
		try {
			PropertyInfo propertyInfo = ConvertTools.propertyInfoVoToModel(vo);
			int lineNum = this.propertyInfoDao.dropOne(propertyInfo);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}

	@Override
	public boolean deleteOne(PropertyInfoVO vo) {
		boolean success = false;
		try {
			PropertyInfo propertyInfo = ConvertTools.propertyInfoVoToModel(vo);
			int lineNum = this.propertyInfoDao.deleteOne(propertyInfo);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	@Override
	public PropertyInfoVO queryByLogin(String loginName, String password) {
		PropertyInfoVO vo = null;
		try {
			PropertyInfo propertyInfo = new PropertyInfo();
			propertyInfo.setLoginName(loginName);
			propertyInfo.setPassword(password);
			propertyInfo = this.propertyInfoDao.queryByLogin(propertyInfo);
			vo = ConvertTools.propertyInfoModelToVo(propertyInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo; 
	}
	
}
