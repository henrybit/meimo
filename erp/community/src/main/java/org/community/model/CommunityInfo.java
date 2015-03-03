package org.community.model;

import java.util.Date;

/**
 * 库erp的community_info表实体<br>
 * <table border="1px solid black">
 * <tr><th>字段</th><th>类型</th><th>说明</th></tr>
 * <tr><td>id</td><td>int</td><td>社区ID</td></tr>
 * <tr><td>communityName</td><td>string</td><td>社区名称</td></tr>
 * <tr><td>developerId</td><td>int</td><td>开发商ID</td></tr>
 * <tr><td>contractorId</td><td>int</td><td>承建商ID</td></tr>
 * <tr><td>propertyId</td><td>int</td><td>物业ID</td></tr>
 * <tr><td>address</td><td>string</td><td>社区地址</td></tr>
 * <tr><td>province</td><td>string</td><td>省份</td></tr>
 * <tr><td>city</td><td>string</td><td>城市</td></tr>
 * <tr><td>county</td><td>string</td><td>县</td></tr>
 * <tr><td>buildArea</td><td>float</td><td>建筑面积</td></tr>
 * <tr><td>usedArea</td><td>float</td><td>使用面积</td></tr>
 * <tr><td>coveredArea</td><td>float</td><td>占地面积</td></tr>
 * <tr><td>roadArea</td><td>float</td><td>道路面积</td></tr>
 * <tr><td>greenArea</td><td>float</td><td>绿化面积</td></tr>
 * <tr><td>description</td><td>string</td><td>描述</td></tr>
 * <tr><td>create_time</td><td>datetime</td><td>数据创建时间</td></tr>
 * <tr><td>update_time</td><td>timestamp</td><td>数据更新时间</td></tr>
 * <tr><td>data_status</td><td>int</td><td>数据状态:1-有效，0-无效</td></tr>
 * </table>
 * @author henrybit
 * @version 1.0
 * @since 2014/12/13
 */
public class CommunityInfo {
	//社区ID
	private int id;
	//社区名称
	private String communityName;
	//开发商名
	private String developerName;
	//物业ID
	private int propertyId;
	//地址
	private String address;
	//所在省份
	private String province;
	//所在城市
	private String city;
	//所在县
	private String county;
	//建筑面积
	private float buildArea;
	//使用面积
	private float usedArea;
	//占地面积
	private float coveredArea;
	//道路面积
	private float roadArea;
	//绿化面积
	private float greenArea;
	//描述
	private String description;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;
	//数据状态
	private int dataStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
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
	public float getCoveredArea() {
		return coveredArea;
	}
	public void setCoveredArea(float coveredArea) {
		this.coveredArea = coveredArea;
	}
	public float getRoadArea() {
		return roadArea;
	}
	public void setRoadArea(float roadArea) {
		this.roadArea = roadArea;
	}
	public float getGreenArea() {
		return greenArea;
	}
	public void setGreenArea(float greenArea) {
		this.greenArea = greenArea;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
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
