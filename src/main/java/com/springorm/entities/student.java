package com.springorm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class student {

	@Id
	@Column(name = "student_id")
	private int studentId;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "student_city")
	private String city;

	public student(int i, String studentName, String city) {
		super();
		this.studentId = i;
		this.studentName = studentName;
		this.city = city;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", city=" + city + "]";
	}

}
