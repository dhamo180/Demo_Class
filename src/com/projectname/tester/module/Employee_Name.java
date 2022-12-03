package com.projectname.tester.module;

public class Employee_Name {
	public void stdname(String name) {
		System.out.println("Student name = " + name);

	}

	public void stdid(int id) {
		System.out.println("Student Id = " + id);
	}

	public void stdMarks(int ScienceMark, int SocialMark) {
		System.out.println("Science Mark :" + ScienceMark + " and Social Mark :" + SocialMark);
	}

	public static void main(String[] args) {
		Employee_Name emp = new Employee_Name();
		emp.stdname("Karthick");
		emp.stdid(1234567890);
		emp.stdMarks(95, 99);
	}
}
