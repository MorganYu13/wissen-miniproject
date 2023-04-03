package com.wissen.doctorservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.doctorservice.dao.DoctorDao;
import com.wissen.doctorservice.models.Doctor;
import com.wissen.doctorservice.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDao doctorsDao; 
	
	
	@Override
	public List<Doctor> fetchAllDocs() {
		return doctorsDao.findAllDocs(); 
	}
	
	@Override
	public Doctor fetchDoc(String id) {
		return doctorsDao.fetchDoc(id); 
	}

}
