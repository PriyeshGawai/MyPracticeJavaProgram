package collectionOfCollection;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<List<Integer>> al=new ArrayList<List<Integer>>();
		
		List<Integer> r1=List.of(1,2,3);
		List<Integer> r2=List.of(4,5,6);
		List<Integer> r3=List.of(7,8);
		List<Integer> r4=List.of(9,10,11);
		
		al.add(r1);
		al.add(r2);
		al.add(r3);
		al.add(r4);
		
		System.out.println(al);

//		al.forEach(System.out::Println);
		
		al.forEach(row ->{
			for(Integer i:row) {
				System.out.print(i +" ");
			}
			System.out.println();
		});
	}

}
