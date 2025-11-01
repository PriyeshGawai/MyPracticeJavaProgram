package collectionDemo;

import java.util.HashMap;

public class DEmo2HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object, Object> hm=new HashMap<Object, Object>();
		System.out.println(hm.size());
		System.out.println(hm);
		
		hm.put("a", 25);
		hm.put("d", 15);
		hm.put(5, 5);
		hm.put("D", 17);
		System.out.println(hm);System.out.println("\t"+hm);
		System.out.println(hm.size());
		

	}

}
