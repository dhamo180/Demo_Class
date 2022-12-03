package com.projectname.tester.module;

public class Polymorphism_Methodoverloading {
	public void stdDetails() {
		System.out.println("My School Name is Global School");
	}

	public void stdDetails(String name, char initial) {
		System.out.println("Student Name = " + name + '.' + initial);
	}

	public void stdDetails(int Id) {
		System.out.println("Student Id =" + Id);
	}

	public void stddetails(String Subject, int Mark) {
		System.out.println("Student subject :" + Subject + "=" + Mark);
	}

	public static void main(String[] args) {
		Polymorphism_Methodoverloading pm = new Polymorphism_Methodoverloading();
		pm.stdDetails();
		pm.stdDetails("Karthick", 'R');
		pm.stdDetails(1234567890);
		pm.stddetails("Science", 95);
	}
 
}
