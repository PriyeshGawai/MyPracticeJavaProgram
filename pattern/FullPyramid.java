package Pattern;

import java.util.Scanner;

public class FullPyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size::: ");
		int size=s.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
