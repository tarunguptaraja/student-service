package com.tarunguptaraja.studentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tarunguptaraja.studentService.entity.Student;
import com.tarunguptaraja.studentService.services.StudentService;

@RestController
public class Controller {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(path="/student/{studentId}",method=RequestMethod.GET)
	public Student getStudent(@PathVariable String studentId) {
		return this.studentService.getStudent(studentId);
	}
	
	@RequestMapping(path="/student",method=RequestMethod.POST)
	public String createStudent(@RequestBody Student student) {
		return this.studentService.createStudent(student);
	}
	
	@RequestMapping(path="/student/{studentId}",method=RequestMethod.PUT)
	public String updateStudent(@PathVariable String studentId, @RequestBody Student student) {
		return this.studentService.updateStudent(student);
	}
	
	@RequestMapping(path="/student/{studentId}",method=RequestMethod.DELETE)
	public String deleteStudent(@PathVariable String studentId) {
		return this.studentService.deleteStudent(studentId);
	}
}
