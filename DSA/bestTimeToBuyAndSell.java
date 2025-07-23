package DSA;

public class bestTimeToBuyAndSell {

	public static void main(String[] args) {
		int[] price= {5,9,5,4,8,2};
		int min=price[0],max=0,index=0;
		
		int i=0;
		while(i<price.length) {
			if(min>price[i]) {
				min=price[i];
				index=i;
			}i++;
			
			if(index==price.length-1) {
				min=0;
				max=0;
				break;
			}
		}
		
			int j=index+1;
			while(j<price.length) {
				if(max<price[j])max=price[j];
				j++;
			
		}
		System.out.println("Total profit: "+min+"  " +max+" :" + (max-min));
	}

}
