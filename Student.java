package org.samti;

public class Student {
	
	String name;
	Course c1;
	Course c2;
	Course c3;
	String stuNo;
	double avarage;
	String classes;
	boolean isPass;
	
	
	public Student(String name, Course c1, Course c2, Course c3, String stuNo, String classes) {
		
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.stuNo = stuNo;
		this.classes = classes;
		this.avarage = 0.0;
		this.isPass = false;
	}
	
	void addBulkExamNote(int note1 , int note2 , int note3 , int sozlunotu1 , int sozlunotu2 , int sozlunotu3) {
		
		if(c1.code.equals("ANZ101")) {
			this.c1.sozlunotu = sozlunotu1;
			
		}
		
		if(c2.code.equals("GEO101")) {
			this.c2.sozlunotu = sozlunotu2;
			
		}
		
		if(c1.code.equals("KOAN201")) {
			this.c3.sozlunotu = sozlunotu3;
			
		}
		
		if(0<note1 && 100>note1) {
			this.c1.note = note1;
		}
		
		if(0<note2 && 100>note2) {
			this.c2.note = note2;
		}
		
		if(0<note3 && 100>note3) {
			this.c3.note = note3;
		}
		
		
		
		
	}
	
	void printNote() {
		
		System.out.println(this.c1.name + "notu:" + this.c1.note);
		System.out.println(this.c2.name + "notu:" + this.c2.note);
		System.out.println(this.c3.name + "notu:" + this.c3.note);
		
	}
	
	void isPass() {
		
		this.avarage = ((this.c1.note*0.9 + this.c1.sozlunotu*0.1) + (this.c2.note*0.8 + this.c2.sozlunotu*0.2)  + (this.c3.note*0.7 + this.c3.sozlunotu*0.3)) / 3.0;
		System.out.println(avarage);
		if(avarage < 50) {
			System.out.println("Geçtin");
		}else {
			System.out.println("Kaldýn");
		}
		
	}
	
	
	
	

}
