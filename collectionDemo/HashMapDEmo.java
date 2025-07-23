package collectionDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDEmo {

	public static void main(String[] args) {
		//HashMap<String, Integer> hm= new HashMap<String, Integer>();
		LinkedHashMap<String, Integer> hm= new LinkedHashMap<String, Integer>(10, 1.2f, true);
		hm.put("Apple", 10);
		hm.put("Banana", 20);
		hm.put("chiku", 5);
		hm.put("pinapple", 200);
		hm.put("Anjir", 200);
		
		hm.get("chiku");
		for(Map.Entry<String, Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey()+  " "+entry.getValue());
		}
		
	}

}
