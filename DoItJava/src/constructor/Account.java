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
		System.out.println("���¹�ȣ: " + accountNum);
		System.out.println("�����ָ�: " + accountHolder);
		System.out.println("�ܾ�: " + balance);
	}
}
