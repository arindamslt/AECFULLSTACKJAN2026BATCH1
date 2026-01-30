package com.arindam.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myapp.db")
public class DbConn {
private String drivernm;
private String url;
private String uname;
private String pass;
public DbConn() {
	super();
	// TODO Auto-generated constructor stub
}
public DbConn(String drivernm, String url, String uname, String pass) {
	super();
	this.drivernm = drivernm;
	this.url = url;
	this.uname = uname;
	this.pass = pass;
}
public String getDrivernm() {
	return drivernm;
}
public void setDrivernm(String drivernm) {
	this.drivernm = drivernm;
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
	return "DbConn [drivernm=" + drivernm + ", url=" + url + ", uname=" + uname + ", pass=" + pass + "]";
}

}
