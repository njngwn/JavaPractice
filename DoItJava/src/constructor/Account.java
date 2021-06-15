package constructor;

public class Account {
	String accountNum;
	String accountHolder;
	int balance;
	
	public Account(String accountNum, String accountHolder, int balance) {
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호: " + accountNum);
		System.out.println("예금주명: " + accountHolder);
		System.out.println("잔액: " + balance);
	}
}
