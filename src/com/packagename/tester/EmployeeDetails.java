package com.packagename.tester;

public class EmployeeDetails {

	public void empName() {
		System.out.println("name");
	}
	public void empId() {
		System.out.println("123");
	}
	public static void main(String[] args) {
		
		EmployeeDetails emp = new EmployeeDetails();
		emp.empName();
		emp.empId();
	}
}
