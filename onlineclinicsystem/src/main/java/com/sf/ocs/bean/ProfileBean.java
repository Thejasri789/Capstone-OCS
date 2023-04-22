package com.sf.ocs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="OCS_TBL_USER_PROFILE")

public class ProfileBean {
@Id
@GeneratedValue
private String userID;
@Column
private String firstName;
@Column
private String lastName;
@Column
private String dateOfBirth;
@Column
private String gender;
@Column
private String street;
@Column
private String location;
@Column
private String city;
@Column
private String state;
@Column
private String pincode;
@Column
private String mobileNo;
@Column
private String emailID ;
@Column
private String password ;
public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
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
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmailID() {
	return emailID;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "ProfileBean [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
			+ dateOfBirth + ", gender=" + gender + ", street=" + street + ", location=" + location + ", city=" + city
			+ ", state=" + state + ", pincode=" + pincode + ", mobileNo=" + mobileNo + ", emailID=" + emailID
			+ ", password=" + password + "]";
}

}
