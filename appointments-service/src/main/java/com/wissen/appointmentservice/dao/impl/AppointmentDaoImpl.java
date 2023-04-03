package com.wissen.appointmentservice.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.wissen.appointmentservice.dao.AppointmentDao;
import com.wissen.appointmentservice.model.Appointment;


@Repository
public class AppointmentDaoImpl implements AppointmentDao {
	
	@Autowired
	MongoOperations mongoOps;
	
	@Override
	public List<Appointment> findAllAppointment() {
		return mongoOps.findAll(Appointment.class, "appointments"); 
	}
	
	@Override 
	public Appointment fetchAppointment(String id) {
		return mongoOps.findById(id, Appointment.class); 
	}
}
