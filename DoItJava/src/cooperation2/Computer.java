package cooperation2;

public class Computer {
	String modelName;
	int totalRentalFee;
	
	public Computer(String modelName) {
		this.modelName = modelName;
	}
	
	public void rent(int rentalFee) {
		totalRentalFee += rentalFee;
		System.out.println("��ǻ�� (�𵨸�: " + modelName + ") �뿩 �Ϸ�");
	}
	
	public void showInfo() {
		System.out.println("��ǻ�� (�𵨸�: " + modelName + ") �� �� �뿩 ������ " + totalRentalFee + "�� �Դϴ�.");
	}
}
