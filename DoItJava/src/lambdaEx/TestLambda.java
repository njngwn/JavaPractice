package lambdaEx;

interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lambda_1");
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();
		reStr.showString("hello ");
	}
	
	private static PrintString returnString() {
		return s->System.out.println(s + "world");
	}

	private static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
} 
