package practice210607;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";
		
		Student student2 = new Student();
		student2.studentName = "안승연";

		// 참조 변수 값 출력
		System.out.println(student1);	// 출력: practice210607.Student@4926097b
		System.out.println(student2);	// 출력: practice210607.Student@762efe5d
	}
}
