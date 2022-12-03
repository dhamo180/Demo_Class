package com.packagename.tester;

import java.util.Scanner;

public class Even_Or_Odd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");

		int a = s.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + "is Even");
		} else {
			System.out.println(a + "Is Odd");
		}
	}
}
