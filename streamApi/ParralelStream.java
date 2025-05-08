package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ParralelStream {

	public static void main(String[] args) {
		System.out.println("Serial stream ");
		Stream<Integer> ss=Stream.of(1,2,3,4);
		ss.forEach(a-> System.out.println(a +":::"+Thread.currentThread()));
		
		System.out.println("Parallel stream ");
		Stream<Integer> ps=Stream.of(1,2,3,4);
		ps.parallel().forEach(a-> System.out.println(a+":::"+Thread.currentThread()));
		
		System.out.println("special iterator ");
		List<String> name=Arrays.asList("Sachin","Umesh", "Abhi", "Jay");
		
		Spliterator<String> si=name.stream().spliterator();
		si.forEachRemaining(System.out::println);
	}

}

