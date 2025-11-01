package multithreding;

class Addition6{
	
	private static int x;
	private static int y;
	
	static synchronized void add(int x,int y) {
		Addition6.x=x;
		Addition6.y=y;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int ans=Addition6.x+Addition6.y;
		System.out.println(Thread.currentThread().getName()+" result "+ans);
	}
	
}


class Addition4 extends Thread{
	
	
	@Override
	public void run() {
		Addition6.add(50,50);
	}
	
}

class Addition5 extends Thread{
	

	@Override
	public void run() {
		Addition6.add(100,50);
	}
}

public class Mt_synchronize2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Addition4 add1=new Addition4();
		Addition5 add2=new Addition5();
		
		add1.setName("Priyesh");
		add1.start();
		add2.start();
	}

}
