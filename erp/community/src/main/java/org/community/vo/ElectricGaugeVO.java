package org.community.vo;

import java.io.Serializable;

/**
 * 电表VO<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
public class ElectricGaugeVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4411567679283252977L;
	//读表主键ID（唯一）
	private long id;
	//读表编号
	private String no;
	//社区ID
	private int communityid;
	//读表类型：1-住户，2-商铺，3-公摊
	private int type;
	//所属楼栋号
	private String buildingNo;
	//所属房间号
	private String homeNo;
	//读表数
	private float num;
	//操作员
	private String operator;
	//读数的日期-年
	private int year;
	//读数的日期-月
	private int month;
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
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getHomeNo() {
		return homeNo;
	}
	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
