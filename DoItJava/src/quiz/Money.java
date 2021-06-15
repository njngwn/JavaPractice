package quiz;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] unit = { 50000, 10000, 5000, 1000, 500, 100, 10, 1 };

		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();

		for (int i = 0; i < unit.length; i++) {
			if (money / unit[i] != 0) {
				System.out.println(unit[i] + "�� ¥�� : " + money / unit[i] + "��");
			}
			money %= unit[i];
		}

		scanner.close();
	}
}
