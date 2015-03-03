package org.community.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 社区信息VO<br>
 * <table border="1px solid black">
 * <tr><th>字段</th><th>类型</th><th>说明</th></tr>
 * <tr><td>id</td><td>int</td><td>社区ID</td></tr>
 * <tr><td>communityName</td><td>string</td><td>社区名称</td></tr>
 * <tr><td>developerName</td><td>string</td><td>开发商</td></tr>
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
 * <tr><td>coverageRate</td><td>string</td><td>覆盖率</td></tr>
 * <tr><td>plotRate</td><td>string</td><td>容积率</td></tr>
 * <tr><td>greenRate</td><td>string</td><td>绿化率</td></tr>
 * <tr><td>description</td><td>string</td><td>描述</td></tr>
 * </table>
 * @author henrybit
 * @version 1.0
 * @since 2014/12/13
 */
public class CommunityInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4340200863699575185L;
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
	//覆盖率
	private double coverageRate;
	//容积率
	private double plotRate;
	//绿化率
	private double greenRate;
	//描述
	private String description;
	//创建时间
	private Date createTime;
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
	public double getCoverageRate() {
		return coverageRate;
	}
	public void setCoverageRate(double coverageRate) {
		this.coverageRate = coverageRate;
	}
	public double getPlotRate() {
		return plotRate;
	}
	public void setPlotRate(double plotRate) {
		this.plotRate = plotRate;
	}
	public double getGreenRate() {
		return greenRate;
	}
	public void setGreenRate(double greenRate) {
		this.greenRate = greenRate;
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
	public float getGreenArea() {
		return greenArea;
	}
	public void setGreenArea(float greenArea) {
		this.greenArea = greenArea;
	}
}
