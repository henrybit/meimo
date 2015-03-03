package org.community.dao;

import java.util.List;

/**
 * 读表Dao相关操作<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
public interface GaugeDao<T> {
	/**
	 * 分页查询某个社区的表信息<br>
	 * @param communityid
	 * @param pageNo
	 * @param pageNum
	 * @return
	 */
	List<T> query(int communityid, int pageNo, int pageNum);
	/**
	 * 分页查询某个社区的某个用户下的表信息<br>
	 * @param communityid 社区ID
	 * @param uid 用户ID
	 * @param pageNo 分页号
	 * @param pageNum 分页大小
	 * @return List
	 */
	List<T> queryByUid(int communityid, long uid, int pageNo, int pageNum);
	/**
	 * 分页查询某个社区的某个房屋下的表信息<br>
	 * @param communityid 社区ID
	 * @param hid 房屋ID
	 * @param pageNo 分页号
	 * @param pageNum 分页大小
	 * @return List
	 */
	List<T> queryByHid(int communityid, long hid, int pageNo, int pageNum);
	/**
	 * 根据主键ID查询表的信息<br>
	 * @param id
	 * @return T
	 */
	T queryById(long id);
	/**
	 * 根据主键Id更新对象<br>
	 * @param t 待更新的对象
	 * @return int-返回更新后影响的函数
	 */
	int updateOneById(T t);
	/**
	 * 增加一个指定的数据<br>
	 * @param t 数据对象
	 * @return int-返回插入的记录条数
	 */
	int addOne(T t);
	/**
	 * 逻辑删除一个指定的数据,设置data_status=0<br>
	 * @param t 数据对象
	 * @return int-删除的数据条数
	 */
	int dropOne(T t);
	/**
	 * 物理删除一个指定的数据<br>
	 * @param t 数据对象
	 * @return int-删除的数据条数
	 */
	int deleteOne(T t);
}
