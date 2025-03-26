package Java8Feature;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> f=(name) -> name.length();
		
		BiFunction<Integer, Integer, Integer> f1=(a,b) -> a+b ;
		
		System.out.println(f.apply("priyesh"));		
		
		System.out.println(f1.apply(5, 10));
	}

}
