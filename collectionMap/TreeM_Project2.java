package collectionMap;

import java.util.TreeMap;

public class TreeM_Project2 {
	
	public static void main(String[] args) {
			
	BankAccount ba1=new BankAccount(1122, "ddd", 1122, "Pune");
	BankAccount ba2=new BankAccount(1122, "d2", 2530, "hyd");
	BankAccount ba3=new BankAccount(1622, "ddd3", 1721, "Bang");
	BankAccount ba4=new BankAccount(1822, "ddd4", 500, "Deccan");
	BankAccount ba5=new BankAccount(1122, "ddd5", 1000, "Amt");
	BankAccount ba6=new BankAccount(1122, "ddd6", 1500, "Amt");
	
	TreeMap<BankAccount, Integer> bankAccMap=new TreeMap<BankAccount, Integer>();
	bankAccMap.put(ba1, 1); System.out.println(bankAccMap); System.out.println();
	bankAccMap.put(ba2, 2); System.out.println(bankAccMap); System.out.println();
	bankAccMap.put(ba3, 3); System.out.println(bankAccMap); System.out.println();
	bankAccMap.put(ba4, 4); System.out.println(bankAccMap); System.out.println();
	bankAccMap.put(ba5, 5); System.out.println(bankAccMap); System.out.println();
	bankAccMap.put(ba6, 5); System.out.println(bankAccMap); System.out.println();
	
	}

}
