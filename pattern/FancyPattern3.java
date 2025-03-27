package Pattern;

import java.util.Scanner;

public class FancyPattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size::: ");
		int n=s.nextInt();
		
		for(int row=0; row<n; row++) {
			int col;
			for(col=0; col<row+1; col++) {
				char a=(char) (col+'A');
				System.out.print(a++);
			}
			
			col--;
			
			//reverse counting printing			
			for(;col>=1;col--) {
				char a=(char) (col+'A'-1);
				System.out.print(a--);
			}
			System.out.println();
		}
	}

}
