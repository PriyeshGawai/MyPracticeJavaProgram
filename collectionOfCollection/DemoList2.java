package collectionOfCollection;

import java.util.ArrayList;
import java.util.List;

public class DemoList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<List<Object>> al=new ArrayList<List<Object>>();
		
		List<Object> cl=List.of("r1","r2","r3");
		List<Object> r1=List.of(1,2,3);
		List<Object> r2=List.of(4,5,6);
		List<Object> r3=List.of(7,8);
		List<Object> r4=List.of(9,10,11);
		
		al.add(cl);
		al.add(r1);
		al.add(r2);
		al.add(r3);
		al.add(r4);
		
		System.out.println(al);

//		al.forEach(System.out::Println);
		
		al.forEach(row ->{
			for(Object i:row) {
				System.out.print(" "+i +"  ");
			}
			System.out.println();
		});
	}

}
