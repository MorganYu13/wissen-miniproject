package com.wissen.patientservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.patientservice.dao.PatientDao;
import com.wissen.patientservice.models.Patient;
import com.wissen.patientservice.service.PatientService;


@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao; 
	
	
	@Override
	public List<Patient> fetchAllDocs() {
		return patientDao.findAllDocs(); 
	}
	
	@Override
	public Patient fetchDoc(String id) {
		return patientDao.fetchDoc(id); 
	}

}
