package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.model.Tour;
import com.arindam.service.TourService;

@SpringBootApplication
public class BootDataJpaApplication implements CommandLineRunner {
	@Autowired
private TourService tservice;
	public static void main(String[] args) {
		SpringApplication.run(BootDataJpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Tour t1=new Tour("T4","KUMAYONTOUR",45000.00);
		tservice.addData(t1);
		System.out.println("FETCHING ALL DATA===========");
		List<Tour> tlist=tservice.getData();
		tlist.stream().forEach(System.out::println);
		System.out.println("FETCHED DATA BASED ON TOURID=======");
	Tour ts=tservice.getTidDetails("T1");
	System.out.println(ts);
	System.out.println("DELETE DATA====================");
	//tservice.deleteData("T2");
	List<Tour> tlist1=tservice.getData();
	tlist1.stream().forEach(System.out::println);
	System.out.println("UPDATE RECORDS=======");
	Tour tst=new Tour("T1","CITY TOUR",15000.00);
	//tservice.updateData("T1", tst);
	List<Tour> tlist2=tservice.getData();
	tlist2.stream().forEach(System.out::println);
	System.out.println("CUSTOMIZED QUERY============");
	List<Tour> tcostlist=tservice.getCostDetails(15000.00);
	tcostlist.stream().forEach(System.out::println);
	}

}
