package com.arindam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tour {
	@Id
	@Column(length = 10)
private String tourid;
	@Column(length = 25,nullable = false)
private String tournm;
private Double tourcost;
public Tour() {
	super();
	// TODO Auto-generated constructor stub
}
public Tour(String tourid, String tournm, Double tourcost) {
	super();
	this.tourid = tourid;
	this.tournm = tournm;
	this.tourcost = tourcost;
}
public String getTourid() {
	return tourid;
}
public void setTourid(String tourid) {
	this.tourid = tourid;
}
public String getTournm() {
	return tournm;
}
public void setTournm(String tournm) {
	this.tournm = tournm;
}
public Double getTourcost() {
	return tourcost;
}
public void setTourcost(Double tourcost) {
	this.tourcost = tourcost;
}
@Override
public String toString() {
	return "Tour [tourid=" + tourid + ", tournm=" + tournm + ", tourcost=" + tourcost + "]";
}

}
