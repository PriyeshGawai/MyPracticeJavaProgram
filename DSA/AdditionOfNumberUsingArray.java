package DSA;

public class AdditionOfNumberUsingArray {

	public static void main(String[] args) {
		int[] arr1= {8,5,8,9,6};
		
		int[] arr2= {5,8,9,6};
		
		StringBuffer ans= new StringBuffer();
		int carry =0;
		int i= arr1.length-1;
		int j= arr2.length-1;
		
		 while(i>=0 && j>=0) {
			int num= arr1[i]+arr2[j]+carry;
			int digit= num%10;
			ans.append(digit)  ;
			carry=num/10;
			i--;j--;
		 }
		 
		 while(i>=0 ) {
				int num= arr1[i]+carry;
				int digit= num%10;
				ans.append(digit)  ;
				carry=num/10;
				i--;
			 }
		 
		 while(j>=0 ) {
				int num= arr2[j]+carry;
				int digit= num%10;
				ans.append(digit)  ;
				carry=num/10;
				j--;
			 }
		 if(carry!=0)
		 ans.append(carry);
		
		 
		 System.out.println(ans.reverse());
	}

}
