package streamApi;

import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		User user1= new User("Ajay", 25);
		User user2= new User("Babu", 35);
		User user3= new User("Anki", 15);
		User user4= new User("Ashu", 5);
		User user5= new User("Manu", 45);
		User user6= new User("kartik", 20);
		
		Stream<User> user=Stream.of(user1, user2, user3, user4, user5,user6);
		
		//user.filter(u->u.age>=15).forEach(a ->System.out.println(a));
		
		/*user.filter(u->u.name.startsWith("a", 1)).forEach(a ->System.out.println(a));// return object whose name 2nd possition has "a".
		 * 
		 */
		
		//user.filter(u->u.name.startsWith("a", 1) && u.age>=21).forEach(a ->System.out.println(a));
		
		// Another way
		
		user.filter(u->u.name.endsWith("u")).filter(a->a.age<40).forEach(System.out::println);
	}

}

class User{
	String name;
	int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age + "]";
	}
	
	
}
