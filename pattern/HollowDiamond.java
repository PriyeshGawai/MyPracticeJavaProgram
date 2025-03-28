package Pattern;

import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size::: ");
		int n=s.nextInt();
		
		for(int row=0;row<n; row++) {
			//space
			for(int col=0;col<n-row-1; col++) {
				System.out.print(" ");
			}
			
			//star
			
			for(int col=0; col<2*row+1; col++) {
				// if 1st or last character
				if(col==0) {
					System.out.print("*");
				}
				else if(col==2*row) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			
			System.out.println();
		}
		
		
		for(int row=0; row<n; row++) {
			//space 
			for(int col=0;col<row;col++) {
				System.out.print(" ");
			}
			
			for(int col=0;col<2*n -2*row-1; col++) {
				//check 1st and last
				if(col==0 || col==2*n -2*row-2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
/*=============O/P============================
Enter size::: 
6
     *
    * *
   *   *
  *     *
 *       *
*         *
*         *
 *       *
  *     *
   *   *
    * *
     *

=====================================*/