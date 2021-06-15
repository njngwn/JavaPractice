package quiz;

import java.util.Scanner;

public class RPS {
	public static void playRPS(String user) {
		String str[] = { "가위", "바위", "보" };
		int com = (int) (Math.random() * 3);
		String result;

		switch (user) {
			case "가위":
				if (com == 0)	result = "비겼습니다.";
				else if (com == 1) result = "사용자가 졌습니다.";
				else result = "사용자가 이겼습니다.";
				break;
			case "바위":
				if (com == 0)	result = "사용자가 이겼습니다.";	
				else if (com == 1) result = "비겼습니다.";
				else result = "사용자가 졌습니다.";
				break;
			case "보":
				if (com == 0)	result = "사용자가 졌습니다.";
				else if (com == 1) result = "사용자가 이겼습니다.";
				else result = "비겼습니다.";
				break;
			default:
				result = "잘못된 값을 입력했습니다.";
				break;
		}

		System.out.print("사용자 = " + user);
		System.out.print(", 컴퓨터 = " + str[com]);
		System.out.println(", " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String user;

		while (true) {
			System.out.print("가위 바위 보!>>");
			user = sc.nextLine();

			if (user.equals("그만")) {
				break;
			}
			
			playRPS(user);
		}

		sc.close();
		System.out.println("게임을 종료합니다.");
	}

}
