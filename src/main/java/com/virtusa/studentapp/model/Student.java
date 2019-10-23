package com.virtusa.studentapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Student {
	
	private int studentId;
	private String studentName;
	private Passport passport;
	
	private List<Address> address;
	private List<Trainer> trainer;
	
	@Id
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Column(name="SName",length=20)
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@OneToOne(targetEntity=Passport.class)
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@ElementCollection
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@ManyToMany
    @JoinTable(name="STUDENT_TRAINER", joinColumns= {@JoinColumn(referencedColumnName="studentID")},
    									inverseJoinColumns= {@JoinColumn(referencedColumnName="trainerId")})
    public List<Trainer> getTrainer() {
		return trainer;
	}
	public void setTrainer(List<Trainer> trainer) {
		this.trainer = trainer;
	}
	
	
	
}
