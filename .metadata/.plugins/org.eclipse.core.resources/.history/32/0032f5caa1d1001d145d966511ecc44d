package com.wissen.doctorspatientconsolidateservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.doctorspatientconsolidateservice.dao.AppointmentAggDao;
import com.wissen.doctorspatientconsolidateservice.model.AppointmentAggregate;
import com.wissen.doctorspatientconsolidateservice.model.AppointmentFull;
import com.wissen.doctorspatientconsolidateservice.service.AppointmentAggService;

@Service
public class AppointmentAggServiceImpl implements AppointmentAggService {

	@Autowired
	private AppointmentAggDao appointmentAggDao; 
	
	
	@Override
	public List<AppointmentAggregate> fetchAllAppointmentFull() {
		return appointmentAggDao.fetchAllAppointmentFull(); 
	}
	
	@Override
	public AppointmentAggregate fetchAppointmentFull(String id) {
		return appointmentAggDao.fetchAppointmentFull(id); 
	}

}
