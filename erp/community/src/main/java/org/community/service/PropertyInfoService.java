package org.community.service;

import org.community.vo.PropertyInfoVO;

/**
 * 物业信息接口<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/02
 */
public interface PropertyInfoService {
	/**
	 * 根据物业id获取详细信息
	 * @param id 物业id
	 * @return PropertyInfoVO-物业信息对象
	 */
	PropertyInfoVO queryById(int id);
	/**
	 * 根据登陆名和密码查询物业信息<br>
	 * @param loginName 登陆名
	 * @param password 密码
	 * @return PropertyInfoVO
	 */
	PropertyInfoVO queryByLogin(String loginName, String password);
	
	/**
	 * 新增一个物业信息
	 * @param vo 物业信息对象
	 * @return boolean-true:成功;false:失败.
	 */
	boolean addOne(PropertyInfoVO vo);
	/**
	 * 更新一个物业信息
	 * @param vo 物业信息对象
	 * @return boolean-true:成功;false:失败.
	 */
	boolean updateOne(PropertyInfoVO vo);
	/**
	 * 逻辑删除一个物业信息
	 * @param vo 物业信息对象
	 * @return boolean-true:成功;false:失败.
	 */
	boolean dropOne(PropertyInfoVO vo);
	/**
	 * 物业删除一个物业信息
	 * @param vo 物业信息对象
	 * @return boolean-true:成功;false:失败.
	 */
	boolean deleteOne(PropertyInfoVO vo);
}
