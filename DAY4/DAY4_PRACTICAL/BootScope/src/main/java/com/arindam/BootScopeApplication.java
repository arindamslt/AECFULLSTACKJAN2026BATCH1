package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.bean.Job;

@SpringBootApplication
public class BootScopeApplication implements CommandLineRunner {
	@Autowired
private Job j1;
	@Autowired
private Job j2;
	public static void main(String[] args) {
		SpringApplication.run(BootScopeApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		j1.setJobid("J1");
		j1.setJobnm("DEVELOPER");
		j1.setDomain("JAVA");
		j2.setJobid("J2");
		j2.setJobnm("ANALYST");
		j2.setDomain("PYTHON");
		System.out.println(j1);
		System.out.println(j2);
	}

}
