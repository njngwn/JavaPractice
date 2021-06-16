package polymorphism;

class Animal1 {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human1 extends Animal1 {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}

class Tiger1 extends Animal1 {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}

class Eagle1 extends Animal1 {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human1());
		aTest.moveAnimal(new Tiger1());
		aTest.moveAnimal(new Eagle1());
	}

	public void moveAnimal(Animal1 animal) {
		animal.move();
	}
}
