package com.wissen.patientservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "patients")
public class Patient {
	
	@Field("p_id")
	private String id; 
	
	private String name; 
	private String gender; 
	private String email; 
	private String phone;
	private String age;
	private String weight;
	private String height;
	private String blood_type;
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBloodGroup() {
		return blood_type;
	}
	public void setBloodGroup(String blood_type) {
		this.blood_type = blood_type;
	}
	
	public Patient(String id, String name, String gender, String email, String phone, String age, String weight,
			String height, String blood_type) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.blood_type = blood_type;
	}
	public Patient() {
		super();
	}
    
	
}
