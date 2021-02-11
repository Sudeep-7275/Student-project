package com.student.services;

import java.util.List;

import com.student.entities.Details;

public interface DetailsService
{
	public List<Details> getStudentDetails();
	public void insertStudentDetail(Details detail);

}
