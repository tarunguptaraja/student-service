package com.tarunguptaraja.studentService.studentDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarunguptaraja.studentService.entity.Student;

public interface StudentDao extends JpaRepository<Student, String>{
	
}
