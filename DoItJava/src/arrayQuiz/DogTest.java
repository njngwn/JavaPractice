package arrayQuiz;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("������", "������");
		dogArray[1] = new Dog("������2", "ġ�Ϳ�");
		dogArray[2] = new Dog("�����", "��Ƽ��");
		dogArray[3] = new Dog("������4", "��ũ���׸���");
		dogArray[4] = new Dog("������5", "Ǫ��");
		
		System.out.println("==== for�� �̿� ====");
		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		System.out.println("=== ���� for�� ===");
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}
}
