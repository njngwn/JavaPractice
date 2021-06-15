package arrayQuiz;
import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("강아지1", "푸들"));
		dogList.add(new Dog("강아지2", "진돗개"));
		dogList.add(new Dog("강아지3", "진돗개"));
		dogList.add(new Dog("강아지4", "진돗개"));
		dogList.add(new Dog("강아지5", "진돗개"));
		
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}
	}
}
