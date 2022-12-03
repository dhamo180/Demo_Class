package com.packagename.tester;

import java.util.*;

public class CollectionTopic2 {

	public static void main(String[] args) {
		
		Set<Object> li = new HashSet<Object>() ;
		
		li.add("java");
		li.add(12345);
		li.add(234.234f);
		li.add('R');
		li.add(1);
		li.add(true);
		li.add("Java");
		li.add("Java");

		System.out.println(li);

		for (Object list : li) {
			System.out.println(list);
		}
		
		
		
		
		
		
	}
}
