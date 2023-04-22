package com.sf.ocs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="OCS_TBL_DOCTOR")

public class DoctorBean {
@Id

private int doctorID;
@Column
private String doctorName;
@Column
private String dateOfBirth;
@Column
private String dateOfJoining;
@Column
private String gender;
@Column
private String qualification;
@Column
private String specialization;
@Column
private int yearsOfExperience;
@Column
private String street;
@Column
private String location ;
@Column
private String city;
@Column
private String state;
@Column
private String pincode;
@Column
private String contactNumber;
@Column
private String emailID;
public int getDoctorID() {
	return doctorID;
}
public void setDoctorID(int doctorID) {
	this.doctorID = doctorID;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public int getYearsOfExperience() {
	return yearsOfExperience;
}
public void setYearsOfExperience(int yearsOfExperience) {
	this.yearsOfExperience = yearsOfExperience;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getEmailID() {
	return emailID;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}
@Override
public String toString() {
	return "DoctorBean [doctorID=" + doctorID + ", doctorName=" + doctorName + ", dateOfBirth=" + dateOfBirth
			+ ", dateOfJoining=" + dateOfJoining + ", gender=" + gender + ", qualification=" + qualification
			+ ", specialization=" + specialization + ", yearsOfExperience=" + yearsOfExperience + ", street=" + street
			+ ", location=" + location + ", city=" + city + ", state=" + state + ", pincode=" + pincode
			+ ", contactNumber=" + contactNumber + ", emailID=" + emailID + "]";
}

}
