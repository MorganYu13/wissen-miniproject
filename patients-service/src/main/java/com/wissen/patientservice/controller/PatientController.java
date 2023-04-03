package com.wissen.patientservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.patientservice.models.Patient;
import com.wissen.patientservice.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController { 
	
	@Autowired
	private PatientService patientService; 
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "hello " + name; 
	}
	
	@GetMapping("/getPatientAll")
	public List<Patient> getDocs() {
		return patientService.fetchAllDocs(); 
	}
	
	@GetMapping("/getPatient/{id}")
	public Patient getDoc(@PathVariable String id) {
		return patientService.fetchDoc(id); 
	}
	
	
}
