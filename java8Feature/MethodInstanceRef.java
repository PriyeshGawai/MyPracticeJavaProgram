package java8Feature;

public class MethodInstanceRef {

	public void m1() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
	
		MethodInstanceRef m=new MethodInstanceRef();
		Runnable r=m::m1;
		Thread t=new Thread(r);
		t.start();
	}

}
