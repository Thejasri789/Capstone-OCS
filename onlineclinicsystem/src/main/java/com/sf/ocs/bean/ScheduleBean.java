package com.sf.ocs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="OCS_TBL_SCHEDULES")

public class ScheduleBean {
@Id
@GeneratedValue
private int scheduleID;
@ManyToOne 
@JoinColumn(name="DoctorID")
private DoctorBean doctorBean;
@Column
private String availableDays;
@Column
private String slots;
public int getScheduleID() {
	return scheduleID;
}
public void setScheduleID(int scheduleID) {
	this.scheduleID = scheduleID;
}
public DoctorBean getDoctorBean() {
	return doctorBean;
}
public void setDoctorBean(DoctorBean doctorBean) {
	this.doctorBean = doctorBean;
}
public String getAvailableDays() {
	return availableDays;
}
public void setAvailableDays(String availableDays) {
	this.availableDays = availableDays;
}
public String getSlots() {
	return slots;
}
public void setSlots(String slots) {
	this.slots = slots;
}
@Override
public String toString() {
	return "ScheduleBean [scheduleID=" + scheduleID + ", doctorBean=" + doctorBean + ", availableDays=" + availableDays
			+ ", slots=" + slots + "]";
}

}
