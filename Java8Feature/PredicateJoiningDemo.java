package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Emp{
	String name;
	String loc;
	String dep;
	
	
	public Emp(String name, String loc, String dep) {
		super();
		this.name = name;
		this.loc = loc;
		this.dep = dep;
	}
	
	
}

public class PredicateJoiningDemo {

	public static void main(String[] args) {
		
		Emp e1=new Emp("Priya", "Hyd", "Devops");
		Emp e2=new Emp("Priyesh", "pune", "DB");
		Emp e3=new Emp("Ganesh", "Nagpur", "Devops");
		Emp e4=new Emp("Abhay", "Amt", "DB");
		Emp e5=new Emp("Sanjay", "mumbai", "testing");
		
		List<Emp> list=Arrays.asList(e1,e2,e3,e4,e5);
		
		Predicate<Emp> p1=e ->e.loc.equalsIgnoreCase("pune");
		Predicate<Emp> p2=e ->e.dep.equals("DB");
		
		// Predicates Joining		
//		Predicate<Emp> p= p1.and(p2);
		
		Predicate<Emp> p= p1.or(p2);
		
		for(Emp l1:list) {
			if(p.test(l1))// calling lambda
				System.out.println(l1.name);
		}
	}

}
