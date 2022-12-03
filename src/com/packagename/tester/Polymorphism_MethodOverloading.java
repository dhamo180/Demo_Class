package com.packagename.tester;

public class Polymorphism_MethodOverloading {
	public void stdDetails() {
		System.out.println("Student school name is ST.JOSPEH");
	}

	public void stdDetails(String fullName, char initial) {
		System.out.println("Student name =" + fullName + " . " + initial);

	}

	public void stdDetails(int id) {
		System.out.println("Student id =" + id);
	}

	public void stdDetails(String subject, int mark) {
		System.out.println("Student subject :" + subject + "=" + mark);
	}

	public static void main(String[] args) {
		// className objName = new ClassName();
		Polymorphism_MethodOverloading po = new Polymorphism_MethodOverloading();

		po.stdDetails();
		po.stdDetails("Dhamodharan", 'R');
		po.stdDetails(46);
		po.stdDetails("science", 95);
	}
}
