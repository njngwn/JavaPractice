package cooperation;

public class Taxi {
	int income;
	
	public void take(int money) {
		this.income += money;
	}
	
	public void showInfo() {
		System.out.println("�ý��� ������ " + income + "�Դϴ�.");
	}
}
