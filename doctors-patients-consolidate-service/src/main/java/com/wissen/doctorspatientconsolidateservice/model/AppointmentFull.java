package com.wissen.doctorspatientconsolidateservice.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.wissen.appointmentservice.model.Appointment;
import com.wissen.doctorservice.models.Doctor;
import com.wissen.patientservice.models.Patient;


@Document(collection = "app_doc_pat_aggregate")
public class AppointmentFull {
	
	@Field("app_id")
	private String id; 
	
	private String doc_id; 
	private String p_id; 
	
	private Doctor doctor; 
	private Appointment appointment; 
	private Patient patient;
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public AppointmentFull(String id, String doc_id, String p_id, Doctor doctor, Appointment appointment,
			Patient patient) {
		super();
		this.id = id;
		this.doc_id = doc_id;
		this.p_id = p_id;
		this.doctor = doctor;
		this.appointment = appointment;
		this.patient = patient;
	}
	public AppointmentFull() {
		super();
	}
}
