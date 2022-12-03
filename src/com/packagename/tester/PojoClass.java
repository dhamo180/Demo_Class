package com.packagename.tester;

public class PojoClass {

	public static void main(String[] args) {

		POJO po = new POJO();
		po.setA(100);

		int a = po.getA();
		System.out.println(a);
	}
}
