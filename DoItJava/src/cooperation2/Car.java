package cooperation2;

public class Car {
	String modelName;
	int totalRentalFee;
	
	public Car(String modelName) {
		this.modelName = modelName;
	}
	
	public void rent(int rentalFee) {
		totalRentalFee += rentalFee;
		System.out.println("�ڵ��� (�𵨸�: " + modelName + ") �뿩 �Ϸ�");
	}
	
	public void showInfo() {
		System.out.println("�ڵ��� (�𵨸�: " + modelName + ") �� �� �뿩 ������ " + totalRentalFee + "�� �Դϴ�.");
	}
}
