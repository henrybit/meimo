package org.community.vo.session;

/**
 * 登陆后的Session信息<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/01
 */
public class LoginInfoVO {
	//社区ID
	private int communityid;
	//物业ID
	private int propertyid;
	//物业名
	private String propertyName;
	//社区名
	private String communityName;
	public int getCommunityid() {
		return communityid;
	}
	public void setCommunityid(int communityid) {
		this.communityid = communityid;
	}
	public int getPropertyid() {
		return propertyid;
	}
	public void setPropertyid(int propertyid) {
		this.propertyid = propertyid;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
}
