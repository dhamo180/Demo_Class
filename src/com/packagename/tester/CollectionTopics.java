package com.packagename.tester;

import java.util.*;

public class CollectionTopics {

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

		for (Object List : li) {
			System.out.println(List);
		}

	}
}
