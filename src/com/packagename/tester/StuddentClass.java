package com.packagename.tester;

public class StuddentClass {
	public void stdName(String name) {
		System.out.println("Std name =" + name);
	}

	public void stdId(int id) {
		System.out.println("stdId = " + id);
	}

	public void stdMarks(int englishMark, int tamilMark) {
		System.out.println("Englsh mark :" + englishMark + " and Tamil mark: " + tamilMark);
	}

public static void main(String[] args) {
	StuddentClass sc = new StuddentClass();
	sc.stdName("Dhamodharan");
	sc.stdId(46);
	sc.stdMarks(73, 91);
	
}
}
