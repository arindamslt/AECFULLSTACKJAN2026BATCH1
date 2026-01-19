package com.arindam.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="drv")
public class Driver {
	@Value("${drivername}")
private String drivername;
	@Value("${url}")
private String url;
	@Value("${uname}")
private String uname;
	@Value("${pass}")
private String pass;
public Driver() {
	super();
	// TODO Auto-generated constructor stub
}
public Driver(String drivername, String url, String uname, String pass) {
	super();
	this.drivername = drivername;
	this.url = url;
	this.uname = uname;
	this.pass = pass;
}
public String getDrivername() {
	return drivername;
}
public void setDrivername(String drivername) {
	this.drivername = drivername;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "Driver [drivername=" + drivername + ", url=" + url + ", uname=" + uname + ", pass=" + pass + "]";
}

}
