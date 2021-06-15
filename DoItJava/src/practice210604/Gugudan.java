package practice210604;

public class Gugudan {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		
		for (num1 = 2; num1 <= 9; num1++) {
			for (num2 = 1; num2 <= 9; num2++) {
				if (num1 < num2)	// num1 == num2 이어도 됨 (대신 출력 먼저)
					break;
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			}
			System.out.println();
		}
	}
}
