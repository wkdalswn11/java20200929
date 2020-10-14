package chap06.textbook.Exercise.p19;

public class Account {
	private int Balance;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	int i;
	
	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) 
		this.Balance =  balance;
		
	}

	public int getBalance() {
		
		return this.Balance;
	}

}
