package com.virtusa.studentapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	@Column(name="pid")
	private int passportId;
	private String passportName;
	@OneToOne
	@JoinColumn(name="StudId")
	private Student student;
	
	public Passport() {
		super();
	}
	
	public Passport(int passportId, String passportName, Student student) {
		super();
		this.passportId = passportId;
		this.passportName = passportName;
		this.student = student;
	}

	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportName() {
		return passportName;
	}
	public void setPassportName(String passportName) {
		this.passportName = passportName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
}
