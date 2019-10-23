package com.virtusa.studentapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Trainer {
	@Id
	private int trainerId;
	private String trainerName;
	@ManyToMany
	 @JoinTable(name="STUDENT_TRAINER", joinColumns= {@JoinColumn(referencedColumnName="trainerID")},
		inverseJoinColumns= {@JoinColumn(referencedColumnName="studentId")})
	private List<Student> student;
	public Trainer() {
		super();
	}
	
	public Trainer(int trainerId, String trainerName, List<Student> student) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.student = student;
	}

	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	public List<Student> getStudent() {
		return student;
	}
	
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
	
}
