package java8Feature;

public class TheadDemo3 {

	public static void main(String[] args) {
		Runnable r=() -> {
				for(int i=0;i<5;i++) {
					System.out.println(i);
				}
			
		};
		Thread t=new Thread(r);
		t.start();
	
	}

}
