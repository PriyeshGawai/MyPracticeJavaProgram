package java8Feature;

public class TheadDemo1 implements Runnable {

	public static void main(String[] args) {
		TheadDemo1 d=new TheadDemo1();
		Thread t =new Thread(d);
		t.start();
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
