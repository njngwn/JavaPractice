package classEx;

class MyDog {
	String name;
	String type;
	
	MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type + ' ' + name;
	}
}

public class DogTest {
	public static void main(String[] args) {
		MyDog dog = new MyDog("�۸���", "������");
		System.out.println(dog);
	}
}
