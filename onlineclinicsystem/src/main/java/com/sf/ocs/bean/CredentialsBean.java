package com.sf.ocs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="OCS_TBL_USER_CREDENTIALS")

public class CredentialsBean {
	@Id
	private String cid;
@ManyToOne 
@JoinColumn(name="userID")
private ProfileBean profileBean;
@Column
private String password;
@Column
private int loginStatus;
@Column
private String userType;
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public ProfileBean getProfileBean() {
	return profileBean;
}
public void setProfileBean(ProfileBean profileBean) {
	this.profileBean = profileBean;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getLoginStatus() {
	return loginStatus;
}
public void setLoginStatus(int loginStatus) {
	this.loginStatus = loginStatus;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
@Override
public String toString() {
	return "CredentialsBean [cid=" + cid + ", profileBean=" + profileBean + ", password=" + password + ", loginStatus="
			+ loginStatus + ", userType=" + userType + "]";
}

}


