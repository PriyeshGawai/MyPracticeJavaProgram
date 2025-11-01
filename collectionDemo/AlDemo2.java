package collectionDemo;

import java.util.ArrayList;

public class AlDemo2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al= new ArrayList<Object>();
		System.out.println("Size:: "+al.size());
		
		al.add(5);
		al.add('P');
		al.add(new V());
		al.add("Aaa");
		al.add(null);
		al.add('P');
		al.add(new V());
		al.add("Aaa");
		al.add(5);
		al.add(null);
		al.add(new V());
		al.add("Aaa");
		System.out.println(al);
		System.out.println("Size:: "+al.size());
		
		
		for(Object v1:al) {
			System.out.println(v1);
		}
		
		System.out.println("For each method");
		al.forEach(ob->System.out.print(ob+" "));
	}


}
