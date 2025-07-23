package java8Feature;

@FunctionalInterface
interface MyInter{
	void m1();
}

public class MethodRef {
	
	public static void m2() {
		System.out.println("M2 method...!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInter mi=MethodRef::m2;
		mi.m1();
	}

}
