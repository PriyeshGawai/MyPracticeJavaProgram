package oop;

public class InnerClass {
	
	static class Inner{
		public void name() {
			System.out.println("iInner class method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass.Inner a=new InnerClass.Inner();
	}

}
