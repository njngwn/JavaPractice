package staticEx;

public class StudentTest3 {
	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("������");
		System.out.println(studentLee.studentName + " �й�: " + studentLee.studentID);
		System.out.println(studentLee.studentName + " �л� ī�� ��ȣ: " + studentLee.cardNum);
	
		Student3 studentSon = new Student3();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.studentName + " �й�: " + studentSon.studentID);
		System.out.println(studentSon.studentName + " �л� ī�� ��ȣ: " + studentSon.cardNum);
	}
}
