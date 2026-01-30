package com.arindam.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope("singleton")

public class Job {
private String jobid;
private String jobnm;
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
