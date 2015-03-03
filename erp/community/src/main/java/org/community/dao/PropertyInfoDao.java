package org.community.dao;

import org.community.model.PropertyInfo;

/**
 * 物业信息Dao<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/28
 */
public interface PropertyInfoDao {
	/**
	 * 根据物业ID查询物业信息<br>
	 * @param propertyId 物业ID
	 * @return PropertyInfo-物业信息
	 */
	PropertyInfo queryById(int propertyId);
	/**
	 * 根据物业的登录名和密码获取物业信息<br>
	 * @param propertyInfo 物业信息
	 * @return PropertyInfo-物业信息
	 */
	PropertyInfo queryByLogin(PropertyInfo propertyInfo);
	/**
	 * 新增一个物业信息<br>
	 * @param propertyInfo 物业信息
	 * @return int-返回新增的数据条数
	 */
	int addOne(PropertyInfo propertyInfo);
	/**
	 * 更新一个物业信息<br>
	 * @param propertyInfo 待更新的物业信息
	 * @return int-返回更新影响的数据条数
	 */
	int updateOne(PropertyInfo propertyInfo);
	/**
	 * 逻辑删除一个物业信息<br>
	 * @param propertyInfo 待删除的物业信息
	 * @return int-返回删除的数据条数
	 */
	int dropOne(PropertyInfo propertyInfo);
	/**
	 * 物理删除一个物业信息<br>
	 * @param propertyInfo 待删除的物业信息
	 * @return int-返回删除的数据条数
	 */
	int deleteOne(PropertyInfo propertyInfo);
}
