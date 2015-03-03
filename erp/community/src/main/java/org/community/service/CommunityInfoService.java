package org.community.service;

import java.util.List;

import org.community.vo.CommunityInfoVO;

/**
 * 社区信息接口<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/03
 */
public interface CommunityInfoService {
	/**
	 * 查询某个物业旗下的所有社区集合<br>
	 * @param propertyid 物业id
	 * @return List-社区集合
	 */
	List<CommunityInfoVO> getByPropertyId(int propertyid);
	/**
	 * 查询某个社区的信息<br>
	 * @param communityid 社区ID
	 * @return CommunityInfoVO-社区信息
	 */
	CommunityInfoVO getById(int communityid);
	/**
	 * 新增一个社区信息<br>
	 * @param communityInfoVo 社区信息
	 * @return boolean-true:成功;false:失败.
	 */
	boolean addOne(CommunityInfoVO communityInfoVo);
	/**
	 * 更新一个社区信息<br>
	 * @param communityInfoVo 社区信息
	 * @return boolean-true:成功;false:失败.
	 */
	boolean updateOne(CommunityInfoVO communityInfoVo);
	/**
	 * 逻辑删除一个社区信息<br>
	 * @param communityInfoVo 社区信息
	 * @return boolean-true:成功;false:失败.
	 */
	boolean dropOne(CommunityInfoVO communityInfoVo);
	/**
	 * 物理删除一个社区信息<br>
	 * @param communityInfoVo 社区信息
	 * @return boolean-true:成功;false:失败.
	 */
	boolean deleteOne(CommunityInfoVO communityInfoVo);
}
