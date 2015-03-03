package org.community.dao;

import java.util.List;

import org.community.model.UserCommunityRelation;

/**
 * 用户与社区关系Dao接口<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/28
 */
public interface UserCommunityRelationDao {
	/**
	 * 分页获取某一个社区下的用户ID集合<br>
	 * @param communityid 社区ID
	 * @param pageNo 分页号
	 * @param pageNum 分页数量
	 * @return List<UserCommunityRelation>-用户与社区关系集合<br>
	 */
	List<UserCommunityRelation> queryByCid(int communityid, int pageNo, int pageNum);
	/**
	 * 新增一个用户与社区的关系<br>
	 * @param userCommunityRelation 用户与社区关系
	 * @return int-返回插入成功的记录数
	 */
	int addOne(UserCommunityRelation userCommunityRelation);
	/**
	 * 更新一个用户与社区的关系<br>
	 * @param userCommunityRelation 用户与社区关系
	 * @return int-返回更新影响的记录数
	 */
	int updateOne(UserCommunityRelation userCommunityRelation);
	/**
	 * 逻辑删除一个用户与社区的关系<br>
	 * @param userCommunityRelation 用户与社区关系
	 * @return int-返回删除的记录数
	 */
	int dropOne(UserCommunityRelation userCommunityRelation);
	/**
	 * 物理删除一个用户与社区的关系<br>
	 * @param userCommunityRelation 用户与社区关系
	 * @return int-返回删除的记录数
	 */
	int deleteOne(UserCommunityRelation userCommunityRelation);
}
