package com.wissen.doctorservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "doctors")
public class Doctor {
	
	@Field("doc_id")
	private String id; 
	
	private String name; 
	private String gender; 
	private String email; 
	private String hosp_name; 
	private String phone; 
	private String specialization;
	private String age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHosp_name() {
		return hosp_name;
	}
	public void setHosp_name(String hosp_name) {
		this.hosp_name = hosp_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Doctors [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", hosp_name="
				+ hosp_name + ", phone=" + phone + ", specialization=" + specialization + ", age=" + age + "]";
	}
	
	public Doctor() {
		super();
	}
	
	public Doctor(String doc_id, String name, String gender, String email, String hosp_name, String phone,
			String specialization, String dob) {
		super();
		this.id = doc_id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.hosp_name = hosp_name;
		this.phone = phone;
		this.specialization = specialization;
		this.age = age;
	} 
}
