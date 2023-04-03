package com.wissen.doctorspatientconsolidateservice.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "app_doc_pat_aggregate")
public class AppointmentAggregate {
	
	@Field("app_id")
	private String id; 

	private String doc_id; 
	private String p_id;
	
	public AppointmentAggregate(String id, String doc_id, String p_id) {
		super();
		this.id = id;
		this.setDoc_id(doc_id);
		this.setP_id(p_id);
	}

	public AppointmentAggregate() {
		super();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	
}
