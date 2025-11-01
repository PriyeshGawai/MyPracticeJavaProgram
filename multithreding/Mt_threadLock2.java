package multithreding;



class FirstThreadClass{
	synchronized void m1(SecondThreadClass s2) {
		String name=Thread.currentThread().getName();
		System.out.println(name + "fc.m1 start");
		
		System.out.println(name +" fc.m1 is paused");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name +" fc.m1 is resume");
		
		System.out.println(name +" s2.m3 after calling");
		s2.m3();
		
		System.out.println(name +" s2.m3 is end");
		System.out.println(name + "fc.m1 end");
	}
	
	synchronized void m4(){
		System.out.println("M4 method");
	}
	
}


class SecondThreadClass{
	
	synchronized void m2(FirstThreadClass fc) {
		
		String name=Thread.currentThread().getName();
		System.out.println(name + "s2.m2 start");
		
		System.out.println(name +" sc.m2 is paused");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name +" sc.m2  is resume");
		
		System.out.println(name +" fc.m4 is calling");
		fc.m4();
		
		System.out.println(name +" fe.m4 is after calling");
		
		System.out.println(name + "s2.m2 end");
	}
	
	synchronized void m3() {
		System.out.println("M3 method");
	}
}



class FcThread extends Thread{
	
	private FirstThreadClass fc;
	private SecondThreadClass sc;
	
	public FcThread(FirstThreadClass fc, SecondThreadClass sc) {
		super();
		this.fc = fc;
		this.sc = sc;
	}
	
	@Override
	public void run() {
		fc.m1(sc);
	}
	
}

class ScThread extends Thread{
	
	private FirstThreadClass fc;
	private SecondThreadClass sc;
	
	public ScThread( SecondThreadClass sc, FirstThreadClass fc) {
		super();
		this.fc = fc;
		this.sc = sc;
	}
	
	@Override
	public void run() {
		sc.m2(fc);
	}
}



public class Mt_threadLock2 {
 public static void main(String[] args) {
	FirstThreadClass fc=new FirstThreadClass();
	SecondThreadClass sc=new SecondThreadClass();
	
	FcThread f= new FcThread(fc, sc);
	f.setName(" FC ");
	f.start();
	
	ScThread s= new ScThread(sc, fc);
	s.setName(" Sc ");
	s.start();
}
}