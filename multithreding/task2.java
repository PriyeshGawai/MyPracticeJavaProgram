package multithreding;

class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i=20;i>0;i--) {
			System.out.println("From 20 to 1 :"+i);
		}
	}
}

public class task2 {

	public static void main(String[] args) {
		
		MyThread2 mt=new MyThread2();
		Thread th=new Thread(mt);
		th.start();
		
		for(int i=1;i<=20;i++) {
			System.out.println("From 1 to 20 :"+i);
		}
	}

}
