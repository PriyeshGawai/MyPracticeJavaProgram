package streamApi;

import java.util.Arrays;

public class SomeMoreStreamApiProblem_SumOfArray {

	public static void main(String[] args) {
		
		int[] arr= {1, 55, 34, 21,15};
		
		int reduce= Arrays.stream(arr).reduce(0, (a,b) ->a+b);
		System.out.println(reduce);
	}

}
