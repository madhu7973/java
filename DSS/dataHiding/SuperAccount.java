package dataHiding;

public class SuperAccount {

	private double balance;
	double accountNum;

	public double getBalance() {
		//validation code
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(double accountNum) {
		this.accountNum = accountNum;
	}
}
