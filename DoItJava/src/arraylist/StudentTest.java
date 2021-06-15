package arraylist;

public class StudentTest {
	public static void main(String[] args) {
		Student stuLee = new Student(1001, "Lee");
		stuLee.addSubject("국어", 100);
		stuLee.addSubject("수학", 50);
		
		Student stuKim = new Student(1002, "Kim");
		stuKim.addSubject("국어", 70);
		stuKim.addSubject("수학", 85);
		stuKim.addSubject("영어", 100);
		
		stuLee.showStudentInfo();
		System.out.println("================================");
		stuKim.showStudentInfo();
	}
}
