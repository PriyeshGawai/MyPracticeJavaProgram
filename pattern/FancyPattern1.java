package Pattern;

import java.util.Scanner;

public class FancyPattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size::: ");
		int n=s.nextInt();
		
		for(int row=0; row<n; row++) {
			for(int col=0; col<row+1; col++) {
				System.out.print(row+1+ " ");
				
				if(col!=row)System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int row=0; row<n; row++) {
			for(int col=0; col<n-row; col++) {
				System.out.print(n-row+ " ");
				
				if(col!=n-row-1)System.out.print("* ");
			}
			System.out.println();
		}
	}

}
