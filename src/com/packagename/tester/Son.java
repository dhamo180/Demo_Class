package com.packagename.tester;

public class Son implements Father, Mother {

	public void show() {
		System.out.println("Father");
	}

	public void display() {
		System.out.println("Mother");
	}

	public static void main(String[] args) {

		Son s = new Son();
		s.display();
		s.show();

	}
}
