package practice210604;

public class Operator5 {
	public static void main(String[] args) {
		int num = 0B00000101;	// 5를 8비트 2진수로
		
		System.out.println(num);
		System.out.println(num << 2);	// 00010100 => 출력값: 20
		System.out.println(num >> 2);	// 00000001=> 출력값: 1
		System.out.println(num >>> 2); // 출력값: 1
		
		System.out.println(num);	// 출력값: 5
		
		num = num << 2;
		System.out.println(num);	// 출력값: 20
	}
}
