package com.yedam.java.exception;

public class Account {
	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withDraw(int money) throws BalanceInsufficientException {
		if(this.balance < money) {
			throw new BalanceInsufficientException("잔고부족 : "+ (money - balance) + "이 모자랍니다."); //=> return;이랑 같은거임
			//return;
		}
		
		balance -= money;
	}
}
