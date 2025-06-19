package java8Feature;

import java.util.function.Predicate;

//Print name start with "B" Using lamda
public class PredicateDemo2 {

	public static void main(String[] args) {
		String[] arr= {"Baban","Akash","Nilesh","Babu"};
		
		Predicate<String> p1= name -> name.charAt(0)=='B';
		
		for(String name:arr) {
			if(p1.test(name))
				System.out.println(name);
		}
	}

}


/*
 * =========OUTPUT
 * Baban
 * Babu
 * 
 */