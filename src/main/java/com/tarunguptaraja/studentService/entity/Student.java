package com.tarunguptaraja.studentService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	String studentId;
	String name;
	
	public Student(String studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	public Student() {
		super();
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", getStudentId()=" + getStudentId()
				+ ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
