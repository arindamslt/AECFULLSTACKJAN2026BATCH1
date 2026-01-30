package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Order;
import com.arindam.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
private OrderRepository orepo;
	public void addData(Order o)
	{
		orepo.save(o);
	}
	public List getBiilling(String uname)
	{
		return orepo.getBiilling(uname);
	}
}
