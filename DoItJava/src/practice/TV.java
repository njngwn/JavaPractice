package practice;

public class TV {
	String brand;
	int year;
	int size;
	
	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(brand + "���� ���� " + year + "���� " + size + "��ġ TV");
	}
}
