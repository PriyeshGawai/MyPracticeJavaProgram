package java8Feature;

import java.util.function.Supplier;

public class SupplierDemo2 {

	public static void main(String[] args) {
		
		Supplier<String> a=() ->{
			String otp="";
			for(int i=0;i<5;i++) {
				otp+=(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(a.get());
		System.out.println(a.get());
		System.out.println(a.get());
	}

}
