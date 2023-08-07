package org.student;

import org.college.week3.assignment2.College;
import org.department.Department;

public class student extends College {

	public String studentName(String name) {
		System.out.println("student Name" +name);
		return name;
	}
	public void studentId(String id) {
		System.out.println("student id" +id);
	}
	public void studentDept(String dept) {
		System.out.println("student dept" +dept);
	}
	
	public static void main(String[] args) {
		student s = new student();
		String name = s.studentName("karthiga");
		System.out.println(name);
		s.studentId("123");
		s.studentDept("IT Dept");
		
		s.collegeCode("Pa0124");
		s.collegeName("panimalar Engineering college");
		s.collegeRank("1");
		
		s.departmentName("IT Department");
	}
}
