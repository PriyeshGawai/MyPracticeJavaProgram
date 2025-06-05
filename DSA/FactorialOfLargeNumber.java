package DSA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FactorialOfLargeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		//System.out.println(arr.size());
		for(int i=2;i<=number;i++) {
			int carry=0;
			for( int j=0;j<arr.size();j++) {
				int num=arr.get(j) *i +carry;
				arr.set(j, num%10);
				carry=num/10;
			}
			
			while(carry!=0) {
				arr.add(carry%10);
				carry/=10;
			}
			carry=0;
		}
		Collections.reverse(arr);
		arr.forEach(System.out::print);
		System.out.println();
		arr.stream().forEach(a -> System.out.print(a));
	}

}
