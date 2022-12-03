package com.packagename.tester;

import java.util.*;

public class CollectionTopics1 {

	public static void main(String[] args) {

		List<Object> li = new LinkedList<Object>();

		li.add("java");
		li.add(12345);
		li.add(234.234f);
		li.add('R');
		li.add(1);
		li.add(true);
		li.add("Java");
		li.add("Java");

		System.out.println(li);

		List<Object> li1 = new LinkedList<Object>();

		li.add("java");
		li.add(12345);
		li.add(234.234f);
		li.add('R');

		int size = li.size();
		System.out.println(size);

		li.add(4, "Dhamo");
		System.out.println(li);

		boolean contains = li.contains("Dhamo");
		System.out.println(contains);

		boolean equals = li.equals(li);
		System.out.println(equals);

		Object object = li.get(3);
		System.out.println(object);

		int indexOf = li.indexOf("Dhamo");
		System.out.println(indexOf);

		li.remove(3);
		System.out.println(li);

		li.set(3, "Mani");
		System.out.println(li);

		boolean retainAll = li.retainAll(li1);
		System.out.println(retainAll);

		li.clear();
		System.out.println(li);

	}
}
