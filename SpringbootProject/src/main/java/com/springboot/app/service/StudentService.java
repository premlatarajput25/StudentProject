/**
 * 
 */
package com.springboot.app.service;

import java.util.List;

import com.springboot.app.beans.*;

/**
 * @author premlatarajput
 *
 */

public interface StudentService {
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer studId);

	public Boolean addNewStudent(Student student);
	
	public Boolean deleteStudent(Integer studId);
	
	public Boolean updateExistingStudent(Student student);
	
}
