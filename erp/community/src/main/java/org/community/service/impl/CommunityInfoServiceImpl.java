package org.community.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.community.dao.CommunityInfoDao;
import org.community.model.CommunityInfo;
import org.community.service.CommunityInfoService;
import org.community.util.ConvertTools;
import org.community.util.TimeTools;
import org.community.vo.CommunityInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 社区信息service层<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/03
 */
@Service
public class CommunityInfoServiceImpl extends BaseService implements CommunityInfoService {

	@Autowired
	private CommunityInfoDao communityInfoDao;
	public CommunityInfoDao getCommunityInfoDao() {
		return communityInfoDao;
	}
	public void setCommunityInfoDao(CommunityInfoDao communityInfoDao) {
		this.communityInfoDao = communityInfoDao;
	}

	
	@Override
	public List<CommunityInfoVO> getByPropertyId(int propertyid) {
		List<CommunityInfoVO> voList = new ArrayList<CommunityInfoVO>();
		try {
			List<CommunityInfo> modelList = this.communityInfoDao.queryByPid(propertyid);
			for(CommunityInfo ci : modelList) {
				CommunityInfoVO vo = ConvertTools.communityInfoModelToVo(ci);
				voList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return voList;
	}

	@Override
	public CommunityInfoVO getById(int communityid) {
		CommunityInfoVO vo = null;
		try {
			CommunityInfo communityInfo = this.communityInfoDao.queryById(communityid);
			vo = ConvertTools.communityInfoModelToVo(communityInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public boolean addOne(CommunityInfoVO communityInfoVo) {
		boolean success = false;
		try {
			CommunityInfo communityInfo = ConvertTools.communityInfoVoToModel(communityInfoVo);
			communityInfo.setCreateTime(TimeTools.getCurrentTime());
			int lineNum = this.communityInfoDao.addOne(communityInfo);
			if(lineNum > 0) {
				success = true;
				communityInfoVo.setId(communityInfo.getId());
			}
		} catch (Exception e) {
			success = false;
		}
		return success;
	}

	@Override
	public boolean updateOne(CommunityInfoVO communityInfoVo) {
		boolean success = false;
		try {
			CommunityInfo communityInfo = ConvertTools.communityInfoVoToModel(communityInfoVo);
			int lineNum = this.communityInfoDao.updateOne(communityInfo);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}

	@Override
	public boolean dropOne(CommunityInfoVO communityInfoVo) {
		boolean success = false;
		try {
			CommunityInfo communityInfo = ConvertTools.communityInfoVoToModel(communityInfoVo);
			int lineNum = this.communityInfoDao.dropOne(communityInfo);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}

	@Override
	public boolean deleteOne(CommunityInfoVO communityInfoVo) {
		boolean success = false;
		try {
			CommunityInfo communityInfo = ConvertTools.communityInfoVoToModel(communityInfoVo);
			int lineNum = this.communityInfoDao.deleteOne(communityInfo);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	
}
