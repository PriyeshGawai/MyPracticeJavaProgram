package java8Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSort2 {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<Integer>();
		l.add(4);
		l.add(9);
		l.add(2);
		l.add(12);
		l.add(15);
		
		System.out.println("Before sort :"+l);
		
		Collections.sort(l, (i,j) -> i>j ? -1  :1);
//		Collections.sort(l, (i,j)-> i.compareTo(j)); //method of integer class
		
		System.out.println("After sort :"+l);
	
		//Printing
		l.forEach(i -> System.out.println(i));
		
//		l.forEach(System.out::println);

	}

}
