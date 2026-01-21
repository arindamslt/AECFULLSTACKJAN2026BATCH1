package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Tour;
import com.arindam.repository.TourRepository;

@Service //CREATE THE OBJECT+TRANSACTION MANAGEMENT
public class TourService {
	@Autowired
private TourRepository trepo;
	public void addData(Tour t)
	{
		trepo.save(t);
	}
	public List<Tour> getData()
	{
		return trepo.findAll();
	}
	public Tour getTidDetails(String tid)
	{
		return trepo.findById(tid).orElse(null);
	}
	public void deleteData(String tid)
	{
		Tour ts=trepo.findById(tid).orElse(null);
		if(ts!=null)
		{
			trepo.delete(ts);
		}
	}
	public void updateData(String tid,Tour tst)
	{
		Tour ts=trepo.findById(tid).orElse(null);
		if(ts!=null)
		{
			ts.setTournm(tst.getTournm());
			ts.setTourcost(tst.getTourcost());
			trepo.save(ts);
		}
	}
	public List<Tour> getCostDetails(Double ecost)
	{
		return trepo.getCostDetails(ecost);
	}
	
}
