package com.tarunguptaraja.studentService.services;

import com.tarunguptaraja.studentService.entity.Student;

public interface StudentService {
	public Student getStudent(String studentId);

	public String createStudent(Student student);

	public String updateStudent(Student student);

	public String deleteStudent(String studentId);
}
