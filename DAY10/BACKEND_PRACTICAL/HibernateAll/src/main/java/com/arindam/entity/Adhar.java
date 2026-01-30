package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	@Column(length = 10)
private String adharid;
	@Column(length = 25,nullable = false)
private String city;
public Adhar() {
	super();
	// TODO Auto-generated constructor stub
}
public Adhar(String adharid, String city) {
	super();
	this.adharid = adharid;
	this.city = city;
}
public String getAdharid() {
	return adharid;
}
public void setAdharid(String adharid) {
	this.adharid = adharid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Adhar [adharid=" + adharid + ", city=" + city + "]";
}

}
