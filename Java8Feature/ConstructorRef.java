package Java8Feature;

import java.util.function.Supplier;

public class ConstructorRef {

	public static void main(String[] args) {
		Supplier<Doctor> s=Doctor::new;
		System.out.println(s.get().hashCode());
	}

}

class Doctor{
	Doctor(){
		System.out.println("Constuctor of Doctor class");
	}
}
