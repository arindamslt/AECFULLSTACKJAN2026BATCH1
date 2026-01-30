package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Register;
import com.arindam.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
private RegisterRepository rrepo;
	public void addData(Register r)
	{
		rrepo.save(r);
	}
	public List<Register> getData()
	{
		return rrepo.findAll();
	}
	public Register checkLogin(String uname,String pass)
	{
		return rrepo.checkLogin(uname, pass);
	}
}
