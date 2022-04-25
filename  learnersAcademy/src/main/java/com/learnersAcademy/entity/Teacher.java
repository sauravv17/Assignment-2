package com.learnersAcademy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String empId;
	private String name;
	
	@OneToMany(mappedBy="teacher")
	private Subject subject;
	
	public Teacher() {
	
	}

	public Teacher(String empId, String name, Subject subject) {
		this.empId = empId;
		this.name = name;
		this.subject = subject;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", empId=" + empId + ", name=" + name + ", subject=" + subject + "]";
	}
	
}
