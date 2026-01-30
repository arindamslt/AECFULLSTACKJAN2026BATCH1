package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.model.Order;
import com.arindam.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins="http://localhost:3000/")
public class OrderController {
	@Autowired
private OrderService oservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@Valid @RequestBody Order order)
	{
		String msg="YOUR ORDER PLACED";
		oservice.addData(order);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/billing/{uname}")
	public ResponseEntity<?> getBiilling(@PathVariable String uname)
	{
		List blist=oservice.getBiilling(uname);
		if(blist.isEmpty())
		{
			return new ResponseEntity<String>("NO DATA FOUND",HttpStatus.OK);
		}
		else
		{
		return new ResponseEntity<List>(blist,HttpStatus.OK);
		}
	}
}
