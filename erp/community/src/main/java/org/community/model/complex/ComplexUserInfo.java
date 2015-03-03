package org.community.model.complex;

import org.community.model.UserInfo;

/**
 * 复杂用户信息<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/01
 */
public class ComplexUserInfo extends UserInfo {
	//社区ID
	private int communityid;
	public int getCommunityid() {
		return communityid;
	}
	public void setCommunityid(int communityid) {
		this.communityid = communityid;
	}
}
