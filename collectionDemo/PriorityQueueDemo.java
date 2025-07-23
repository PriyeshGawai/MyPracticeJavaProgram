package collectionDemo;

import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args){
		
		 // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(20);
		pq.add(19);
		pq.add(50);
		pq.add(10);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
