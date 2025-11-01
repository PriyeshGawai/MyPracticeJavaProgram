package multithreding;

class MyThread4 extends Thread{
	private int a;
	
	public MyThread4(int a) {
		this.a=a;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=a;i++) {
			System.out.println(getName()+ a +": "+i);
		}
	}
}

public class mulThread2 {

	public static void main(String[] args) {
		
		MyThread4 mt=new MyThread4(5);
		mt.start();
		
		
		MyThread4 mt2=new MyThread4(11);
		mt2.start();
		
		
	}

}
