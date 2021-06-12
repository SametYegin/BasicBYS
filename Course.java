package org.samti;

public class Course {
	
	Teacher teacher;
	
	String name;
	String code;
	String prefix;
	int note;
	int sozlunotu;
	
	public Course(Teacher teacher, String name, String code, String prefix) {
		
		this.teacher = teacher;
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		int sozlunotu = 0;
	}
	

	
	void addTeacher(Teacher teacher) {
		
		if(teacher.branch.equals(prefix)) {
			
			this.teacher = teacher;
			System.out.println("Eklendi...");
			
			
		}else {
			
			System.out.println("Ogretmen - ders uyusmuyor.");
			
		}
		
		this.teacher = teacher;
		
	}
	
	void printTeacherInfo() {
		
		this.teacher.print();
		
	}
	
	

}
