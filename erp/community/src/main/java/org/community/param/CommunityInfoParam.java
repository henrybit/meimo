package org.community.param;

/**
 * 社区信息参数<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/02
 */
public class CommunityInfoParam {
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
	private String buildArea;
	//使用面积
	private String usedArea;
	//占地面积
	private String coveredArea;
	//道路面积
	private String roadArea;
	//绿化面积
	private String greenArea;
	//描述
	private String description;
	//分页号
	private int pageNo;
	//分页数量
	private int pageNum;
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
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
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
	public String getBuildArea() {
		return buildArea;
	}
	public void setBuildArea(String buildArea) {
		this.buildArea = buildArea;
	}
	public String getUsedArea() {
		return usedArea;
	}
	public void setUsedArea(String usedArea) {
		this.usedArea = usedArea;
	}
	public String getCoveredArea() {
		return coveredArea;
	}
	public void setCoveredArea(String coveredArea) {
		this.coveredArea = coveredArea;
	}
	public String getRoadArea() {
		return roadArea;
	}
	public void setRoadArea(String roadArea) {
		this.roadArea = roadArea;
	}
	public String getGreenArea() {
		return greenArea;
	}
	public void setGreenArea(String greenArea) {
		this.greenArea = greenArea;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
}
