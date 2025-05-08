package streamApi;

import java.util.Arrays;
import java.util.List;

public class MapFun {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("kamal","papu","damini","Rahul","kapil");
		
		l1.stream().map(a -> a.toUpperCase()).forEach(System.out::println);
		
		//Name start with k and map with name + name.lenght
		l1.stream().filter(a -> a.startsWith("k")).map(n->n+" - "+n.length())
		.forEach(System.out::println);
	}

}
