package practice210607;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "�ȿ���";
		
		Student student2 = new Student();
		student2.studentName = "�Ƚ¿�";

		// ���� ���� �� ���
		System.out.println(student1);	// ���: practice210607.Student@4926097b
		System.out.println(student2);	// ���: practice210607.Student@762efe5d
	}
}
