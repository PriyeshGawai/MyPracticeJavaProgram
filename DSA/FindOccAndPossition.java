package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindOccAndPossition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,2,4,4,6,5};
		
		Map<Integer, List<Integer>> map=new HashMap();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				 map.get(arr[i]).add(i);
			}
			else {
				List<Integer> l=new ArrayList<Integer>();
				l.add(i);
				map.put(arr[i],l);
			}
		}
		System.out.println(map.toString());
		map.forEach((k,v)->System.out.println(k+" "+v));
		//map.forEach(System.out::println);
		
		Iterator<Map.Entry<Integer, List<Integer>>> m= map.entrySet().iterator();
		while (m.hasNext()) {
			Map.Entry<Integer,List<Integer>> v=m.next();
			
			System.out.println(v.getKey() +"  "+v.getValue());
		}
	}

}
