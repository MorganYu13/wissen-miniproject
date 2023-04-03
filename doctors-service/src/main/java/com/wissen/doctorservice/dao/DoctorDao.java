package com.wissen.doctorservice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wissen.doctorservice.models.Doctor;


public interface DoctorDao {
	public List<Doctor> findAllDocs();

	public Doctor fetchDoc(String id); 
}