package com.wissen.appointmentservice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wissen.appointmentservice.model.Appointment;

public interface AppointmentDao {
	public List<Appointment> findAllAppointment();

	public Appointment fetchAppointment(String id); 
}