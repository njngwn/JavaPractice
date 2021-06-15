package quiz;

import java.util.Scanner;

public class RPS {
	public static void playRPS(String user) {
		String str[] = { "����", "����", "��" };
		int com = (int) (Math.random() * 3);
		String result;

		switch (user) {
			case "����":
				if (com == 0)	result = "�����ϴ�.";
				else if (com == 1) result = "����ڰ� �����ϴ�.";
				else result = "����ڰ� �̰���ϴ�.";
				break;
			case "����":
				if (com == 0)	result = "����ڰ� �̰���ϴ�.";	
				else if (com == 1) result = "�����ϴ�.";
				else result = "����ڰ� �����ϴ�.";
				break;
			case "��":
				if (com == 0)	result = "����ڰ� �����ϴ�.";
				else if (com == 1) result = "����ڰ� �̰���ϴ�.";
				else result = "�����ϴ�.";
				break;
			default:
				result = "�߸��� ���� �Է��߽��ϴ�.";
				break;
		}

		System.out.print("����� = " + user);
		System.out.print(", ��ǻ�� = " + str[com]);
		System.out.println(", " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String user;

		while (true) {
			System.out.print("���� ���� ��!>>");
			user = sc.nextLine();

			if (user.equals("�׸�")) {
				break;
			}
			
			playRPS(user);
		}

		sc.close();
		System.out.println("������ �����մϴ�.");
	}

}
