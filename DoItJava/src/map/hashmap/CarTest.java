package map.hashmap;

import java.util.HashMap;

class Car {
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}

class CarFactory {
	private static CarFactory instance=new CarFactory();
	   HashMap<String, Car> map=new HashMap<String, Car>();
	   private CarFactory() {
	   }
	   public static CarFactory getInstance() {
	      if(instance==null) {
	         instance=new CarFactory();
	      }
	      return instance;
	   }
	   public Car createCar(String name) {
	      if( map.containsKey(name) ) {
	         return map.get(name);
	      }
	      Car car=new Car(name);
	      map.put(name, car);
	      return car;
	   }

}

public class CarTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("���� ��");
		Car sonata2 = factory.createCar("���� ��");
		System.out.println(sonata1 == sonata2);	// true
		
		Car avante1 = factory.createCar("�¿� ��");
		Car avante2 = factory.createCar("�¿� ��");
		System.out.println(avante1 == avante2);	// true
		
		System.out.println(sonata1 == sonata2);	// false
	}
}
