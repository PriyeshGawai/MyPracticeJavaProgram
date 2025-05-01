package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		
		//Approch 1
		
		Stream<Integer> s=Stream.of(1,5,8,9,15);
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Priyesh");
		al.add("Ajay");
		al.add("Ganesh");
		al.add("Amu");
		al.add("Akkhil");
		al.add("avani");
		
		//Approch 1
		Stream<String> s2=al.stream();
		
		
		List<Integer> arrlist=Arrays.asList(15,88,90,11,5,30);
		
		for(int i:arrlist) {
			if(i>25)
			System.out.println(i);
		}
		
		System.out.println("== Using Stream===");
		
		Stream<Integer> str=arrlist.stream();
		Stream<Integer> filter  =str.filter(i -> i>25);
		filter.forEach(i->System.out.println(i));
		
		System.out.println("== advtage of Using Stream===");
		arrlist.stream().filter(i-> i>25).forEach(i-> System.out.println(i));
		
		System.out.println("== advtage of Using method ref===");
		al.stream().filter(i-> i.startsWith("A")).forEach( System.out::println);
	}

}
