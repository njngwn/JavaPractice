package practice210604;

public class Quiz1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
//		int result = 0;
		
		if (operator == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		else if (operator == '-') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 - num2));
		}
		else if (operator == '*') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 * num2));
		}
		else if (operator == '/') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 / num2));
		}
	}
}
