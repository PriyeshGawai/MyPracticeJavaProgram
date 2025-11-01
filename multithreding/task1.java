package multithreding;

class MyThread extends Thread{
		
	public void run() {
		for(int i=20;i>0;i--) {
			System.out.println("From 20 to 1 :"+i);
		}
	}
}

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th=new MyThread();
		th.start();

		for(int i=1;i<=20;i++) {
			System.out.println("From 1 to 20 :"+i);
		}
	}

}
