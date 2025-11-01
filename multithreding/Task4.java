package multithreding;

public class Task4 {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();

		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println(th.getId());
	}

}


class Thread1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
