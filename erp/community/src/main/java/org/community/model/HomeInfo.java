package org.community.model;

import java.util.Date;

/**
 * erp库home_info表-房屋信息
 * @author henrybit
 * @version 1.0
 * @since 2014/01/03
 */
public class HomeInfo {
	//房屋ID
	private long id;
	//社区ID
	private int communityid;
	//房屋编号
	private String homeno;
	//楼栋号
	private String buildingNo;
	//房屋类型
	private int type;
	//建筑面积
	private float buildArea;
	//使用面积
	private float usedArea;
	//公摊面积
	private float poolArea;
	//结构图
	private String structPic;
	//房屋建筑年份
	private int buildedYear;
	//房屋年龄
	private int age;
	//描述
	private String description;
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
	public int getCommunityid() {
		return communityid;
	}
	public void setCommunityid(int communityid) {
		this.communityid = communityid;
	}
	public String getHomeno() {
		return homeno;
	}
	public void setHomeno(String homeno) {
		this.homeno = homeno;
	}
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public float getBuildArea() {
		return buildArea;
	}
	public void setBuildArea(float buildArea) {
		this.buildArea = buildArea;
	}
	public float getUsedArea() {
		return usedArea;
	}
	public void setUsedArea(float usedArea) {
		this.usedArea = usedArea;
	}
	public float getPoolArea() {
		return poolArea;
	}
	public void setPoolArea(float poolArea) {
		this.poolArea = poolArea;
	}
	public String getStructPic() {
		return structPic;
	}
	public void setStructPic(String structPic) {
		this.structPic = structPic;
	}
	public int getBuildedYear() {
		return buildedYear;
	}
	public void setBuildedYear(int buildedYear) {
		this.buildedYear = buildedYear;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
