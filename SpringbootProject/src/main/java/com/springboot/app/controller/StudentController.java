/**
 * 
 */
package com.springboot.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.beans.Student;
import com.springboot.app.service.StudentService;

/**
 * @author premlatarajput
 *
 */
@RestController
@RequestMapping(value="/Students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/getAllStudents")
	public List<Student> getAllStudents() {
		
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value="/getStudentById")
	public Student getStudentById(@RequestParam(name="StudentIdentity") Integer studId) {
		return studentService.getStudentById(studId);
	}
	
	@RequestMapping(value="/addNewStudent")
	public Boolean addNewStudent(@RequestBody Student student) {
		return studentService.addNewStudent(student);
	}
	
	@RequestMapping(value="/deleteStudent")
	public Boolean deleteStudent(@RequestParam Integer studId) {
		return studentService.deleteStudent(studId);
	}
	
	@RequestMapping(value="/updateExistingStudent")
	public Boolean updateExistingStudent(@RequestBody Student student) {
		return studentService.updateExistingStudent(student);
	}
}
