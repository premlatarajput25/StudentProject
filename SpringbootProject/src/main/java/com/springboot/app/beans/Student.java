/**
 * 
 */
package com.springboot.app.beans;

import org.springframework.stereotype.Component;

/**
 * @author premlatarajput
 *
 */

public class Student {

	private Integer studentID;
	private String name;
	private String emailId;
	private Marks marks;
	
	
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param studentID
	 * @param name
	 * @param emailId
	 * @param marks
	 */
	public Student(Integer studentID, String name, String emailId, Marks marks) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.emailId = emailId;
		this.marks = marks;
	}
	
	public void show() {
		System.out.println("in show1");
	}
	/**
	 * @return the studentID
	 */
	public Integer getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the marks
	 */
	public Marks getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	
	
	
}
