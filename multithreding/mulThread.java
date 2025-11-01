package multithreding;

class MyThread3 implements Runnable{
	private int a;
	
	public MyThread3(int a) {
		this.a=a;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=a;i++) {
			System.out.println("From 1 to"+ a +": "+i);
		}
	}
}

public class mulThread {

	public static void main(String[] args) {
		
		MyThread3 mt=new MyThread3(5);
		Thread th=new Thread(mt);
		th.start();
		
		
		MyThread3 mt2=new MyThread3(10);
		Thread th2=new Thread(mt2);
		th2.start();
		
		
	}

}
