package com.wissen.doctorservice.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.wissen.doctorservice.dao.DoctorDao;
import com.wissen.doctorservice.models.Doctor;


@Repository
public class DoctorDaoImpl implements DoctorDao {
	
	@Autowired
	MongoOperations mongoOps;
	
	@Override
	public List<Doctor> findAllDocs() {
		return mongoOps.findAll(Doctor.class, "doctors"); 
	}
	
	@Override 
	public Doctor fetchDoc(String id) {
		return mongoOps.findById(id, Doctor.class); 
	}
}
