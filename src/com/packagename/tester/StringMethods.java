package com.packagename.tester;

public class StringMethods {

	public static void main(String[] args) {

		String s = "For the people by the people of the people";

		int length = s.length();
		System.out.println(length);

		char charAt = s.charAt(9); // will pass to get the value or character
		System.out.println(charAt);

		boolean equals = s.equals("For the PEOPLE by the people of the people");
		System.out.println(equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase("For the People by the people of the people");
		System.out.println(equalsIgnoreCase);

		boolean contains = s.contains("by");
		System.out.println(contains);

		boolean startsWith = s.startsWith("For the people by");
		System.out.println(startsWith);

		boolean endsWith = s.endsWith("people of the people");
		System.out.println(endsWith);

		int indexOf = s.indexOf('y'); // will pass the character to get index
		System.out.println(indexOf);

		int lastIndexOf = s.lastIndexOf('e');// will pass the character to get last index
		System.out.println(lastIndexOf);

		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		String lowercase = upperCase.toLowerCase();
		System.out.println(lowercase);

		String trim = s.trim();
		System.out.println(trim);

		String replace = s.replace(' ', '$');
		System.out.println(replace);

	}
}
