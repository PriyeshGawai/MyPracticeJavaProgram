package multithreding;

public class Mt_joined {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		
		Mt21 mt=new Mt21();
		Thread th=new Thread(mt);
		th.start();
		
//		th.join();
		th.join(2000);
//		th.join(10000);
		
		System.out.println("Main end!");
	}

}

class Mt21 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run start");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Interupt exception raise!");
		}
		
		System.out.println("Run end");
	}
}
