package com.tarunguptaraja.studentService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarunguptaraja.studentService.entity.Student;
import com.tarunguptaraja.studentService.studentDao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	public StudentServiceImpl() {
		
	}

	@Override
	public Student getStudent(String studentId) {
		return studentDao.findById(studentId).get();
	}

	@Override
	public String createStudent(Student student) {
		studentDao.save(student);
		return student.getStudentId();
	}

	@Override
	public String updateStudent(Student student) {
		studentDao.save(student);
		return student.getStudentId();
	}

	@Override
	public String deleteStudent(String studentId) {
		Student student = studentDao.getReferenceById(studentId);
		studentDao.delete(student);
		return studentId;
	}


	

}
