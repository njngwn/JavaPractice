package test;

public class Question1_1 {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				cnt++;
				sum += i;
			}
		}

		System.out.println("7�� ����� ���� : " + cnt);
		System.out.println("7�� ����� �� : " + sum);
	}
}
