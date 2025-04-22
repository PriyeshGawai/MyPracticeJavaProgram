package methodOverloding;

public class Student extends Person {
	
	int rollNo;
	char grade;
	
	public Student(String name, int age, int rollNo, char grade) {
		super(name, age);
		this.rollNo = rollNo;
		this.grade = grade;
	}	
	
	public void dis() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("RollNo: "+rollNo);
		System.out.println("grade: "+grade);
	}
	
}
