package org.community.model;

import java.util.Date;

/**
 * erp库user_home_relation表-用户与房屋关系表
 * @author henrybit
 * @version 1.0
 * @since 2015/03/01
 */
public class UserHomeRelation {
	//主键
	private long id;
	//住户ID
	private long userid;
	//房屋ID
	private long homeid;
	//社区ID
	private int communityid;
	//关系类型：1-房东，2-租户
	private int type;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;
	//数据状态
	private int dataStatus;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public int getCommunityid() {
		return communityid;
	}
	public void setCommunityid(int communityid) {
		this.communityid = communityid;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getDataStatus() {
		return dataStatus;
	}
	public void setDataStatus(int dataStatus) {
		this.dataStatus = dataStatus;
	}
	public long getHomeid() {
		return homeid;
	}
	public void setHomeid(long homeid) {
		this.homeid = homeid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
