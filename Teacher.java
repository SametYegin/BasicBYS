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
		
		System.out.println("��retmenin ad� :" + this.name);
		System.out.println("Telefonu : " + this.mpno);
		System.out.println("Verdi�i dersin kodu : " + this.branch);
		
	}
	
	

}
