package com.wissen.doctorspatientconsolidateservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wissen.doctorspatientconsolidateservice.model.AppointmentAggregate;
import com.wissen.doctorspatientconsolidateservice.model.AppointmentFull;

public interface AppointmentAggService {
	public List<AppointmentAggregate> fetchAllAppointmentFull();

	public AppointmentAggregate fetchAppointmentFull(String id); 
}
