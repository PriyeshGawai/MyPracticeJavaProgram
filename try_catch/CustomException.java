package try_catch;
/*
 * 1st extent Exeption class for custom exeption
 */
public class CustomException extends Exception{
	double balance;
	
	public CustomException(double amount) {
		//super("You Don't have money!");
		// TODO Auto-generated constructor stub
		this.balance=amount;
	}
	@Override
	public String toString() {
		return "You Don't have money!";
	}
	public double getAmount() {
		return balance;
	}

}
