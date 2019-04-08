package com.example.employeemicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
	@Id
	private String id;
	private String palce;
	private String pin;

	public String getPalce() {
		return palce;
	}

	public void setPalce(String palce) {
		this.palce = palce;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
