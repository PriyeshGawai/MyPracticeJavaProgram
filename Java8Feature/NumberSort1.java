package java8Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Without using lambda
 */
public class NumberSort1 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(4);
		l.add(9);
		l.add(2);
		l.add(12);
		l.add(15);
		
		System.out.println("Before sort :"+l);
		
		Collections.sort(l, new NumberComparator());
		
		System.out.println("After sort :"+l);
	}

}

class NumberComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i, Integer j) {
		if(i>j)return -1;
		else if(i<j) return 1;
		return 0;
	}
	
}
