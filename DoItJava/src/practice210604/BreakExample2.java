package practice210604;

public class BreakExample2 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; sum < 100; num++) {
			sum += num;
		}
		
		System.out.println("num: " + num);
		System.out.println("sum: " + sum);
	}
}
