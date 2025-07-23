package try_catch;

public class BankAccount {

	private double balance;
	
	public BankAccount(double amount) {
		super();
		this.balance=amount;
	}

	public void withdraw(double amount) throws CustomException {
		if(amount>balance) {
			//throw new Exception("Inssuficent balance!");
			throw new CustomException(amount);
		}
		balance-=amount;
	}
}
