package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.bean.DbConn;

@SpringBootApplication
public class BootPropertiesFilesApplication implements CommandLineRunner {
	@Autowired
private DbConn dbs;
	public static void main(String[] args) {
		SpringApplication.run(BootPropertiesFilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(dbs);
	}

}
