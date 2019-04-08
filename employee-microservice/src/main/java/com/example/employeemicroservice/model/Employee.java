package com.example.employeemicroservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String dept;
	private String joiningDate;

//	@DBRef
	private List<Address> address;

//	@DBRef
//	@OneToMany(mappedBy = "skill", cascade = CascadeType.ALL)
	private List<Skill> skils;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Skill> getSkils() {
		return skils;
	}

	public void setSkils(List<Skill> skils) {
		this.skils = skils;
	}

}
