package Java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c=(name) -> System.out.println(name + " Good Evening");
		
		c.accept("Priyesh");
		
		List<Integer> number=Arrays.asList(5,2,8,9);
		
		number.forEach(i ->System.out.println(i));
		
	}

}
