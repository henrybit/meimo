package org.community.model;

import java.util.Date;

/**
 * 水表Model-对应于erp中water_gauge表<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
public class WaterGauge {
	//水表主键ID
	private long id;
	//水表编号
	private String no;
	//社区ID
	private int communityid;
	//读表类型：1-住户，2-商铺，3-公摊
	private int type;
	//读数
	private float num;
	//操作员
	private String operator;
	//读表年份
	private int year;
	//读表月份
	private int month;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;
	//数据状态：0-无效，1-有效
	private int dataStatus;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getCommunityid() {
		return communityid;
	}
	public void setCommunityid(int communityid) {
		this.communityid = communityid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public float getNum() {
		return num;
	}
	public void setNum(float num) {
		this.num = num;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
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
