package Pattern;

import java.util.Scanner;

public class SolidDiamond {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size::: ");
		int size=s.nextInt();
		
		//full pyramid
		for(int i=0;i<size;i++) {
			
			for(int j=i;j<size;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		//full pyramid Inverted
		for (int row = 0; row < size; row++) {

			for (int col = 0; col < row; col++) {
				System.out.print(" ");
			}

			for (int col = row; col < size; col++) {
				System.out.print(" *");
			}
			System.out.println();

		}
	}

}
/*=============O/P============================
 Enter size::: 
4
    * 
   * * 
  * * * 
 * * * * 
 * * * *
  * * *
   * *
    *

 
=============================================*/