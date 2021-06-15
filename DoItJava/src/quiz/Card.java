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
			System.out.println("수를 결정하였습니다. 맞추어 보세요");

			while (true) {
				System.out.println(lLimit + "-" + hLimit);
				System.out.print(cnt + ">>");
				int user = scanner.nextInt();
				cnt++;

				if (user == answer) {
					System.out.println("맞았습니다.");
					break;
				} else if (user > answer) {
					System.out.println("더 낮게");
					hLimit = user - 1;
					continue;
				} else if (user < answer) {
					lLimit = user + 1;
					System.out.println("더 높게");
					continue;
				}
			}
			
			while (true) {
				System.out.print("다시하시겠습니까(y/n)>>");

				if (scanner.next().equals("y")) {
					isGame = true;
					break;
				} 
				else if (scanner.next().equals("n")) {
					System.out.println("게임 종료");
					isGame = false;
					break;
				} 
				else {
					System.out.println("잘못 입력하였습니다.");
				}
			}

		} while (isGame);

		scanner.close();
	}
}
