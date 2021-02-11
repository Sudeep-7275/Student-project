package com.student.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.Details;

public interface DetailsDao extends JpaRepository<Details,Integer>{
	

}
