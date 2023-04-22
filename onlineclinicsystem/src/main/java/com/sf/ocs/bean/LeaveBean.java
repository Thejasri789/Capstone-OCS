package com.sf.ocs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="OCS_TBL_LEAVE")
public class LeaveBean {
@Id
@GeneratedValue
private int leaveID;
@ManyToOne 
@JoinColumn(name="DoctorID")
private DoctorBean doctorBean;
public DoctorBean getDoctorBean() {
	return doctorBean;
}
public void setDoctorBean(DoctorBean doctorBean) {
	this.doctorBean = doctorBean;
}
@Column
private String leaveFrom;
@Column
private String leaveTo;
@Column
private String reason;
@Column
private String status;
public int getLeaveID() {
	return leaveID;
}
public void setLeaveID(int leaveID) {
	this.leaveID = leaveID;
}
public String getLeaveFrom() {
	return leaveFrom;
}
public void setLeaveFrom(String leaveFrom) {
	this.leaveFrom = leaveFrom;
}
public String getLeaveTo() {
	return leaveTo;
}
public void setLeaveTo(String leaveTo) {
	this.leaveTo = leaveTo;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "LeaveBean [leaveID=" + leaveID + ", leaveFrom=" + leaveFrom + ", leaveTo=" + leaveTo + ", reason=" + reason
			+ ", status=" + status + "]";
}
}