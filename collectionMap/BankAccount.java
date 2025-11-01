package collectionMap;

public class BankAccount implements Comparable<BankAccount>{
	
	private int accNum;
	private String accHolName;
	private double blc;
	private String branch;
	
	
	
	public BankAccount(int accNum, String accHolName, double blc, String branch) {
		super();
		this.accNum = accNum;
		this.accHolName = accHolName;
		this.blc = blc;
		this.branch=branch;
	}


	public String getAccHolName() {
		return this.accHolName;
	}


	public void setAccHolName(String accHolName) {
		this.accHolName = accHolName;
	}


	public int getAccNum() {
		return accNum;
	}
	
	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public void deposit(int amt) {
		this.blc=blc+amt;
	}
	
	public void currentBlc(){
		System.out.println(this.accHolName +" Balence is:: "+this.blc);
	}


	@Override
	public String toString() {
		return "BankAccount [accNum=" + accNum + ", accHolName=" + accHolName + ", blc=" + blc + ", branch=" + branch
				+ "]";
	}

	public int compareTo(BankAccount o) {
		
		int diff=this.branch.compareToIgnoreCase(o.branch);
		if(diff==0)		
		return this.accNum-o.accNum;
		else
			return diff;
	};
	
	@Override
	public int hashCode() {
		System.out.println("In HC "+this +"\n");
		//return accNum;
//		return branch.hashCode(); this is wrong approch/design bcs for same branch is chance to create same hashcode
					//insted use branch id
		
		return Branch.getBranchId(branch);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in Equ "+this +" "+obj);
		System.out.println();
		if(obj instanceof BankAccount) {
			BankAccount ac=(BankAccount)obj;
			return this.branch.equals(ac.branch) && 
					this.accNum==ac.accNum;
		}
		return false;
	}

	

}
