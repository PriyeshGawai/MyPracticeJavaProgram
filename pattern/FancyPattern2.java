package Pattern;

import java.util.Scanner;

public class FancyPattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size::: ");
		int n=s.nextInt();
		
		for(int row=0; row<n; row++) {
			int col;
			for(col=0; col<row+1; col++) {
				System.out.print(col+1);
			}
			col--;
			
			//reverse counting printing			
			for(;col>=1;col--) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
