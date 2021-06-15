package practice210604;

public class ExplicitConversion {
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;

		int iNum3 = (int)dNum1 + (int)fNum2;	// 두 실수가 각각 형 변환 => 1, 0 -> 1
		int iNum4 = (int)(dNum1 + fNum2);		// 두 실수의 합이 계산된 후 형 변환 => 2.1 -> 2
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
