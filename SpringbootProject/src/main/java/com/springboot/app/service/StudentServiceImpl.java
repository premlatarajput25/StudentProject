/**
 * 
 */
package com.springboot.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.app.beans.Marks;
import com.springboot.app.beans.Student;

/**
 * @author premlatarajput
 *
 */
@Component
public class StudentServiceImpl implements StudentService {

	private static List<Student>  studentList = new ArrayList<>();
	
	static {
		
		Marks marks1 =new Marks(45, 45, 45);
		Student student1 = new Student(001, "Prem", "premlata@ggamil.com", marks1);
		
		Marks marks2 =new Marks(35, 35, 35);
		Student student2 = new Student(002, "Ritu", "Ritu@ggamil.com", marks2);
		
		Marks marks3 =new Marks(49, 49, 49);
		Student student3 = new Student(003, "PL", "PL@ggamil.com", marks3);
		
		Marks marks4 =new Marks(19, 19, 19);
		Student student4 = new Student(004, "Vikash", "Vikash@ggamil.com", marks4);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);

	}
	
	/* (non-Javadoc)
	 * @see com.springboot.studentServices.StudentService#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	/* (non-Javadoc)
	 * @see com.springboot.studentServices.StudentService#getStudentById(java.lang.Integer)
	 */
	@Override
	public Student getStudentById(Integer studId) {
		// TODO Auto-generated method stub
		for(Student stud : studentList) {
			if(stud.getStudentID().equals(studId)) {
				return stud;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.springboot.studentServices.StudentService#addNewStudent(com.springboot.StudentsPL.Student)
	 */
	@Override
	public Boolean addNewStudent(Student student) {
		// TODO Auto-generated method stub
		student.setStudentID(studentList.size()+1);
		return studentList.add(student);
	}

	/* (non-Javadoc)
	 * @see com.springboot.studentServices.StudentService#deleteStudent(java.lang.Integer)
	 */
	@Override
	public Boolean deleteStudent(Integer studId) {
		// TODO Auto-generated method stub
		for(Student stud :studentList) {
			if(stud.getStudentID().equals(studId)) {
				return studentList.remove(stud);
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.springboot.studentServices.StudentService#updateExistingStudent(com.springboot.StudentsPL.Student)
	 */
	@Override
	public Boolean updateExistingStudent(Student student) {
		// TODO Auto-generated method stub
		for(Student stud :studentList) {
			if(stud.getStudentID().equals(student.getStudentID())) {
//				stud.setStudentID(student.getStudentID());
				stud.setName(student.getName());
				stud.setEmailId(student.getEmailId());
				stud.setMarks(student.getMarks());
				return true;
			}
		}
		return null;
	}

}
