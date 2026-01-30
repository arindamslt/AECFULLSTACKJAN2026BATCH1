package com.arindam.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="emp")
public class Employee {
	@Value("${eid}")
private String eid;
	@Value("${ename}")
private String ename;
	@Value("${colleague}")
private List<String> colleague;
	@Value("${phno}")
private Set<String> phno;
	@Value("#{${purchase}}")
private Map<String,Double> purchase;
	@Value("#{${pinfo}}")
private Properties pinfo;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String eid, String ename, List<String> colleague, Set<String> phno, Map<String, Double> purchase,
		Properties pinfo) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.colleague = colleague;
	this.phno = phno;
	this.purchase = purchase;
	this.pinfo = pinfo;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public List<String> getColleague() {
	return colleague;
}
public void setColleague(List<String> colleague) {
	this.colleague = colleague;
}
public Set<String> getPhno() {
	return phno;
}
public void setPhno(Set<String> phno) {
	this.phno = phno;
}
public Map<String, Double> getPurchase() {
	return purchase;
}
public void setPurchase(Map<String, Double> purchase) {
	this.purchase = purchase;
}
public Properties getPinfo() {
	return pinfo;
}
public void setPinfo(Properties pinfo) {
	this.pinfo = pinfo;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", colleague=" + colleague + ", phno=" + phno + ", purchase="
			+ purchase + ", pinfo=" + pinfo + "]";
}


}
