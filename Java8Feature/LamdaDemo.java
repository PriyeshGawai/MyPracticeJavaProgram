package java8Feature;

@FunctionalInterface
interface Demo1{
	public void m1();
}

public class LamdaDemo {
	public static void main(String[] args) {
		Demo1 d=() -> System.out.println("m1() Called...");
		d.m1();
	}
}
