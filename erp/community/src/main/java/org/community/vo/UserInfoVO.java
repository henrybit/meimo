package org.community.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息<br>
 * @author henrybit
 * @version 1.0
 * @since 2014/12/13
 */
public class UserInfoVO implements Serializable{

	/**
	 * 序列化编号
	 */
	private static final long serialVersionUID = 26867856549240557L;
	//用户ID
	private long id;
	//用户名
	private String userName;
	//用户状态
	private int userStatus;
	//用户类型
	private int userType;
	//用户性别
	private int sex;
	//证件类型
	private int cardType;
	//证件号
	private String cardNo;
	//出生日期
	private String birthDay;
	//年龄
	private int age;
	//用户头像
	private String headImage;
	//房间信息
	private String roominfo;
	//籍贯
	private String hometown;
	//联系电话
	private String telephone;
	//联系地址
	private String address;
	//描述
	private String description;
	//创建时间
	private Date createTime;
	//社区ID
	private int communityid;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getCardType() {
		return cardType;
	}
	public void setCardType(int cardType) {
		this.cardType = cardType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRoominfo() {
		return roominfo;
	}
	public void setRoominfo(String roominfo) {
		this.roominfo = roominfo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getCommunityid() {
		return communityid;
	}
	public void setCommunityid(int communityid) {
		this.communityid = communityid;
	}
}
