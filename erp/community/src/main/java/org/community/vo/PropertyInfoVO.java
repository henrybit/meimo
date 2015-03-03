package org.community.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 物业信息VO<br>
 * @author henrybit
 * @version 1.0
 * @since 2014/01/03
 */
public class PropertyInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8696497383196501169L;
	//物业ID
	private int id;
	//物业名
	private String propertyName;
	//登录名
	private String loginName;
	//密码
	private String password;
	//邮箱（激活使用）
	private String email;
	//账户状态:1-新注册,2-可用，3-审核未通过，4-禁用,5-停用
	private int status;
	//联系方式
	private String telephone;
	//说明
	private String description;
	//创建时间
	private Date createTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
