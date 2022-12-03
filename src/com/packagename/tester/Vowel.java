package com.packagename.tester;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");

		String ch = s.next();

		if (ch == "a" && ch == "e" && ch == "i" && ch == "0" && ch == "u") {
			System.out.println(ch + "is a vowel");
		} /*
			 * else { System.out.println(ch + "is not a vowel"); }
			 */
	}
}
