package exception;

public class ArrayException {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("배열 인덱스 값 범위 초과");
		}
		
		System.out.println("프로그램 종료");
	}
}
