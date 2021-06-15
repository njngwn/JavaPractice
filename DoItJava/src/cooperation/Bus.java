package cooperation;

public class Bus {
	int busNum;
	int passengerCnt;
	int income;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.income += money;	// 버스 수입 증가
		passengerCnt++;
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNum + "번의 승객은 " + passengerCnt + "명이고, 수입은 " + income + "입니다." );
	}
}
