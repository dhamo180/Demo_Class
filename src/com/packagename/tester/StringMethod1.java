package com.packagename.tester;

public class StringMethod1 {

	public static void main(String[] args) {

		String s = "For the people by the people of the people";

		String[] split = s.split(" ");
		System.out.println("Memory space" + split);

		System.out.println("Specific value = " + split[4]);

		for (String str : split) {
			System.out.println(str);
		}
//
//		String s = " ";
//		String s1 = "";
//		String s2 = "!@#%^&*(";
//		String s3 = "qwertyuiopkjhg ";
//
//		System.out.println(s.isEmpty());
//		System.out.println(s1.isEmpty());
//		System.out.println(s2.isEmpty());
//		System.out.println(s3.isEmpty());

	}
}
