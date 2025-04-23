package pattern;

import java.util.Scanner;

public class ButterFly {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size::: ");
		int n=s.nextInt();
		
		for(int row=0; row<2*n; row++) {
			
			int star=row<n? row: n+(n-row-1);
			int space=row<n ? 2*(n-star-1) : row-star-1;
			
			for(int col=0; col<2*n; col++) {
				
				if(col<=star)System.out.print("*");
				
				else if(space>0) {
					System.out.print(" ");
					space--;
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
