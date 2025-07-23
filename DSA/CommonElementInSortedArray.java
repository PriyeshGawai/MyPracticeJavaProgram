package DSA;

import java.util.ArrayList;
import java.util.List;

public class CommonElementInSortedArray {

	public static void main(String[] args) {
		int[] a= {5,9,10,15,20,30};
		
		int[] b= {6,7,9,10,15,21,26};
		
		int[] c= {4,9,10,12,13,15,20,25};
		
		List<Integer> l=new ArrayList<Integer>();
		
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length && k<c.length) {
			if(a[i]==b[j] && b[j]==c[k]) {
				l.add(a[i]);
				i++;j++;k++;
			}
			else if(a[i]<b[j]){
				i++;
			}
			else if(b[j]<c[k]) {
				j++;
			}
			else {
				k++;
			}
		}
		
		System.out.println(l);
	}

}
