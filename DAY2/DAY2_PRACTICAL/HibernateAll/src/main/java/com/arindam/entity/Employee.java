package com.arindam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="EMPLOYEE_MASTER")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer eid;
	@Column(length = 25,nullable = false)
private String ename;
	@Column(name="DESIG",length = 25)
private String job;
	@Temporal(TemporalType.DATE)
private Date joindt;
	@Temporal(TemporalType.TIMESTAMP)
private Date workhr;
private Double sal;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Integer eid, String ename, String job, Date joindt, Date workhr, Double sal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.job = job;
	this.joindt = joindt;
	this.workhr = workhr;
	this.sal = sal;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public Date getJoindt() {
	return joindt;
}
public void setJoindt(Date joindt) {
	this.joindt = joindt;
}
public Date getWorkhr() {
	return workhr;
}
public void setWorkhr(Date workhr) {
	this.workhr = workhr;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", job=" + job + ", joindt=" + joindt + ", workhr=" + workhr
			+ ", sal=" + sal + "]";
}

}
