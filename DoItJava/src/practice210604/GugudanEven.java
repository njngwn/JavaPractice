package practice210604;

public class GugudanEven {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		
		for (num1 = 2; num1 <= 9; num1++) {
			if (num1 % 2 != 0)
				continue;
			for (num2 = 1; num2 <= 9; num2++) {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			}
			System.out.println();
		}
	}
}
