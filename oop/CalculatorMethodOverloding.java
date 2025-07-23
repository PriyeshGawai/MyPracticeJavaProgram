package oop;

public class CalculatorMethodOverloding {

	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	static double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(add(5,8));
		System.out.println(add(7,11,2));
		System.out.println(add(8.8,15.3));
	}

}
