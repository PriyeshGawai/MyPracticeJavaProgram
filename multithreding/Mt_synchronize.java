package multithreding;

class Addition{
	
	private int x;
	private int y;
	
	synchronized void add(int x,int y) {
		this.x=x;
		this.y=y;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int ans=this.x+this.y;
		System.out.println(Thread.currentThread().getName()+" result "+ans);
	}
	
}


class Addition1 extends Thread{
	
	private Addition a;
	
	public Addition1(Addition a) {
		this.a=a;
	}
	@Override
	public void run() {
		a.add(50,50);
	}
	
}

class Addition2 extends Thread{
	
	private Addition a;
	
	public Addition2(Addition a) {
		this.a=a;
	}
	@Override
	public void run() {
		a.add(100,50);
	}
}

public class Mt_synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a1=new Addition();
		
		Addition1 add1=new Addition1(a1);
		Addition2 add2=new Addition2(a1);
		
		add1.start();
		add2.start();
	}

}
