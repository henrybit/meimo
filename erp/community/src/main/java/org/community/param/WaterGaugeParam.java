package org.community.param;

/**
 * 水表查询相关参数<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
public class WaterGaugeParam {
	//水表ID
	private long id;
	//读表编号
	private String no;
	//水表类型
	private int type;
	//社区ID
	private int communityid;
	//页面编号
	private int pageNo;
	//每页展示的数量
	private int pageNum;
	//楼栋号
	private String buildingNo;
	//房间号
	private String homeNo;
	//读表数
	private float num;
	//操作员
	private String operator;
	//读数的日期-年
	private int year;
	//读数的日期-月
	private int month;
	//搜索的文本
	private String searchText;
	//查询的年限
	private int gaugeTime;
	//排序规则
	private int order;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getCommunityid() {
		return communityid;
	}
	public void setCommunityid(int communityid) {
		this.communityid = communityid;
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
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	public int getGaugeTime() {
		return gaugeTime;
	}
	public void setGaugeTime(int gaugeTime) {
		this.gaugeTime = gaugeTime;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
}
