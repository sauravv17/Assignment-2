package com.learnersAcademy.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Batch {
	
	private int number;
	
	private Subject subjects ;
	
	public Batch() {
		
	}
	
	public Batch(int number, Subject subject) {
		this.number = number;
		this.subjects = subject;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Subject getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Batch [number=" + number  + ", subjects=" + subjects + "]";
	}

	


}
