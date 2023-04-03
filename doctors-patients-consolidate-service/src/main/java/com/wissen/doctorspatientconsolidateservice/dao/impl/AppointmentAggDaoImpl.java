package com.wissen.doctorspatientconsolidateservice.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.wissen.doctorspatientconsolidateservice.dao.AppointmentAggDao;
import com.wissen.doctorspatientconsolidateservice.model.AppointmentAggregate;



@Repository
public class AppointmentAggDaoImpl implements AppointmentAggDao {
	
	@Autowired
	MongoOperations mongoOps;
	
	@Override
	public List<AppointmentAggregate> fetchAllAppointmentFull() {
		return mongoOps.findAll(AppointmentAggregate.class, "app_doc_pat_aggregate"); 
	}
	
	@Override 
	public AppointmentAggregate fetchAppointmentFull(String id) {
		return mongoOps.findById(id, AppointmentAggregate.class); 
	}
}
