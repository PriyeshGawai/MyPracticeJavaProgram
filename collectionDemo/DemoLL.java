package collectionDemo;

import java.util.LinkedList;

public class DemoLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> al= new LinkedList<>();
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
		System.out.println("4th ele::"+al.get(4));
		
		for(Object v1:al) {
			System.out.println(v1);
		}
		
		System.out.println("For each method");
		al.forEach(ob->System.out.print(ob+" "));
		
		
	}

}
