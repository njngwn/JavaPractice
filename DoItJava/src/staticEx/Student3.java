package staticEx;

public class Student3 {
	private static int serialNum = 1000;
	int studentID;
	int cardNum;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
		cardNum = studentID + 100;
	}
	
	public String getStudentNum() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
	
}
