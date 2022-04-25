package com.learnersAcademy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String regNo;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="batch_number")
	private Batch batch;
	
	public Student() {
		
	}
	
	public Student(String regNo, String name, Batch batch) {
		this.regNo = regNo;
		this.name = name;
		this.batch = batch;
	}
	
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", regNo=" + regNo + ", name=" + name + ", batch=" + batch + "]";
	}
	
	
	
}
