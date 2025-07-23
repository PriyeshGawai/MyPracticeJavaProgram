package streamApi;

import java.util.stream.Stream;

public class MapFun2 {

	public static void main(String[] args) {
		Emp e1=new Emp("Aman", 25, 6000.00);
		Emp e2=new Emp("Ankit", 15, 10000.00);
		Emp e3=new Emp("Kartik", 22, 11000.00);
		Emp e4=new Emp("Akansha", 31, 15000.00);
		Emp e5=new Emp("Anil", 35, 16000.00);
		Emp e6=new Emp("Ajay", 45, 56000.00);
		
		Stream<Emp> name= Stream.of(e1,e2,e3,e4,e5,e6);
		name.filter(a -> a.salary>12000)
			.map(a -> a.name+" "+a.age+" "+a.salary)
			.forEach(System.out::println);
	}

}

class Emp{
	String name;
	int age;
	double salary;
	
	public Emp(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
}
