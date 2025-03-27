package Pattern;

import java.util.Scanner;

public class FullPyramid_Inverted {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size::: ");
		int size=s.nextInt();
		
		for(int row=0;row<size;row++) {
			
			for(int col=0; col<row; col++) {
				System.out.print(" ");
			}
			
			for(int col=row; col<size; col++) {
				System.out.print("* ");
			}
			System.out.println();
				
			
		}
		
	}

}
