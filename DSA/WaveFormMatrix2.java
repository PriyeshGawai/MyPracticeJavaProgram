package DSA;

public class WaveFormMatrix2 {

	public static void main(String[] args) {
	
		int[][] arr= {{1,2,3, 15},{4,5,6, 16},{7,8,9,18}};
		int m=arr.length;
		int n= arr[0].length;
		
		for(int startCol=0;startCol<n;startCol++) {
			
			if((startCol &1)==0) {
				
				for(int i=0;i<m;i++){
//					print even number of col -> top to bottom
					System.out.println(arr[i][startCol]);
				}
			}
			else {
				for(int i=m-1;i>=0;i--) {
//					print odd no of col -> bottom to top
					System.out.println(arr[i][startCol]);
				}
			}
		}
	}

}
