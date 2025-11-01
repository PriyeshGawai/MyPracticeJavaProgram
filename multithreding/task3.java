package multithreding;


class demo extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+"  "+getPriority()+" Run ");
		
		for(int i=1;i<=20;i++) {
			System.out.println("run" +": "+i);
		}
	}
}

public class task3 {

	public static void main(String[] args) {
		demo th=new demo();
		
		/*
		 * calling start method before run method
		 */
//		th.start();
//		th.run();
		
		
		/*
		 * calling run and start simultaniously
		 */
//		th.run();
//		th.start();
		
		/*
		 * if start method call direcly from thread class obj
		 * 
		 */
//		Thread t=new Thread();
//		t.start();
		
		/*
		 * we cann't call start method more than one 
		 * if we do we get java.lang.IllegalThreadStateException
		 */
//		th.start();
//		th.start();
		
		
		for(int i=20;i<=30;i++) {
			System.out.println("main" +": "+i);
		}
	}

}
