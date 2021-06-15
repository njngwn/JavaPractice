package quiz;

import java.util.Scanner;

public class Card {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		boolean isGame = true;

		do {
			int cnt = 1;
			int lLimit = 0;
			int hLimit = 99;
			answer = (int) (Math.random() * 100);
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");

			while (true) {
				System.out.println(lLimit + "-" + hLimit);
				System.out.print(cnt + ">>");
				int user = scanner.nextInt();
				cnt++;

				if (user == answer) {
					System.out.println("�¾ҽ��ϴ�.");
					break;
				} else if (user > answer) {
					System.out.println("�� ����");
					hLimit = user - 1;
					continue;
				} else if (user < answer) {
					lLimit = user + 1;
					System.out.println("�� ����");
					continue;
				}
			}
			
			while (true) {
				System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");

				if (scanner.next().equals("y")) {
					isGame = true;
					break;
				} 
				else if (scanner.next().equals("n")) {
					System.out.println("���� ����");
					isGame = false;
					break;
				} 
				else {
					System.out.println("�߸� �Է��Ͽ����ϴ�.");
				}
			}

		} while (isGame);

		scanner.close();
	}
}
