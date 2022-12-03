package com.javaprograms.org;

import java.lang.reflect.Array;
import java.util.List;

public class CountOfLetters {

	private static void countOfEachCharacters() {

		System.out.println("countOfEachCharacters :-");

		String s = "wELcome to @java123";
		int countOfSmall = 0;
		int countOfCaps = 0;
		int countOfNum = 0;
		int countOfSpecial = 0;

		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				countOfSmall++;
			} else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				countOfCaps++;
			} else if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
				countOfNum++;
			} else {
				countOfSpecial++;
			}
		}
		System.out.println("countOfSmall :" + countOfSmall);
		System.out.println("countOfCaps :" + countOfCaps);
		System.out.println("countOfNum :" + countOfNum);
		System.out.println("countOfSpecial :" + countOfSpecial);
	}

	public static void initCap() {
		String s = "welcome to java";
		String[] a = s.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < a.length; i++) {
			char c = a[i].charAt(0);
			char capsc = Character.toUpperCase(c);
			String substring = a[i].substring(1);
			sb.append(capsc).append(substring).append(" ");
		}
		String trim = sb.toString().trim();
		System.out.println("Init caps =" + trim);

	}

//	public static void swapCase() {
//
//		String s = "WELCOME to java";
//		String swapCase = StringUtils.swapCase(s);
//		System.out.println("Before swap of String =" + s);
//		System.out.println("After swap =" + swapCase);
//
//	}
	public static void duplicatesfromArray() {
//
//		String[] s = { "ABC", "BCD", "CDE", "ABC", "BCD" };
//		java.util.List<String> list = Array
		
	}

	public static void main(String[] args) {
		countOfEachCharacters();
		initCap();
	}
}
