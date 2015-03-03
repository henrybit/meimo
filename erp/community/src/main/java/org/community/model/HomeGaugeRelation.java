package org.community.model;

import java.util.Date;

/**
 * 房间与相关表关系
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
public class HomeGaugeRelation {
	//主键ID
	private long id;
	//房间ID
	private long homeId;
	//社区ID
	private int communityId;
	//水表ID
	private long waterGaugeId;
	//电表ID
	private long electricGaugeId;
	//天然气表ID
	private long gasGaugeId;
	//纯进水表ID
	private long pureWaterGaugeId;
	//数据创建时间
	private Date createTime;
	//数据更新时间
	private Date updateTime;
	//数据状态：0-无效，1-有效
	private int dataStatus;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getHomeId() {
		return homeId;
	}
	public void setHomeId(long homeId) {
		this.homeId = homeId;
	}
	public int getCommunityId() {
		return communityId;
	}
	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}
	public long getWaterGaugeId() {
		return waterGaugeId;
	}
	public void setWaterGaugeId(long waterGaugeId) {
		this.waterGaugeId = waterGaugeId;
	}
	public long getElectricGaugeId() {
		return electricGaugeId;
	}
	public void setElectricGaugeId(long electricGaugeId) {
		this.electricGaugeId = electricGaugeId;
	}
	public long getGasGaugeId() {
		return gasGaugeId;
	}
	public void setGasGaugeId(long gasGaugeId) {
		this.gasGaugeId = gasGaugeId;
	}
	public long getPureWaterGaugeId() {
		return pureWaterGaugeId;
	}
	public void setPureWaterGaugeId(long pureWaterGaugeId) {
		this.pureWaterGaugeId = pureWaterGaugeId;
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
}
