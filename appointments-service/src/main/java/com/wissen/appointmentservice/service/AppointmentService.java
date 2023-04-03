package com.wissen.appointmentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wissen.appointmentservice.model.Appointment;

public interface AppointmentService {
	public List<Appointment> fetchAllAppointment();

	public Appointment fetchAppointment(String id); 
}
