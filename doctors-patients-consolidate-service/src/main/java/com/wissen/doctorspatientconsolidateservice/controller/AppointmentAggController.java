package com.wissen.doctorspatientconsolidateservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wissen.appointmentservice.model.Appointment;
import com.wissen.doctorservice.models.Doctor;
import com.wissen.doctorspatientconsolidateservice.model.AppointmentAggregate;
import com.wissen.doctorspatientconsolidateservice.model.AppointmentFull;
import com.wissen.doctorspatientconsolidateservice.service.AppointmentAggService;
import com.wissen.patientservice.models.Patient;

@RestController
@RequestMapping("/appointment-full")
public class AppointmentAggController { 
	
	@Autowired
	private AppointmentAggService appointmentAggService; 
	
	@Autowired
	private RestTemplate restTemplate; 
	

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "hello " + name; 
	}
	
	@GetMapping("/getAppAggAll")
	public List<AppointmentFull> getAppointmentsFull() {
		
		return appointmentAggService.fetchAllAppointmentFull().stream().map(
				appointmentAgg -> {
					Doctor doc = restTemplate.getForObject("http://localhost:8081/doctor/getDoc/" + appointmentAgg.getDoc_id(), Doctor.class);
					Patient pat = restTemplate.getForObject("http://localhost:8082/patient/getPatient/" + appointmentAgg.getP_id(), Patient.class);
					Appointment appt = restTemplate.getForObject("http://localhost:8083/appointment/getApp/" + appointmentAgg.getId(), Appointment.class);
					
					return new AppointmentFull(appt.getId(), doc.getId(), pat.getId(), doc, appt, pat); 
				})
				.collect(Collectors.toList()); 
	}
	
	@GetMapping("/getAppAgg/{id}")
	public AppointmentFull getAppointment(@PathVariable String id) {
		AppointmentAggregate appointmentAgg = appointmentAggService.fetchAppointmentFull(id); 
		Doctor doc = restTemplate.getForObject("http://localhost:8081/doctor/getDoc/" + appointmentAgg.getDoc_id(), Doctor.class);
		Patient pat = restTemplate.getForObject("http://localhost:8082/patient/getPatient/" + appointmentAgg.getP_id(), Patient.class);
		Appointment appt = restTemplate.getForObject("http://localhost:8083/appointment/getApp/" + appointmentAgg.getId(), Appointment.class);
		
		return new AppointmentFull(appt.getId(), doc.getId(), pat.getId(), doc, appt, pat); 
	}
}
