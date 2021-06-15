package hiding;

public class MyAccountTest {
	public static void main(String[] args) {
		MyAccount yoon = new MyAccount("110-410", "À±±æµ¿", 100000);
		
		yoon.showAccount();
		yoon.deposit(50000);
		yoon.withdraw(200000);
		yoon.showAccount();
	}
	
}
