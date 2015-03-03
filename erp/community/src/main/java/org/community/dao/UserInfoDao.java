package org.community.dao;

import java.util.List;
import java.util.Map;

import org.community.model.UserInfo;

/**
 * 用户相关DB操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2014/12/13
 */
public interface UserInfoDao {
	/**
	 * 分页获取某社区下的用户集合<br>
	 * @param map 查询参数
	 * @return List-用户集合
	 */
	List<UserInfo> query(Map map);
	/**
	 * 根据指定用户ID获取用户信息<br>
	 * @param id 用户ID
	 * @return UserInfo-用户信息
	 */
	UserInfo queryById(long id);
	/**
	 * 分页获取某社区下符合查询条件的用户集合<br>
	 * @param map 查询参数
	 * @param pageNo 分页号
	 * @param pageNum 分页数量
	 * @return List-用户集合
	 */
	List<UserInfo> queryByMap(Map map, int pageNo, int pageNum);
	/**
	 * 增加一个指定的用户信息<br>
	 * @param userinfo 用户信息
	 * @return int-返回插入的记录条数
	 */
	int addOne(UserInfo userinfo);
	/**
	 * 更新一个指定的用户信息<br>
	 * @param userinfo 用户信息
	 * @return int-返回更新影响的记录条数
	 */
	int updateOne(UserInfo userinfo);
	/**
	 * 逻辑删除一个指定的用户信息<br>
	 * @param userinfo 用户信息
	 * @return int-返回删除的记录条数
	 */
	int dropOne(UserInfo userinfo);
	/**
	 * 物理删除一个指定的用户信息<br>
	 * @param userinfo 用户信息
	 * @return int-返回删除的记录条数
	 */
	int deleteOne(UserInfo userinfo);
}
