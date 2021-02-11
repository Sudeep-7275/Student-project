package com.student.entities;

import javax.persistence.Column;
import javax.persistence.*;


@Entity
@Table(name = "student_details")
public class Details {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "STUDENT_ID")
private int studentID;
@Column(name = "STUDENT_NAME")
private String studentName;
@Column(name = "STUDENT_AGE")
private int studentAge;
@Column(name = "STUDENT_COURSE")
private String studentCourse;

public Details(int  studentID, String studentName, int studentAge, String studentCourse) {
	super();
	this.studentID = studentID;
	this.studentName = studentName;
	this.studentAge = studentAge;
	this.studentCourse = studentCourse;
}
public Details() {
	super();
}
public long getStudentID() {
	return studentID;
}
public void setStudentID(int studentID) {
	this.studentID = studentID;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public long getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
public String getStudentCourse() {
	return studentCourse;
}
public void setStudentCourse(String studentCourse) {
	this.studentCourse = studentCourse;
}
@Override
public String toString() {
	return "Details [studentID=" + studentID + ", studentName=" + studentName + ", studentAge=" + studentAge
			+ ", studentCourse=" + studentCourse + "]";
}

}
