package cooperation2;

public class Rent {
	public static void main(String[] args) {
		Person p1 = new Person("James", 21, 200000);
		Person p2 = new Person("Tomas", 23, 150000);
		Car car1 = new Car("a123");
		Computer com1 = new Computer("com-1234");
				
		p1.showInfo();
		p2.showInfo();
		
		p1.rentCar(car1);
		p2.rentComputer(com1);
		
		p1.showInfo();
		p2.showInfo();
		car1.showInfo();
		com1.showInfo();
	}
}
