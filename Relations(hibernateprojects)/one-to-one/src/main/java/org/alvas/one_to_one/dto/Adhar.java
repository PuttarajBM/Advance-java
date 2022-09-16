package org.alvas.one_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Adhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private long Adharnum;
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getAdharnum() {
	return Adharnum;
}
public void setAdharnum(long adharnum) {
	Adharnum = adharnum;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
