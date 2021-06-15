package cooperation;

public class Subway {
	String lineNum;
	int passengerCnt;
	int income;
	
	public Subway(String lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		this.income += money;	// 버스 수입 증가
		passengerCnt++;
	}
	
	public void showInfo() {
		System.out.println(lineNum + "의 승객은 " + passengerCnt + "명이고, 수입은 " + income + "입니다." );
	}
}
