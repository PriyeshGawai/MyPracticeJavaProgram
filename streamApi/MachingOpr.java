package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MachingOpr {

	public static void main(String[] args) {
		Person p1=new Person("Ajay", "India");
		Person p2=new Person("Dijjo", "USA");
		Person p3=new Person("Ching", "china");
		Person p4=new Person("Stiv", "japan");
		Person p5=new Person("Vishal", "India");
		
		List<Person> pr=Arrays.asList(p1,p2,p3,p4,p5);
		
		boolean status= pr.stream().anyMatch(a ->a.country.equals("china"));
		System.out.println("Any china Present::"+status);
		
		boolean status2= pr.stream().anyMatch(a ->a.country.equals("maxico"));
		System.out.println("Any maxico Present::"+status2);
		
		boolean status3= pr.stream().allMatch(a ->a.country.equals("India"));
		System.out.println("All person from India::"+status3);
		
		boolean status4= pr.stream().noneMatch(a ->a.country.equals("Iran"));
		System.out.println("No one from iran Present::"+status4);
		
		
		System.out.println("If indian present then print it");
		
		Optional<Person> findFirst=pr.stream()
										.filter(a -> a.country.equals("India"))
										.findFirst();
		
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		
		System.out.println("If more than one indian present then store");
		
		List<Person> in=pr.stream().filter(p -> p.country.equals("India"))
								.collect(Collectors.toList());
		
		System.out.println(in.size());
		in.forEach(a -> System.out.println(a));
		
		
		System.out.println("Group by operation");
		Map<String, List<Person>>  map =pr.stream().collect(Collectors.groupingBy(a -> a.country));
		System.out.println(map);
	}

}

	class Person{
		String name;
		String country;
		
		public Person(String name, String country) {
			
			this.name=name;
			this.country=country;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", country=" + country + "]";
		}
		
		
	}
