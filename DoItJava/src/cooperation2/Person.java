package cooperation2;

public class Person {
	String name;
	int age;
	int money;
	
	public Person(String name, int age, int money) {
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	public void rentCar(Car car) {
		car.rent(50000);
		money -= 50000;
	}
	
	public void rentComputer(Computer computer) {
		computer.rent(20000);
		money -= 20000;
	}
	
	public void showInfo() {
		System.out.println(name + "이 현재 가지고 있는 돈은 " + money + "입니다.");
	}
}
