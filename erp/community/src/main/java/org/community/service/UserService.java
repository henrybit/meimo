package org.community.service;

import java.util.List;
import java.util.Map;

import org.community.vo.UserInfoVO;

/**
 * 用户服务接口<br>
 * 注意：用于定义服务的对外标准方法
 * @author henrybit
 * @version 1.0
 * @since 2014/12/13
 */
public interface UserService {
	/**
	 * 分页获取某社区下的用户集合<br>
	 * @param communityid 社区ID
	 * @param pageNo 分页号
	 * @param pageNum 分页数量
	 * @return List
	 */
	List<UserInfoVO> getUserList(int communityid, int pageNo, int pageNum);
	/**
	 * 分货获取符合查询条件的用户集合<br>
	 * @param map 查询参数
	 * @param pageNo 分页号
	 * @param pageNum 分页数量
	 * @return List
	 */
	List<UserInfoVO> getUserListByMap(Map map, int pageNo, int pageNum);
	/**
	 * 根据用户ID获取用户信息<br>
	 * @param id 用户ID
	 * @return UserInfoVO-用户信息
	 */
	UserInfoVO getUserById(long id);
	/**
	 * 新增一个指定的用户信息<br>
	 * @param vo 用户信息
	 * @return boolean-true:成功;false:失败.
	 */
	boolean addUserInfo(UserInfoVO vo);
	/**
	 * 更新一个指定的用户信息<br>
	 * @param vo 用户信息
	 * @return boolean-true:成功;false:失败.
	 */
	boolean updateUserInfo(UserInfoVO vo);
	/**
	 * 逻辑删除一个指定的用户信息<br>
	 * @param vo 用户信息
	 * @return boolean-true:成功;false:失败.
	 */
	boolean dropUserInfo(UserInfoVO vo);
	/**
	 * 物理删除一个指定的用户信息<br>
	 * @param vo 用户信息
	 * @return boolean-true:成功;false:失败.
	 */
	boolean deleteUserInfo(UserInfoVO vo);
	/**
	 * 创建一个用户与社区的关系<br>
	 * @param uid 用户ID
	 * @param communityid 社区ID
	 * @return boolean-true:成功;false:失败.
	 */
	boolean addUserCommunityRelation(long uid, int communityid);
}
