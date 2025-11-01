package multithreding;

class thread6 implements Runnable{
	@Override
	public void run() {
		Wish.wish();
	}
}

public class Thread5 {

	public static void main(String[] args) {
		thread6 t=new thread6();
		t.run();
		
		thread6 t2=new thread6();
		Thread th=new Thread(t2);
		//th.run();//main
		th.start();
//		th.setDaemon(true);
//		System.out.println(th.isDaemon());
	}

}


class Wish{
	static void wish(){
		Thread th=Thread.currentThread();
		
		String name=th.getName();
		
		switch (name) {
		
		case "main":{
			System.out.println("Main");
			break;
		}
		case "Thread-0":{
			System.out.println("thread 0");
			break;
		}
		default: {
			System.out.println("default ");
		}
			
		}
	
	}
	
}