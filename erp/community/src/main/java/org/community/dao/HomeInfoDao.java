package org.community.dao;

import java.util.List;

import org.community.model.HomeInfo;

/**
 * 房屋信息Dao
 * @author henrybit
 * @version 1.0
 * @since 2014/01/03
 */
public interface HomeInfoDao {
	/**
	 * 获取某社区下的所有房屋信息集合<br>
	 * @param communityid 社区ID
	 * @param pageNo 分页号
	 * @param pageNum 分页数量
	 * @return List-房屋集合
	 */
	List<HomeInfo> query(int communityid, int pageNo, int pageNum);
	/**
	 * 获取某社区某用户下的所有房屋信息集合<br>
	 * @param communityid 社区ID
	 * @param uid 用户ID
	 * @param pageNo 分页号
	 * @param pageNum 分页信息
	 * @return List-房屋集合
	 */
	List<HomeInfo> queryByUid(int communityid, long uid, int pageNo, int pageNum);
	/**
	 * 根据房屋ID查询房屋的信息<br>
	 * @param id 房屋ID
	 * @return HomeInfo-房屋信息
	 */
	HomeInfo queryById(long id);
	/**
	 * 新增一个房屋信息<br>
	 * @param homeInfo 新增的房屋信息
	 * @return int-返回插入的记录条数
	 */
	int addOne(HomeInfo homeInfo);
	/**
	 * 更新一个房屋信息<br>
	 * @param homeInfo 待更新的房屋信息
	 * @return int-返回更新影响的记录条数
	 */
	int updateOne(HomeInfo homeInfo);
	/**
	 * 物理删除一个房屋信息<br>
	 * @param homeInfo 待删除的房屋信息
	 * @return int-返回删除的记录条数
	 */
	int deleteOne(HomeInfo homeInfo);
	/**
	 * 逻辑删除一个房屋信息<br>
	 * @param homeInfo 待删除的房屋信息
	 * @return int-返回删除影响的记录条数
	 */
	int dropOne(HomeInfo homeInfo);
}
