package chap06.textbook.Exercise.p20;

public class Account {
	private String ano;
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		if (this.balance > 0) {
		return balance;
		}
		return balance;
	}

	public void setBalance(int balance) {
		
		this.balance = balance;
	}

}
