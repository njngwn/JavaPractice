package practice210604;

public class BreakExample {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		for (num = 0; ; num++) {
			sum += num;
		    if (sum >= 100)
		    	break;	// sum이 100보다 크거나 같을 때 반복문 중단
		}

		System.out.println("num: " + num);
		System.out.println("sum: " + sum);
	}
}
