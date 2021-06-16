package polymorphism;

class Animal1 {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human1 extends Animal1 {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger1 extends Animal1 {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle1 extends Animal1 {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
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
