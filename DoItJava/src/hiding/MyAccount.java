package hiding;

public class MyAccount {
	private String accountNum;
	private String accountHolder;
	private int balance;
	
	public MyAccount(String accountNum, String accountHolder, int balance) {
		setAccountNum(accountNum);
		setAccountHolder(accountHolder);
		setBalance(balance);
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금
	public void deposit(int money) {
		setBalance(getBalance() + money);
		System.out.println("입금 완료");
		System.out.println("=======================");
	}
	
	// 출금 
	public void withdraw(int money) {
		// money가 balance 보다 크다면 출금 불가
		if (money > getBalance()) {
			System.out.println("출금 불가");
			System.out.println("=======================");
		}
		else { 
			setBalance(getBalance() - money);
			System.out.println("출금 완료");
			System.out.println("=======================");
		}
	}
	
	// 계좌 정보 출력
	public void showAccount() {
		System.out.println("계좌번호: " + getAccountNum());
		System.out.println("예금주 이름: " + getAccountHolder());
		System.out.println("잔액: " + getBalance());
		System.out.println("=======================");
	}
	
}
