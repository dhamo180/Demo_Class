package com.packagename.tester;

public class Bank extends AbstractClass {

	@Override
	public void sbi() {
		System.out.println("sbi");

	}

	@Override
	public void hdfc() {
		System.out.println("hdfc");
	}

	public static void main(String[] args) {

		Bank b = new Bank();
		b.sbi();
		b.hdfc();
	}
}