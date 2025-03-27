package Pattern;

import java.util.Scanner;

public class FlipSolidDiamond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size::: ");
		int n=s.nextInt();
		
		for(int row=0; row<n; row++) {
//			 star
			for(int col=0; col<n-row; col++) {
				System.out.print("*");
			}
			
			//space
			for(int col=0; col<2*row+1; col++) {
				System.out.print(" ");
			}
			
//			 star
			for(int col=0; col<n-row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		half
		
		for(int row=0; row<n; row++) {
//			 star
			for(int col=0; col<row+1; col++) {
				System.out.print("*");
			}
			
			//space
			for(int col=0; col<2*n-2*row-1; col++) {
				System.out.print(" ");
			}
			
//			 star
			for(int col=0; col<row+1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
