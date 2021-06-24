package lambdaEx;

public class LambdaPractice {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;

		Calc calcAdd = (n1, n2) -> { return n1 + n2;};
		System.out.println(calcAdd.add(num1, num2));
		add(calcAdd);
	}
	
	private static void add(Calc c) {
		System.out.println(c.add(30, 40));
	}
}
