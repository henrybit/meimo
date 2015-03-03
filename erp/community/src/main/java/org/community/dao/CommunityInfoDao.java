package org.community.dao;

import java.util.List;

import org.community.model.CommunityInfo;

/**
 * 社区信息Dao
 * @author henrybit
 * @version 1.0
 * @since 2014/01/03
 */
public interface CommunityInfoDao {
	/**
	 * 分页获取社区集合<br>
	 * @param pageNo 分页号
	 * @param pageNum 分页数量
	 * @return List-社区集合
	 */
	List<CommunityInfo> query(int pageNo, int pageNum);
	/**
	 * 获取指定物业下的社区集合<br>
	 * @param propertyid 物业id
	 * @return List-社区集合
	 */
	List<CommunityInfo> queryByPid(int propertyid);
	/**
	 * 根据社区ID获取指定的社区信息<br>
	 * @param communityid 社区ID
	 * @return CommunityInfo-社区信息
	 */
	CommunityInfo queryById(int communityid);
	/**
	 * 新增一个指定的社区信息<br>
	 * @param communityInfo 社区信息
	 * @return int-新增的记录条数
	 */
	int addOne(CommunityInfo communityInfo);
	/**
	 * 更新一个指定的社区信息<br>
	 * @param communityInfo 社区信息
	 * @return int-更新影响的记录条数
	 */
	int updateOne(CommunityInfo communityInfo);
	/**
	 * 物理删除一个指定的社区信息<br>
	 * @param communityInfo 社区信息
	 * @return int-删除的记录条数
	 */
	int deleteOne(CommunityInfo communityInfo);
	/**
	 * 逻辑删除一个指定的社区信息<br>
	 * @param communityInfo 社区信息
	 * @return int-删除的记录条数
	 */
	int dropOne(CommunityInfo communityInfo);
}
