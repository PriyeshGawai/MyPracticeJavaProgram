package collectionDemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v=new Vector<Object>();
		System.out.println("Size:: "+v.size());
		System.out.println("Capacity::"+ v.capacity());
		
		v.add(5);
		v.add('P');
		v.add(new V());
		v.add("Aaa");
		v.add(null);
		v.add('P');
		v.add(new V());
		v.add("Aaa");
		v.add(5);
		v.add(null);
		v.add(new V());
		v.add("Aaa");
		System.out.println(v);
		System.out.println("Size:: "+v.size());
		System.out.println("Capacity::"+ v.capacity());
		
		
		for(Object v1:v) {
			System.out.println(v1);
		}
		
		System.out.println("For each method");
		v.forEach(ob->System.out.print(ob+" "));
	}

}


class V{

	@Override
	public String toString() {
		return "Priyesh";
	}
	
}