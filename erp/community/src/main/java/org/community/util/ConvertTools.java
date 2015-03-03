package org.community.util;

import org.community.model.CommunityInfo;
import org.community.model.ElectricGauge;
import org.community.model.GasGauge;
import org.community.model.PropertyInfo;
import org.community.model.UserInfo;
import org.community.model.WaterGauge;
import org.community.model.complex.ComplexWaterGauge;
import org.community.param.CommunityInfoParam;
import org.community.param.PropertyInfoParam;
import org.community.param.UserParam;
import org.community.param.WaterGaugeParam;
import org.community.vo.CommunityInfoVO;
import org.community.vo.ElectricGaugeVO;
import org.community.vo.GasGaugeVO;
import org.community.vo.PropertyInfoVO;
import org.community.vo.UserInfoVO;
import org.community.vo.WaterGaugeVO;

/**
 * 对象转换工具<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/26
 */
public class ConvertTools {
	/**
	 * 前端请求参数转换成VO格式<br>
	 * @param WaterGaugeParam 前端请求参数
	 * @return WaterGaugeVO-VO数据格式
	 */
	public static WaterGaugeVO waterGaugeParamToVo(WaterGaugeParam param) {
		WaterGaugeVO vo = new WaterGaugeVO();
		try {
			vo.setId(param.getId());
			vo.setNo(param.getNo());
			vo.setCommunityid(param.getCommunityid());
			vo.setType(param.getType());
			vo.setBuildingNo(param.getBuildingNo());
			vo.setHomeNo(param.getHomeNo());
			vo.setNum(param.getNum());
			vo.setOperator(param.getOperator());
			vo.setYear(param.getYear());
			vo.setMonth(param.getMonth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	/**
	 * 水表数据的Model转换成VO<br>
	 * @param waterGauge model数据格式
	 * @return WaterGaugeVO-VO数据格式
	 */
	public static WaterGaugeVO waterGaugeModelToVo(WaterGauge waterGauge) {
		WaterGaugeVO vo = new WaterGaugeVO();
		try {
			//读表主键ID（唯一）
			vo.setId(waterGauge.getId());
			//读表编号
			vo.setNo(waterGauge.getNo());
			//社区ID
			vo.setCommunityid(waterGauge.getCommunityid());
			//读表类型：1-住户，2-商铺，3-公摊
			vo.setType(waterGauge.getType());
			//所属楼栋号
			vo.setBuildingNo("XXX");
			//所属房间号
			vo.setHomeNo("XXXX");
			//读表数
			vo.setNum(waterGauge.getNum());
			//操作员
			vo.setOperator(waterGauge.getOperator());
			//读数的日期-年
			vo.setYear(waterGauge.getYear());
			//读数的日期-月
			vo.setMonth(waterGauge.getMonth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	/**
	 * 水表数据的VO转成Model<br>
	 * @param WaterGaugeVO-VO数据格式
	 * @return WaterGauge-model数据格式
	 */
	public static WaterGauge waterGaugeVoToModel(WaterGaugeVO vo) {
		WaterGauge waterGauge = new WaterGauge();
		try {
			//读表主键ID（唯一）
			waterGauge.setId(vo.getId());
			//读表编号
			waterGauge.setNo(vo.getNo());
			//社区ID
			waterGauge.setCommunityid(vo.getCommunityid());
			//读表类型：1-住户，2-商铺，3-公摊
			waterGauge.setType(vo.getType());
			//读表数
			waterGauge.setNum(vo.getNum());
			//操作员
			waterGauge.setOperator(vo.getOperator());
			//读数的日期-年
			waterGauge.setYear(vo.getYear());
			//读数的日期-月
			waterGauge.setMonth(vo.getMonth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return waterGauge;
	}
	/**
	 * 电表数据的Model转换成VO<br>
	 * @param electricGauge model数据格式
	 * @return ElectricGaugeVO-VO数据格式
	 */
	public static ElectricGaugeVO electricGaugeModelToVo(ElectricGauge electricGauge) {
		ElectricGaugeVO vo = new ElectricGaugeVO();
		try {
			//读表主键ID（唯一）
			vo.setId(electricGauge.getId());
			//读表编号
			vo.setNo(electricGauge.getNo());
			//社区ID
			vo.setCommunityid(electricGauge.getCommunityid());
			//读表类型：1-住户，2-商铺，3-公摊
			vo.setType(electricGauge.getType());
			//所属楼栋号
			vo.setBuildingNo("XXX");
			//所属房间号
			vo.setHomeNo("XXXX");
			//读表数
			vo.setNum(electricGauge.getNum());
			//操作员
			vo.setOperator(electricGauge.getOperator());
			//读数的日期-年
			vo.setYear(electricGauge.getYear());
			//读数的日期-月
			vo.setMonth(electricGauge.getMonth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	/**
	 * 电表数据的VO转成Model<br>
	 * @param ElectricGaugeVO-VO数据格式
	 * @return ElectricGauge-model数据格式
	 */
	public static ElectricGauge electricGaugeVoToModel(ElectricGaugeVO vo) {
		ElectricGauge electricGauge = new ElectricGauge();
		try {
			//读表主键ID（唯一）
			electricGauge.setId(vo.getId());
			//读表编号
			electricGauge.setNo(vo.getNo());
			//社区ID
			electricGauge.setCommunityid(vo.getCommunityid());
			//读表类型：1-住户，2-商铺，3-公摊
			electricGauge.setType(vo.getType());
			//读表数
			electricGauge.setNum(vo.getNum());
			//操作员
			electricGauge.setOperator(vo.getOperator());
			//读数的日期-年
			electricGauge.setYear(vo.getYear());
			//读数的日期-月
			electricGauge.setMonth(vo.getMonth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return electricGauge;
	}
	
	/**
	 * 天然气表数据的Model转换成VO<br>
	 * @param gasGauge model数据格式
	 * @return GasGaugeVO-VO数据格式
	 */
	public static GasGaugeVO gasGaugeModelToVo(GasGauge gasGauge) {
		GasGaugeVO vo = new GasGaugeVO();
		try {
			//读表主键ID（唯一）
			vo.setId(gasGauge.getId());
			//读表编号
			vo.setNo(gasGauge.getNo());
			//社区ID
			vo.setCommunityid(gasGauge.getCommunityid());
			//读表类型：1-住户，2-商铺，3-公摊
			vo.setType(gasGauge.getType());
			//所属楼栋号
			vo.setBuildingNo("XXX");
			//所属房间号
			vo.setHomeNo("XXXX");
			//读表数
			vo.setNum(gasGauge.getNum());
			//操作员
			vo.setOperator(gasGauge.getOperator());
			//读数的日期-年
			vo.setYear(gasGauge.getYear());
			//读数的日期-月
			vo.setMonth(gasGauge.getMonth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	/**
	 * 天然气表数据的VO转成Model<br>
	 * @param GasGaugeVO-VO数据格式
	 * @return GasGauge-model数据格式
	 */
	public static GasGauge gasGaugeVoToModel(GasGaugeVO vo) {
		GasGauge gasGauge = new GasGauge();
		try {
			//读表主键ID（唯一）
			gasGauge.setId(vo.getId());
			//读表编号
			gasGauge.setNo(vo.getNo());
			//社区ID
			gasGauge.setCommunityid(vo.getCommunityid());
			//读表类型：1-住户，2-商铺，3-公摊
			gasGauge.setType(vo.getType());
			//读表数
			gasGauge.setNum(vo.getNum());
			//操作员
			gasGauge.setOperator(vo.getOperator());
			//读数的日期-年
			gasGauge.setYear(vo.getYear());
			//读数的日期-月
			gasGauge.setMonth(vo.getMonth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gasGauge;
	}
	
	/**
	 * 水表复杂Model模型数据转成VO数据<br>
	 * @param complexWaterGauge 复杂的Model模型数据
	 * @return WaterGaugeVO-VO数据格式
	 */
	public static WaterGaugeVO waterGaugeComplexModelToVo(ComplexWaterGauge complexWaterGauge) {
		WaterGaugeVO vo = new WaterGaugeVO();
		try {
			vo.setId(complexWaterGauge.getId());
			vo.setNo(complexWaterGauge.getNo());
			vo.setCommunityid(complexWaterGauge.getCommunityid());
			vo.setType(complexWaterGauge.getType());
			vo.setBuildingNo(complexWaterGauge.getBuildingNo());
			vo.setHomeNo(complexWaterGauge.getHomeNo());
			vo.setNum(complexWaterGauge.getNum());
			vo.setOperator(complexWaterGauge.getOperator());
			vo.setYear(complexWaterGauge.getYear());
			vo.setMonth(complexWaterGauge.getMonth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	/**
	 * 用户信息Model模型转换成VO数据<br>
	 * @param userInfo model模型数据
	 * @return UserInfoVO-VO数据格式
	 */
	public static UserInfoVO userInfoModelToVo(UserInfo userInfo) {
		UserInfoVO vo = new UserInfoVO();
		try {
			vo.setId(userInfo.getId());
			vo.setUserName(userInfo.getUserName());
			vo.setUserStatus(userInfo.getUserStatus());
			vo.setUserType(userInfo.getUserType());
			vo.setSex(userInfo.getSex());
			vo.setCardType(userInfo.getCardType());
			vo.setCardNo(userInfo.getCardNo());
			vo.setBirthDay(TimeTools.formatDate(userInfo.getBirthDay()));
			vo.setAge(userInfo.getAge());
			vo.setHeadImage(userInfo.getHeadImage());
			vo.setRoominfo(userInfo.getRoominfo());
			vo.setHometown(userInfo.getHometown());
			vo.setTelephone(userInfo.getTelephone());
			vo.setAddress(userInfo.getAddress());
			vo.setDescription(userInfo.getDescription());
			vo.setCreateTime(userInfo.getCreateTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	/**
	 * 用户信息VO模型转换成Model<br>
	 * @param vo VO数据格式
	 * @return UserInfo-Model数据格式
	 */
	public static UserInfo userInfoVoToModel(UserInfoVO vo) {
		UserInfo userInfo = new UserInfo();
		try {
			userInfo.setId(vo.getId());
			userInfo.setUserName(vo.getUserName());
			userInfo.setUserStatus(vo.getUserStatus());
			userInfo.setUserType(vo.getUserType());
			userInfo.setSex(vo.getSex());
			userInfo.setCardType(vo.getCardType());
			userInfo.setCardNo(vo.getCardNo());
			userInfo.setBirthDay(TimeTools.parseDate(vo.getBirthDay()));
			userInfo.setAge(vo.getAge());
			userInfo.setHeadImage(vo.getHeadImage());
			userInfo.setRoominfo(vo.getRoominfo());
			userInfo.setHometown(vo.getHometown());
			userInfo.setTelephone(vo.getTelephone());
			userInfo.setAddress(vo.getAddress());
			userInfo.setDescription(vo.getDescription());
			userInfo.setCreateTime(vo.getCreateTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userInfo;
	}
	
	/**
	 * 用户参数信息转换成VO数据<br>
	 * @param userParam 用户参数数据
	 * @return UserInfoVO-VO数据格式
	 */
	public static UserInfoVO userInfoParamToVo(UserParam userParam) {
		UserInfoVO userInfoVo = new UserInfoVO();
		try {
			userInfoVo.setId(userParam.getId());
			userInfoVo.setUserName(userParam.getUserName());
			userInfoVo.setUserStatus(userParam.getUserStatus());
			userInfoVo.setUserType(userParam.getUserType());
			userInfoVo.setSex(userParam.getSex());
			userInfoVo.setCardType(userParam.getCardType());
			userInfoVo.setCardNo(userParam.getCardNo());
			userInfoVo.setBirthDay(userParam.getBirthDay());
			userInfoVo.setRoominfo(userParam.getRoominfo());
			userInfoVo.setHometown(userParam.getHometown());
			userInfoVo.setTelephone(userParam.getTelephone());
			userInfoVo.setAddress(userParam.getAddress());
			userInfoVo.setDescription(userParam.getDescription());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userInfoVo;
	}
	/**
	 * 物业信息Model转换成VO数据
	 * @param propertyInfo model格式数据
	 * @return PropertyInfoVO-VO格式数据
	 */
	public static PropertyInfoVO propertyInfoModelToVo(PropertyInfo propertyInfo) {
		PropertyInfoVO vo = new PropertyInfoVO();
		try {
			vo.setId(propertyInfo.getId());
			vo.setPropertyName(propertyInfo.getPropertyName());
			vo.setLoginName(propertyInfo.getLoginName());
			vo.setPassword(propertyInfo.getPassword());
			vo.setTelephone(propertyInfo.getTelephone());
			vo.setEmail(propertyInfo.getEmail());
			vo.setDescription(propertyInfo.getDescription());
			vo.setStatus(propertyInfo.getStatus());
			vo.setCreateTime(propertyInfo.getCreateTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	/**
	 * 物业信息VO数据转换成Model数据
	 * @param propertyInfoVO VO格式数据
	 * @return PropertyInfo-model格式数据
	 */
	public static PropertyInfo propertyInfoVoToModel(PropertyInfoVO propertyInfoVO) {
		PropertyInfo propertyInfo = new PropertyInfo();
		try {
			propertyInfo.setId(propertyInfoVO.getId());
			propertyInfo.setPropertyName(propertyInfoVO.getPropertyName());
			propertyInfo.setLoginName(propertyInfoVO.getLoginName());
			propertyInfo.setPassword(propertyInfoVO.getPassword());
			propertyInfo.setTelephone(propertyInfoVO.getTelephone());
			propertyInfo.setEmail(propertyInfoVO.getEmail());
			propertyInfo.setDescription(propertyInfoVO.getDescription());
			propertyInfo.setStatus(propertyInfoVO.getStatus());
			propertyInfo.setCreateTime(propertyInfoVO.getCreateTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propertyInfo;
	}
	/**
	 * 物业参数数据转换成VO数据
	 * @param param 参数格式
	 * @return PropertyInfoVO-VO数据格式
	 */
	public static PropertyInfoVO propertyInfoParamToVo(PropertyInfoParam param) {
		PropertyInfoVO propertyInfoVO = new PropertyInfoVO();
		try {
			propertyInfoVO.setId(param.getId());
			propertyInfoVO.setPropertyName(Tools.getRealString(param.getPropertyName(),"utf-8"));
			propertyInfoVO.setLoginName(param.getLoginName());
			propertyInfoVO.setPassword(Tools.encodeBase64(param.getPassword()));
			propertyInfoVO.setTelephone(param.getTelephone());
			propertyInfoVO.setEmail(param.getEmail());
			propertyInfoVO.setDescription(Tools.getRealString(param.getDescription(),"utf-8"));
			propertyInfoVO.setStatus(param.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propertyInfoVO;
	}
	
	/**
	 * 社区信息Model转换成VO<br>
	 * @param communityInfo 社区信息
	 * @return CommunityInfoVO-VO数据格式
	 */
	public static CommunityInfoVO communityInfoModelToVo(CommunityInfo communityInfo) {
		CommunityInfoVO vo = new CommunityInfoVO();
		try {
			vo.setId(communityInfo.getId());
			vo.setCommunityName(communityInfo.getCommunityName());
			vo.setDeveloperName(communityInfo.getDeveloperName());
			vo.setPropertyId(communityInfo.getPropertyId());
			vo.setAddress(communityInfo.getAddress());
			vo.setProvince(communityInfo.getProvince());
			vo.setCity(communityInfo.getCity());
			vo.setCounty(communityInfo.getCounty());
			vo.setBuildArea(communityInfo.getBuildArea());
			vo.setUsedArea(communityInfo.getUsedArea());
			vo.setCoveredArea(communityInfo.getCoveredArea());
			vo.setRoadArea(communityInfo.getRoadArea());
			vo.setGreenArea(communityInfo.getGreenArea());
			vo.setCoveredArea(communityInfo.getCoveredArea());
			vo.setDescription(communityInfo.getDescription());
			vo.setCreateTime(communityInfo.getCreateTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	/**
	 * 社区信息VO转换成Model<br>
	 * @param communityInfo 社区Model格式数据
	 * @return CommunityInfoVO-VO数据格式
	 */
	public static CommunityInfo communityInfoVoToModel(CommunityInfoVO communityInfoVO) {
		CommunityInfo communityInfo = new CommunityInfo();
		try {
			communityInfo.setId(communityInfoVO.getId());
			communityInfo.setCommunityName(communityInfoVO.getCommunityName());
			communityInfo.setDeveloperName(communityInfoVO.getDeveloperName());
			communityInfo.setPropertyId(communityInfoVO.getPropertyId());
			communityInfo.setAddress(communityInfoVO.getAddress());
			communityInfo.setProvince(communityInfoVO.getProvince());
			communityInfo.setCity(communityInfoVO.getCity());
			communityInfo.setCounty(communityInfoVO.getCounty());
			communityInfo.setBuildArea(communityInfoVO.getBuildArea());
			communityInfo.setUsedArea(communityInfoVO.getUsedArea());
			communityInfo.setCoveredArea(communityInfoVO.getCoveredArea());
			communityInfo.setRoadArea(communityInfoVO.getRoadArea());
			communityInfo.setGreenArea(communityInfoVO.getGreenArea());
			communityInfo.setCoveredArea(communityInfoVO.getCoveredArea());
			communityInfo.setDescription(communityInfoVO.getDescription());
			communityInfo.setCreateTime(communityInfoVO.getCreateTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return communityInfo;
	}
	
	/**
	 * 社区信息参数转化成VO数据格式<br>
	 * @param communityInfoParam 社区信息参数
	 * @return CommunityInfoVO-社区信息VO格式
	 */
	public static CommunityInfoVO communityInfoParamToVo(CommunityInfoParam communityInfoParam) {
		CommunityInfoVO vo = new CommunityInfoVO();
		try {
			vo.setId(communityInfoParam.getId());
			vo.setCommunityName(Tools.getRealString(communityInfoParam.getCommunityName(),"utf-8"));
			vo.setDeveloperName(Tools.getRealString(communityInfoParam.getDeveloperName(),"utf-8"));
			vo.setPropertyId(communityInfoParam.getPropertyId());
			vo.setAddress(Tools.getRealString(communityInfoParam.getAddress(),"utf-8"));
			vo.setProvince(Tools.getRealString(communityInfoParam.getProvince(),"utf-8"));
			vo.setCity(Tools.getRealString(communityInfoParam.getCity(),"utf-8"));
			vo.setCounty(Tools.getRealString(communityInfoParam.getCounty(),"utf-8"));
			vo.setBuildArea(stringToFloat(communityInfoParam.getBuildArea()));
			vo.setUsedArea(stringToFloat(communityInfoParam.getUsedArea()));
			vo.setCoveredArea(stringToFloat(communityInfoParam.getCoveredArea()));
			vo.setRoadArea(stringToFloat(communityInfoParam.getRoadArea()));
			vo.setGreenArea(stringToFloat(communityInfoParam.getGreenArea()));
			vo.setCoveredArea(stringToFloat(communityInfoParam.getCoveredArea()));
			vo.setDescription(Tools.getRealString(communityInfoParam.getDescription(),"utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	/**
	 * String类型转换成int型数据<br>
	 * @param str 字符数据
	 * @return int-整形值
	 */
	public static int stringToInt(String str) {
		int value = 0;
		try {
			value = Integer.valueOf(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * String类型转换成long型数据<br>
	 * @param str 字符串数据
	 * @return long-长整型值
	 */
	public static long stringToLong(String str) {
		long value = 0;
		try {
			value = Long.valueOf(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * int类型转换成String类型数据<br>
	 * @param a 整形值
	 * @return str-字符串
	 */
	public static String intToString(int a) {
		return String.valueOf(a);
	}
	/**
	 * long类型转换成String类型数据<br>
	 * @param a 长整型值
	 * @return str-字符串
	 */
	public static String longToString(long a) {
		return String.valueOf(a);
	}
	/**
	 * String类型转换成float类型<br>
	 * @param a String类型值
	 * @return str-字符串
	 */
	public static float stringToFloat(String a) {
		float value = 0f;
		try {
			value = Float.valueOf(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * float类型数据转换成String类型<br>
	 * @param a float类型值
	 * @return String-字符串
	 */
	public static String floatToString(float a) {
		return String.valueOf(a);
	}
}
