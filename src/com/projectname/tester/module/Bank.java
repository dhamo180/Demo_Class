package com.projectname.tester.module;

public class Bank extends Abstract_Class {

	@Override
	public void Vivo() {
		System.out.println("Vivo");
		
	}

	@Override
	public void iphone() {
		System.out.println("iphone");
		
	}
	public static void main(String[] args) {
		Bank b = new Bank();
		b.Vivo();
		b.iphone();
		b.samsung();
	}

}
