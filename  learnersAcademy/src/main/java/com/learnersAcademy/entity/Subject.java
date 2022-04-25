package com.learnersAcademy.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Subject {
	
	private String name;
	
	
	public Subject() {}
	
	public Subject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + "]";
	}

}
