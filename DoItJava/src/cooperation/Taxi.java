package cooperation;

public class Taxi {
	int income;
	
	public void take(int money) {
		this.income += money;
	}
	
	public void showInfo() {
		System.out.println("택시의 수입은 " + income + "입니다.");
	}
}
