package staticEx;

public class StudentTest1 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		System.out.println(Student.serialNum);	// Ŭ���� �̸����� static ���� ����
		System.out.println(studentLee.studentName + " �й�: " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentLee.setStudentName("�ռ���");
		System.out.println(Student.serialNum);
		System.out.println(studentSon.studentName + " �й�: " + studentSon.studentID);
	}
}
