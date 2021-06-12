package org.samti;

public class Teacher {
	
	String name;
	String mpno;
	String branch;
	
	public Teacher(String name, String mpno, String branch) {
		
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
	
	void print() {
		
		System.out.println("Öðretmenin adý :" + this.name);
		System.out.println("Telefonu : " + this.mpno);
		System.out.println("Verdiði dersin kodu : " + this.branch);
		
	}
	
	

}
