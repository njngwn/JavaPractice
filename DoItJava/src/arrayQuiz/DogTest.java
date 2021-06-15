package arrayQuiz;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("누렁이", "진돗개");
		dogArray[1] = new Dog("강아지2", "치와와");
		dogArray[2] = new Dog("찌롱이", "말티즈");
		dogArray[3] = new Dog("강아지4", "요크셔테리어");
		dogArray[4] = new Dog("강아지5", "푸들");
		
		System.out.println("==== for문 이용 ====");
		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		System.out.println("=== 향상된 for문 ===");
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}
}
