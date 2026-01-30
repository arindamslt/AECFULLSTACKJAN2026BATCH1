package com.arindam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Register {
	@Id
	@Column(length = 15)
	@NotBlank(message = "USERNAME MUST BE GIVEN")
	private String uname;
	@Column(length = 10)
	@Size(min=6,max=10,message="PASSWORD MUST BE BETWEEN 6 TO 10 CHARECTER" )
	private String pass;
	@Column(length = 25)
	@NotBlank(message = "NAME MUST BE GIVEN")
	private String nm;
	@Column(length = 30)
	@Email(message="PROPER EMAIL FORMAT TO BE GIVEN")
	private String email;
	@Column(length = 10)
	@NotBlank(message = "PHONE NUMBER MUST BE GIVEN")
	private String phno;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String uname, String pass, String nm, String email, String phno) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.nm = nm;
		this.email = email;
		this.phno = phno;
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
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Register [uname=" + uname + ", pass=" + pass + ", nm=" + nm + ", email=" + email + ", phno=" + phno
				+ "]";
	}

}
