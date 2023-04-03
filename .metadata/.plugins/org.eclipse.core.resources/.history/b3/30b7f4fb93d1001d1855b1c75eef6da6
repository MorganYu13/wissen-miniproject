package com.wissen.appointmentservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.wissen.doctorservice.models.Doctor;
import com.wissen.patientservice.models.Patient;

@Document(collection = "appointments")
public class Appointment {
	
	@Field("app_id")
	private String id; 
	
	private String date_of_consultation;
	private String date_of_billing; 
	private String consulation_fee;
	private Boolean is_new_reg; 
	private Boolean is_online;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate_of_consultation() {
		return date_of_consultation;
	}
	public void setDate_of_consultation(String date_of_consultation) {
		this.date_of_consultation = date_of_consultation;
	}
	public String getDate_of_billing() {
		return date_of_billing;
	}
	public void setDate_of_billing(String date_of_billing) {
		this.date_of_billing = date_of_billing;
	}
	public String getConsulation_fee() {
		return consulation_fee;
	}
	public void setConsulation_fee(String consulation_fee) {
		this.consulation_fee = consulation_fee;
	}	
	public Boolean getIs_new_reg() {
		return is_new_reg;
	}
	public void setIs_new_reg(Boolean is_new_reg) {
		this.is_new_reg = is_new_reg;
	}
	public Boolean getIs_online() {
		return is_online;
	}
	public void setIs_online(Boolean is_online) {
		this.is_online = is_online;
	}
	public Appointment(String id, String date_of_consultation, String date_of_billing, String consulation_fee,
			Boolean is_new_reg, Boolean is_online) {
		super();
		this.id = id;
		this.date_of_consultation = date_of_consultation;
		this.date_of_billing = date_of_billing;
		this.consulation_fee = consulation_fee;
		this.is_new_reg = is_new_reg;
		this.is_online = is_online;
	}
	public Appointment() {
		super();
	}
}
