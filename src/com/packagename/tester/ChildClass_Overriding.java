package com.packagename.tester;

public class ChildClass_Overriding extends MethodOverriding {
	public void empName(String name) {
		super.empName("Mani");
		System.out.println("Employee name =" + name);
	}

	public static void main(String[] args) {
		ChildClass_Overriding cc = new ChildClass_Overriding();
		cc.empName("Siva");

	}
}
