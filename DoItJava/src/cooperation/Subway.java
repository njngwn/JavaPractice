package cooperation;

public class Subway {
	String lineNum;
	int passengerCnt;
	int income;
	
	public Subway(String lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		this.income += money;	// ���� ���� ����
		passengerCnt++;
	}
	
	public void showInfo() {
		System.out.println(lineNum + "�� �°��� " + passengerCnt + "���̰�, ������ " + income + "�Դϴ�." );
	}
}
