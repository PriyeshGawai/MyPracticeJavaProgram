package DSA;

import java.util.Arrays;

public class addTwoIntOfArray {

	public static void main(String[] args) {
		int[] arr= {5,7,8,4};
		int target=9;
		int[] result=new int[2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					result[0]=i;
					result[1]=j;
				}
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
