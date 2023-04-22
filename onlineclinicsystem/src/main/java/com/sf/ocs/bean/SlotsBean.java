package com.sf.ocs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="OCS_TBL_SLOTS")
public class SlotsBean {
@Id
@GeneratedValue
private int slotnumber;
@Column
private String duration;
public int getSlotnumber() {
	return slotnumber;
}
public void setSlotnumber(int slotnumber) {
	this.slotnumber = slotnumber;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "SlotsBean [slotnumber=" + slotnumber + ", duration=" + duration + "]";
}

}
