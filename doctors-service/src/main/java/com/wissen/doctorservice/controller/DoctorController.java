package com.wissen.doctorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.doctorservice.models.Doctor;
import com.wissen.doctorservice.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController { 
	
	@Autowired
	private DoctorService doctorService; 
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "hello " + name; 
	}
	
	@GetMapping("/getDocAll")
	public List<Doctor> getDocs() {
		return doctorService.fetchAllDocs(); 
	}
	
	@GetMapping("/getDoc/{id}")
	public Doctor getDoc(@PathVariable String id) {
		return doctorService.fetchDoc(id); 
	}
	
	
}
