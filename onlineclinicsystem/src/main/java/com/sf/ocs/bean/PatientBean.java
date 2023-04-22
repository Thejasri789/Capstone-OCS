package com.sf.ocs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="OCS_TBL_PATIENT")

public class PatientBean {
@Id
@GeneratedValue
private int patientID;
@ManyToOne
@JoinColumn(name="userID")
private ProfileBean profileBean;
@Column
private String appointmentDate;
@Column
private String ailmentType;
@Column
private String ailmentDetails;
@Column
private String diagnosisHistory;
public int getPatientID() {
	return patientID;
}
public void setPatientID(int patientID) {
	this.patientID = patientID;
}
public ProfileBean getProfileBean() {
	return profileBean;
}
public void setProfileBean(ProfileBean profileBean) {
	this.profileBean = profileBean;
}
public String getAppointmentDate() {
	return appointmentDate;
}
public void setAppointmentDate(String appointmentDate) {
	this.appointmentDate = appointmentDate;
}
public String getAilmentType() {
	return ailmentType;
}
public void setAilmentType(String ailmentType) {
	this.ailmentType = ailmentType;
}
public String getAilmentDetails() {
	return ailmentDetails;
}
public void setAilmentDetails(String ailmentDetails) {
	this.ailmentDetails = ailmentDetails;
}
public String getDiagnosisHistory() {
	return diagnosisHistory;
}
public void setDiagnosisHistory(String diagnosisHistory) {
	this.diagnosisHistory = diagnosisHistory;
}
@Override
public String toString() {
	return "PatientBean [patientID=" + patientID + ", profileBean=" + profileBean + ", appointmentDate="
			+ appointmentDate + ", ailmentType=" + ailmentType + ", ailmentDetails=" + ailmentDetails
			+ ", diagnosisHistory=" + diagnosisHistory + "]";
}



}
