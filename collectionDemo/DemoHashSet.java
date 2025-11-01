package collectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		System.out.println(hs.size());
		System.out.println(hs);
		
		hs.add(15);
		hs.add("P");
		hs.add(15);
		hs.add(5);
		hs.add('A');
		hs.add(null);
		
		System.out.println("Size  "+ hs.size());
		System.out.println(hs);
		
		System.out.println("LInkedHashset");
		
		LinkedHashSet <Object> lhs=new LinkedHashSet<Object>();
		System.out.println(lhs.size());
		System.out.println(lhs);
		
		lhs.add(15);
		lhs.add("P");
		lhs.add(15);
		lhs.add(5);
		lhs.add('A');
		lhs.add(6);
		lhs.add(null);
		
		System.out.println("Size  "+ lhs.size());
		System.out.println(lhs);
		
	}
}
