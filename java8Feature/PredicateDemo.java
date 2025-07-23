package java8Feature;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> p=i -> i>10;
		
		System.out.println(p.test(6)); //false
		
		System.out.println(p.test(60)); //true
	}
}
