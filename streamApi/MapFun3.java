package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFun3 {

	public static void main(String[] args) {
		List<String> javaCourses=Arrays.asList("Java","SQL","Hibernate","Adv Java","MS");
		
		List<String> uiCourses=Arrays.asList("Html","Css","JS","React");
		
		List<List<String>> courses=Arrays.asList(javaCourses, uiCourses);
		
//		courses.stream().forEach(System.out::println);
		
		Stream<String> flatmap=courses.stream().flatMap(s-> s.stream());
		
		flatmap.forEach(a -> System.out.println(a));
		
		
		System.out.println("== Use Limit===");
		javaCourses.stream().limit(3).forEach(System.out::println);
		
		System.out.println("== Use skip===");
		javaCourses.stream().skip(2).forEach(System.out::println);
		
		System.out.println("== Use distinct===");
		List<String> d=Arrays.asList("Html","Html","Html","Css","Css","Css","JS","React");
		d.stream().distinct().forEach(System.out::println);
	}

}
