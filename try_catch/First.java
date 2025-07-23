package try_catch;

public class First {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(20);
		try {
			account.withdraw(30);
		} catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
