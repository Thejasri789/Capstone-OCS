package com.sf.ocs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="OCS_TBL_APPOINTMENTS")
public class AppointmentBean {

@Id
@GeneratedValue
private int appointmentID;
@ManyToOne
@JoinColumn(name="doctorID")
private DoctorBean doctorBean;
@ManyToOne
@JoinColumn(name="patientID")
private PatientBean patientBean;

@Column
private String appointmentDate;
@Column
private String appointmentTime;
public int getAppointmentID() {
	return appointmentID;
}
public void setAppointmentID(int appointmentID) {
	this.appointmentID = appointmentID;
}
public DoctorBean getDoctorBean() {
	return doctorBean;
}
public void setDoctorBean(DoctorBean doctorBean) {
	this.doctorBean = doctorBean;
}
public PatientBean getPatientBean() {
	return patientBean;
}
public void setPatientBean(PatientBean patientBean) {
	this.patientBean = patientBean;
}
public String getAppointmentDate() {
	return appointmentDate;
}
public void setAppointmentDate(String appointmentDate) {
	this.appointmentDate = appointmentDate;
}
public String getAppointmentTime() {
	return appointmentTime;
}
public void setAppointmentTime(String appointmentTime) {
	this.appointmentTime = appointmentTime;
}
@Override
public String toString() {
	return "AppointmentBean [appointmentID=" + appointmentID + ", doctorBean=" + doctorBean + ", patientBean="
			+ patientBean + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime + "]";
}

}
