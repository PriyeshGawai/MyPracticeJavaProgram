package collectionDemo;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> t=new TreeSet<Object>();
		t.add("a");
		t.add("d");
		t.add("c");
		System.out.println(t);
		
		TreeSet<Object> t2=new TreeSet<Object>();
		
		t2.add(5);
		t2.add(51);
		t2.add(15);
		t2.add(5);
		//t2.add(null);
		
		System.out.println(t2);
		
		TreeSet<Ex> t3=new TreeSet<>();
		t3.add(new Ex(5,4));
		t3.add(new Ex(7,1));
		t3.add(new Ex(15,8));
		t3.add(new Ex(5,40));
		
		System.out.println(t3);
		
		

		TreeSet<Integer> ti=new TreeSet<>((o1, o2) -> o1.compareTo(o2));
		
		ti.add(5);
		ti.add(51);
		ti.add(15);
		ti.add(5);
		//ti.add(null);
		
		System.out.println("Integer "+ti);
		

		TreeSet<Integer> ti2=new TreeSet<>((o1, o2) -> o2.compareTo(o1));
		
		ti2.add(5);
		ti2.add(51);
		ti2.add(15);
		ti2.add(5);
		//ti2.add(null);
		
		System.out.println("Integer "+ti2);
		
		
		TreeSet<Ex> te1=new TreeSet<>((o1, o2) ->o2.getI()-o1.getI() );
		te1.add(new Ex(7,1));
		te1.add(new Ex(5,4));
		te1.add(new Ex(15,8));
		te1.add(new Ex(5,40));
		te1.add(new Ex(50,40));
		
		System.out.println("Sort by i: "+te1);
		
		TreeSet<Ex> te2=new TreeSet<>((o1, o2) ->o2.getJ()-o1.getJ() );
		te2.add(new Ex(7,1));
		te2.add(new Ex(5,4));
		te2.add(new Ex(15,8));
		te2.add(new Ex(5,40));
		te2.add(new Ex(50,40));
		
		System.out.println("Sort by j desc : "+te2);
		
		TreeSet<Ex> te3=new TreeSet<>((o1, o2) ->o1.getJ()-o2.getJ() );
		te3.add(new Ex(7,1));
		te3.add(new Ex(5,4));
		te3.add(new Ex(15,8));
		te3.add(new Ex(5,40));
		te3.add(new Ex(50,40));
		
		System.out.println("Sort by j ASC : "+te3);

	}

}



class Ex implements Comparable<Ex>{
	private int i;
	private int j;
	
	public Ex(int i,int j) {
		this.i=i;
		this.j=j;
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	@Override
	public int compareTo(Ex o) {
		// TODO Auto-generated method stub
		return this.i-o.i;//asc order
//		return o.i-this.i;//desc
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.i +" "+this.j;
	}
}
