package com.projectname.tester.module;

public class ChildClass_Overriding extends MethodOverriding {
	public void empname(String name) {
		super.empName("Prathap");
		System.out.println("Employee name =" + name);
	}

	public static void main(String[] args) {
		ChildClass_Overriding cc = new ChildClass_Overriding();
		cc.empname("Logesh");
	}
}
