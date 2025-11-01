package multithreding;


class Add extends Thread{
	int x=0;int i=0;;
	@Override
	public void run() {
		while(x<=20) {
			i+=x;
			x++;
		}
		System.out.println("Add  :"+i);
	}
}


class Sub extends Thread{
	int x=20;int sub=0;;
	@Override
	public void run() {
		while(x>=0) {
			sub-=x;
			x--;
		}
		System.out.println("Sub:"+sub);
	}
}

public class mulThreadDiffLogic {
	
	

	public static void main(String[] args) {
		Add add=new Add();
		add.start();
		
		Sub sub=new Sub();
		sub.start();
	}

}
