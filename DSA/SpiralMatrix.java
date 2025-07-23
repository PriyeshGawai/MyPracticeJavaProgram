package DSA;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr= {{1,2,3, 15},{4,5,6, 16},{7,8,9,18}};
		int m=arr.length;
		int n= arr[0].length;
		
		int total_Ele=m*n;
		
		int start_row=0;
		int end_Col=n-1;
		int end_Row=m-1;
		int starting_col=0;
		
		int count=0;
		
		while(count < total_Ele) {
			
			//Print 1st row
			for(int i=starting_col;i<=end_Col && count<total_Ele;i++) {
				System.out.println(arr[start_row][i]);
				count++;
			}
			start_row++;
			
			//Print last col
			for(int i=start_row;i<=end_Row && count<total_Ele;i++) {
				System.out.println(arr[i][end_Col]);
				count++;
			}
			end_Col--;
			
			//Print last row
			for(int i=end_Col;i>=starting_col && count<total_Ele;i--) {
				System.out.println(arr[end_Row][i]);
				count++;
			}
			end_Row--;
			
			//Print 1st row
			for(int i=end_Row;i>=start_row && count<total_Ele;i--) {
				System.out.println(arr[i][starting_col]);
				count++;
			}
			starting_col++;
			
		}
	}

}
