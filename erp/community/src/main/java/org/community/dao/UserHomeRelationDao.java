package org.community.dao;

import java.util.List;

import org.community.model.UserHomeRelation;

/**
 * 用户与房屋关系<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/02
 */
public interface UserHomeRelationDao {
	/**
	 * 分页获取某社区下的用户与房屋关系集合<br>
	 * @param communityid 社区ID 
	 * @param pageNo 分页号
	 * @param pageNum 分页数量
	 * @return List-用户与房屋关系集合
	 */
	List<UserHomeRelation> queryByCid(int communityid, int pageNo, int pageNum);
	/**
	 * 新增一个用户与房屋关系<br>
	 * @param userHomeRelation 用户与房屋关系
	 * @return int-返回插入的记录数
	 */
	int addOne(UserHomeRelation userHomeRelation);
	/**
	 * 更新一个指定的用户与房屋关系<br>
	 * @param userHomeRelation 用户与房屋关系
	 * @return int-返回更新影响的记录数
	 */
	int updateOne(UserHomeRelation userHomeRelation);
	/**
	 * 物理删除一个指定的用户与房屋关系<br>
	 * @param userHomeRelation 用户与房屋关系
	 * @return int-删除的记录条数
	 */
	int deleteOne(UserHomeRelation userHomeRelation);
	/**
	 * 逻辑删除一个指定的用户与房屋关系<br>
	 * @param userHomeRelation 用户与房屋关系
	 * @return int-删除的记录条数
	 */
	int dropOne(UserHomeRelation userHomeRelation);
}
