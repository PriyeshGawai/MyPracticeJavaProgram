package Java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// age >=18
public class PredicateDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Priyesh", 25);
		Person p2=new Person("priya", 20);
		Person p3=new Person("amruta", 8);
		Person p4=new Person("neha", 45);
		Person p5=new Person("Abhay", 95);
		
		Predicate<Person> p=n ->n.age >=18;
		
		List<Person> l1=Arrays.asList(p1,p2,p3,p4,p5);
		
		for(Person per : l1) {
			if(p.test(per))
				System.out.println(per.name);
		}
	}

}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
