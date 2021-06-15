package practice210604;

public class IfExample_score {
	public static void main(String[] args) {
		int score = 80;
		char grade;
		
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("학점은 " + grade + "입니다.");
	}
}
