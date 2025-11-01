package multithreding;

public class Mt_yield {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Main Start");

		Mt mt12 = new Mt();
		mt12.start();
		// Thread.yield();
		Thread.sleep(1000);

		System.out.println("Interupt call");
			mt12.interrupt();
	
		
		
		System.out.println("Main End");
	}

}

class Mt extends Thread {
	@Override
	public void run() {
		int i = 10;
		// while(i-->5)
		System.out.println("Run start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Interupt");
			//e.printStackTrace();
		}
		System.out.println("Run");
	}
}
