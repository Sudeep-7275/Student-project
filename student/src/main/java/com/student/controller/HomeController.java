package com.student.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.student.entities.Details;
import com.student.services.DetailsService;

@RestController
public class HomeController {
	@Autowired
	private DetailsService detailsService;
	@GetMapping("/home")
public String home()
{
	return "homepage hello there";
}
	//get Student details
	@GetMapping(path ="/details" ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Details> getStudentDetails()
	{
		return   this.detailsService.getStudentDetails();
		
	}
	
	//Insert Student Details
	@PostMapping(path ="/details")
	public void insertStudentDetail(@RequestBody Details detail)
	{
		try
		{
			detailsService.insertStudentDetail(detail);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
		
	}
}
