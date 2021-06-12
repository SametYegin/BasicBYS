package org.samti;

public class Test {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Faruk", "00001111", "ANALIZ");
		Teacher t2 = new Teacher("Hulya", "111512", "GEO");
		Teacher t3 = new Teacher("Halilibo", "25084548", "KOAN");
		
		
		
		Course course1 = new Course(t1, "Analiz1", "ANZ101", "ANALIZ");
		course1.addTeacher(t1);
		//course1.printTeacherInfo();
		Course course2 = new Course(t2, "Analitik Geometri", "GEO101", "GEO");
		course2.addTeacher(t2);
		//course2.printTeacherInfo();
		Course course3 = new Course(t3, "Kompleks Analiz", "KOAN201", "KOAN");
		course3.addTeacher(t3);
		//course3.printTeacherInfo();
		
		Student samti = new Student("Samet", course1, course2, course3, "51884884", "4");
		samti.addBulkExamNote(50, 60, 70, 50, 60, 70);
		samti.isPass();

	}

}
