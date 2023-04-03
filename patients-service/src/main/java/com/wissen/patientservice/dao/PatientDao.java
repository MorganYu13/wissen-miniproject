package com.wissen.patientservice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wissen.patientservice.models.Patient;


public interface PatientDao {
	public List<Patient> findAllDocs();

	public Patient fetchDoc(String id); 
}