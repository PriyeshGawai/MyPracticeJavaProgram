package Math;

public class Demo {

	public static void main(String[] args) {
	
		int a=10;
		int b=15;
		int max=Math.max(a, b);
		System.out.println(max);
		
		int min=Math.min(a, b);
		System.out.println(min);
		
		int c=-11;
		System.out.println(Math.abs(c));

		double d=5.12;
		System.out.println("Ceiling :"+Math.ceil(d));
		
		System.out.println(Math.log(25));
		System.out.println(Math.round(Math.log10(25599)));
	}

}
