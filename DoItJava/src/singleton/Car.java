package singleton;

public class Car {
	private static int carID = 10000;
	private int carNum;
	
	public Car() {
		carID++;
		carNum = carID;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
