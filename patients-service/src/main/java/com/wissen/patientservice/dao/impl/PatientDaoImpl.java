package com.wissen.patientservice.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.wissen.patientservice.dao.PatientDao;
import com.wissen.patientservice.models.Patient;


@Repository
public class PatientDaoImpl implements PatientDao {
	
	@Autowired
	MongoOperations mongoOps;
	
	@Override
	public List<Patient> findAllDocs() {
		return mongoOps.findAll(Patient.class, "patients"); 
	}
	
	@Override 
	public Patient fetchDoc(String id) {
		return mongoOps.findById(id, Patient.class); 
	}
}
