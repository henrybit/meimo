package org.community.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.community.dao.UserCommunityRelationDao;
import org.community.dao.UserInfoDao;
import org.community.model.UserCommunityRelation;
import org.community.model.UserInfo;
import org.community.service.UserService;
import org.community.util.Constant;
import org.community.util.ConvertTools;
import org.community.util.TimeTools;
import org.community.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户相关服务<br>
 * @author henrybit
 * @version 1.0
 * @since 2014/12/12
 */
@Service
public class UserServiceImpl extends BaseService implements UserService{
	@Autowired
	private UserInfoDao userInfoDao;
	@Autowired
	private UserCommunityRelationDao userCommunityRelationDao;
	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
	public UserCommunityRelationDao getUserCommunityRelationDao() {
		return userCommunityRelationDao;
	}
	public void setUserCommunityRelationDao(
			UserCommunityRelationDao userCommunityRelationDao) {
		this.userCommunityRelationDao = userCommunityRelationDao;
	}
	/**
	 * @deprecated
	 * @param userName
	 * @return
	 */
	public UserInfoVO getUser(String userName) {
		UserInfoVO userInfo = null;
		try {
			UserInfo user = new UserInfo();
			user.setUserName(userName);
		} catch (Exception e) {
			logger.error("UserService getUser exception:", e);
		}
		
		return userInfo;
	}
	@Override
	public List<UserInfoVO> getUserList(int communityid, int pageNo, int pageNum) {
		List<UserInfoVO> voList = new ArrayList<UserInfoVO>();
		try {
			List<UserCommunityRelation> rList = this.userCommunityRelationDao.queryByCid(communityid, pageNo, pageNum);
			List<Long> uids = new ArrayList<Long>();
			for(UserCommunityRelation ucr : rList) {
				uids.add(ucr.getUserid());
			}
			HashMap<String,Object> map = new HashMap<String, Object>();
			if(uids.size() > 0)
				map.put("uids", uids);
			List<UserInfo> userInfoList = this.userInfoDao.query(map);
			for(UserInfo userInfo : userInfoList) {
				UserInfoVO vo = ConvertTools.userInfoModelToVo(userInfo);
				voList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return voList;
	}
	
	@Override
	public boolean addUserInfo(UserInfoVO vo) {
		boolean success = false;
		try {
			UserInfo userinfo = ConvertTools.userInfoVoToModel(vo);
			userinfo.setCreateTime(TimeTools.getCurrentTime());
			userinfo.setDataStatus(Constant.DATA_STATUS_VALID);
			Date birthDay = userinfo.getBirthDay();
			Date now = new Date();
			int age = now.getYear()-birthDay.getYear();
			userinfo.setAge(age);
			int lineNum = this.userInfoDao.addOne(userinfo);
			if(lineNum > 0) {
				success = true;
				vo.setId(userinfo.getId());
			}
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	
	@Override
	public boolean updateUserInfo(UserInfoVO vo) {
		boolean success = false;
		try {
			UserInfo userinfo = ConvertTools.userInfoVoToModel(vo);
			int lineNum = this.userInfoDao.updateOne(userinfo);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	
	@Override
	public boolean dropUserInfo(UserInfoVO vo) {
		boolean success = false;
		try {
			UserInfo userinfo = ConvertTools.userInfoVoToModel(vo);
			int lineNum = this.userInfoDao.dropOne(userinfo);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	@Override
	public boolean deleteUserInfo(UserInfoVO vo) {
		boolean success = false;
		try {
			UserInfo userinfo = ConvertTools.userInfoVoToModel(vo);
			int lineNum = this.userInfoDao.deleteOne(userinfo);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	
	@Override
	public UserInfoVO getUserById(long id) {
		UserInfoVO vo = null;
		try {
			UserInfo userInfo = this.userInfoDao.queryById(id);
			vo = ConvertTools.userInfoModelToVo(userInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	@Override
	public boolean addUserCommunityRelation(long uid, int communityid) {
		boolean success = false;
		try {
			UserCommunityRelation userCommunityRelation = new UserCommunityRelation();
			userCommunityRelation.setUserid(uid);
			userCommunityRelation.setCommunityid(communityid);
			userCommunityRelation.setCreateTime(TimeTools.getCurrentTime());
			userCommunityRelation.setDataStatus(Constant.DATA_STATUS_VALID);
			int lineNum = this.userCommunityRelationDao.addOne(userCommunityRelation);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	@Override
	public List<UserInfoVO> getUserListByMap(Map map, int pageNo, int pageNum) {
		List<UserInfoVO> voList = new ArrayList<UserInfoVO>();
		try {
			List<UserInfo> userInfoList = this.userInfoDao.queryByMap(map, pageNo, pageNum);
			for(UserInfo userInfo : userInfoList) {
				UserInfoVO vo = ConvertTools.userInfoModelToVo(userInfo);
				voList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return voList;
	}
}
