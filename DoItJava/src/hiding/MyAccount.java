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
	
	// �Ա�
	public void deposit(int money) {
		setBalance(getBalance() + money);
		System.out.println("�Ա� �Ϸ�");
		System.out.println("=======================");
	}
	
	// ��� 
	public void withdraw(int money) {
		// money�� balance ���� ũ�ٸ� ��� �Ұ�
		if (money > getBalance()) {
			System.out.println("��� �Ұ�");
			System.out.println("=======================");
		}
		else { 
			setBalance(getBalance() - money);
			System.out.println("��� �Ϸ�");
			System.out.println("=======================");
		}
	}
	
	// ���� ���� ���
	public void showAccount() {
		System.out.println("���¹�ȣ: " + getAccountNum());
		System.out.println("������ �̸�: " + getAccountHolder());
		System.out.println("�ܾ�: " + getBalance());
		System.out.println("=======================");
	}
	
}
