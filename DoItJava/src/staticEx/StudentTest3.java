package staticEx;

public class StudentTest3 {
	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);
		System.out.println(studentLee.studentName + " 학생 카드 번호: " + studentLee.cardNum);
	
		Student3 studentSon = new Student3();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
		System.out.println(studentSon.studentName + " 학생 카드 번호: " + studentSon.cardNum);
	}
}
