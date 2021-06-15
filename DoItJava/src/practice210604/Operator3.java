package practice210604;

public class Operator3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		/* && 연산은 앞 항의 결과 값이 거짓이면 뒤에 나오는 항과 관계 없이 거짓
		 * 따라서 앞 항이 거짓이므로 뒷 항 ((i = i + 2) < 10) 문장은 실행조차 하지 않움
		 * 따라서  i 값이 여전히 2임
		 */
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value); // 출력: false
		System.out.println(num1); // 출력: 20
		System.out.println(i);	// 출력: 2
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);	// 출력: true
		System.out.println(num1); // 출력: 30
		System.out.println(i);	// 출력: 2
	}
}
