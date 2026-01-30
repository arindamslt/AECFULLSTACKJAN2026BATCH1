package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.model.Food;
import com.arindam.service.FoodService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@RestController
@RequestMapping("/food")
@CrossOrigin(origins="http://localhost:3000/")
@Validated
public class FoodConroller {
	@Autowired
private FoodService fservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@Valid @RequestBody Food f)
	{
		String msg="FOOD ADDED SUCCESSFULLY";
		fservice.addData(f);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/fetch")
	public ResponseEntity<List<Food>> getData()
	{
		List<Food> flist=fservice.getData();
		return new ResponseEntity<List<Food>>(flist,HttpStatus.OK);
	}
	@GetMapping("/fetch/{fid}")
	public ResponseEntity<Food> getFoodIdDetails(@PathVariable String fid)
	{
		Food fs=fservice.getFoodIdDetails(fid);
		return new ResponseEntity<Food>(fs,HttpStatus.OK);
	}
	@DeleteMapping("/del/{fid}")
	public ResponseEntity<String> deleteData( @PathVariable 
			@Pattern(regexp = "[A-Z0-9]+", message = "FID must be alphanumeric and not empty")
			String fid) {
		String msg="FOOD ITEM DELETED SUCCESSFULLY";
		fservice.deleteData(fid);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
