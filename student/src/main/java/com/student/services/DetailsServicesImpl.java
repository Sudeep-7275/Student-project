package com.student.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Dao.DetailsDao;
import com.student.entities.Details;
@Service
public class DetailsServicesImpl implements DetailsService {
	@Autowired
	private DetailsDao detailsDao;
	
	public DetailsServicesImpl()
	{
		
	}
	

	@Override
	public List<Details> getStudentDetails() {
		
		List<Details> studentList = new ArrayList<Details>();
		
		try
		{
			//studentList = detailsDao.findAll();
			detailsDao.findAll().forEach(studentList:: add);
		}
		catch(Exception e)
		{
		 System.out.println(e);
		}
		finally
		{
			
		}
		
		return studentList;
	}


	@Override
	public void insertStudentDetail(Details detail) 
	{
		detailsDao.save(detail);
	}

}
