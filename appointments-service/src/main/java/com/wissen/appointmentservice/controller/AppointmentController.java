package com.wissen.appointmentservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wissen.appointmentservice.model.Appointment;
import com.wissen.appointmentservice.service.AppointmentService;
import com.wissen.doctorservice.models.Doctor;
import com.wissen.patientservice.models.Patient;


@RestController
@RequestMapping("/appointment")
public class AppointmentController { 
	
	@Autowired
	private AppointmentService appointmentService; 
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "hello " + name; 
	}
	
	@GetMapping("/getAppAll")
	public List<Appointment> getDocs() {
		return appointmentService.fetchAllAppointment(); 
	}
	
	@GetMapping("/getApp/{id}")
	public Appointment getDoc(@PathVariable String id) {
		return appointmentService.fetchAppointment(id); 
	}
}
