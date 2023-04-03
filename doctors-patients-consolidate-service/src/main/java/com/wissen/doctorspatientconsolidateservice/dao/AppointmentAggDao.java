package com.wissen.doctorspatientconsolidateservice.dao;

import java.util.List;

import com.wissen.doctorspatientconsolidateservice.model.AppointmentAggregate;

public interface AppointmentAggDao {
	public List<AppointmentAggregate> fetchAllAppointmentFull();

	public AppointmentAggregate fetchAppointmentFull(String id); 
}