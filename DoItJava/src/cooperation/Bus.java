package cooperation;

public class Bus {
	int busNum;
	int passengerCnt;
	int income;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.income += money;	// ���� ���� ����
		passengerCnt++;
	}
	
	public void showInfo() {
		System.out.println("���� " + busNum + "���� �°��� " + passengerCnt + "���̰�, ������ " + income + "�Դϴ�." );
	}
}
