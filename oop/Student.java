package oop;

public class Student {
	
	static int totalStudents;
	
	Student(){
		totalStudents++;
	}
	
	public static void display() {
		System.out.println(totalStudents);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.display();
		
		new Student().display();
	}

}
