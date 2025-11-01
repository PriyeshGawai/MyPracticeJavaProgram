package collectionMap;

import java.util.HashMap;

public class Branch {
	
	private static HashMap<String, Integer> bm;
	
	static {
		bm=new HashMap<String, Integer>();
		bm.put("AMT", 1);
		bm.put("PUNE", 2);
		bm.put("HYD", 3);
		bm.put("BANG", 4);
		bm.put("DECCAN", 5);
	}
	public static int getBranchId(String branch) {
		return bm.get(branch.toUpperCase());
	}
}
