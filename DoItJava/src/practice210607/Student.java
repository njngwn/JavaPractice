package practice210607;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
//	public static void main(String[] args) {
//		Student studentAhn = new Student();
//		studentAhn.studentName = "�ȿ���";
//		
//		System.out.println(studentAhn.studentName);
//		System.out.println(studentAhn.getStudentName());
//	}

}
