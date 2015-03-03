package org.community.model;

import java.util.Date;

/**
 * erp库fee_item表-费用表
 * @author henrybit
 * @version 1.0
 * @since 2015/01/04
 */
public class FeeItem {
	//主键
	private long id;
	//费用名
	private String feeName;
	//费用单价
	private float feeValue;
	//社区ID
	private int communityId;
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
	public String getFeeName() {
		return feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}
	public float getFeeValue() {
		return feeValue;
	}
	public void setFeeValue(float feeValue) {
		this.feeValue = feeValue;
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
	public int getCommunityId() {
		return communityId;
	}
	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}
}
