package com.wissen.patientservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wissen.patientservice.models.Patient;


public interface PatientService {
	public List<Patient> fetchAllDocs();

	public Patient fetchDoc(String id); 
}
