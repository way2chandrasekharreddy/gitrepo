package com.example.employeemicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Skill {
	@Id
	private String id;
	private String major;
	private Float exp;
//	@ManyToOne
//	@JoinColumn

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Float getExp() {
		return exp;
	}

	public void setExp(Float exp) {
		this.exp = exp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
