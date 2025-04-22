package collectionDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
	public static void main(String[] args) {
//		LinkedList<Integer> list= new LinkedList<Integer>();
//		list.add(5);
//		list.addLast(15);//enqueue(inserting element)
//		list.addLast(10);//enqueue
//		list.addLast(150);//enqueue
//		
//		System.out.println(list);
//		
//		Integer i=list.removeFirst();//dequeue
//		
//		System.out.println(list);
		
		Queue<Integer> list= new LinkedList<Integer>();
		list.add(5);
//		list.add(15);//enqueue(inserting element)
//		list.add(10);//enqueue
//		list.add(150);//enqueue
//		
//		System.out.println(list);
//		
//		Integer i=list.remove();//dequeue
//		
//		System.out.println(list);
//		System.out.println(list.peek());;
		
		System.out.println(list.size());
		
		//System.out.println(list.remove());//throw an exeption
		
		System.out.println(list.poll());
		
		//System.out.println(list.element());//throw an exeption
		
		System.out.println(list.peek());
		
		
		Queue<Integer> q2=new ArrayBlockingQueue<Integer>(2);
		System.out.println(q2.add(2));//true
		System.out.println(q2.offer(5));//true
		
		
		System.out.println(q2.offer(5));//false
		//System.out.println(q2.add(2));//throw an exeption
		
		
	}
}
