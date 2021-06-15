package practice210603;

public class DoubleEx2 {
	public static void main(String[] args) {
		double dnum = 1;
		
		for (int i = 0; i < 1000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum); // 출력 결과: 100.99999999999854
	}
}
