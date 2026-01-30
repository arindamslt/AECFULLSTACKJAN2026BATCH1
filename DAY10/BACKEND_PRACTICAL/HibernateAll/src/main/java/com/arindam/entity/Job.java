package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Job {
	@Id
	@Column(length = 10)
private String jobid;
	@Column(length = 25,nullable = false)
private String jobnm;
	@Column(length = 25,nullable = false)
private String domain;
public Job() {
	super();
	// TODO Auto-generated constructor stub
}
public Job(String jobid, String jobnm, String domain) {
	super();
	this.jobid = jobid;
	this.jobnm = jobnm;
	this.domain = domain;
}
public String getJobid() {
	return jobid;
}
public void setJobid(String jobid) {
	this.jobid = jobid;
}
public String getJobnm() {
	return jobnm;
}
public void setJobnm(String jobnm) {
	this.jobnm = jobnm;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
@Override
public String toString() {
	return "Job [jobid=" + jobid + ", jobnm=" + jobnm + ", domain=" + domain + "]";
}

}
