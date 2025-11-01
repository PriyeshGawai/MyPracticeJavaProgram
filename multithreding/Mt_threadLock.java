package multithreding;

public class Mt_threadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		
		a.setB(b);
		b.setA(a);
		
		a.start();
		b.start();

	}

}

class A extends Thread{
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+"  "+"Start Thread A");
		System.out.println(name + " Calling joined on B thread");
		try {
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread A resume");
		System.out.println("Thread A End");
	}
}

class B extends Thread{
	
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+"  "+"Start Thread B");
		System.out.println(name + "B Calling joined on A thread");
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread B resume");
		System.out.println("Thread B End");
	}
}
