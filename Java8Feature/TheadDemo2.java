package java8Feature;

public class TheadDemo2 {

	public static void main(String[] args) {
		Runnable r=new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println(i);
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
	}

}
