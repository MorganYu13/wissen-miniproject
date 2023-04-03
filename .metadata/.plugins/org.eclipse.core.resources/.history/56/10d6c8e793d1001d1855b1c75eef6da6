package com.wissen.appointmentservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.appointmentservice.dao.AppointmentDao;
import com.wissen.appointmentservice.model.Appointment;
import com.wissen.appointmentservice.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao; 
	
	
	@Override
	public List<Appointment> fetchAllAppointment() {
		return appointmentDao.findAllAppointment(); 
	}
	
	@Override
	public Appointment fetchAppointment(String id) {
		return appointmentDao.fetchAppointment(id); 
	}

}
