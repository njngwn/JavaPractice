package practice210604;

public class WhileExample2 {
	public static void main(String[] args) {
		int num = 5;
		int fac = 1;
		
		while(num >= 1) {
			fac *= num;
			num--;
		}
		
		System.out.println("5!은 " + fac + "입니다. ");
	}
}
