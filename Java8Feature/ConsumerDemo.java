package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c=(name) -> System.out.println(name + " Good Evening");
		
		c.accept("Priyesh");
		
		List<Integer> number=Arrays.asList(5,2,8,9);
		
		number.forEach(i ->System.out.println(i));// not return anything
		
		//Biconsumer
		
		BiConsumer<String, Integer> c2 = (name, age) -> System.out.println(name + " age::"+ age);

		c2.accept("Priyesh",25);
		
		/** OUTPUT
		 * Priyesh age::25
		 */
	}

}
