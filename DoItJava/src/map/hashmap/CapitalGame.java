package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CapitalGame {
	static Scanner scan = new Scanner(System.in);
	static HashMap<String, String> country = new HashMap<String, String>();
	static int totalNum;

	public static void main(String[] args) {

		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");

		while (true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3 >> ");
			int menu = scan.nextInt();

			if (menu == 1) {
				menuInput();
			} else if (menu == 2) {
				menuQuiz();
			} else if (menu == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("1, 2, 3 중에 선택하세요.");
			}
		}
		
		scan.close();
	}

	public static void menuInput() {
		System.out.println("현재 " + totalNum + "개 나라와 수도가 입력되어 있습니다.");

		while (true) {
			System.out.print("나라와 수도 입력" + (totalNum + 1) + ">>");
			String countryName = scan.next();

			if (countryName.equals("그만")) {
				return;
			}

			String capital = scan.next();

			if (country.containsKey(countryName)) {
				System.out.println(countryName + "는 이미 있습니다!");
			} else {
				country.put(countryName, capital);
				totalNum++;
			}
		}
	}

	public static void menuQuiz() {
		Iterator<String> ir = country.keySet().iterator();
		
		while (true) {
			if (ir.hasNext()) {
				String name = ir.next();
				System.out.print(name + "의 수도는? ");
				String answer = scan.next();
				
				if (answer.equals("그만")) {
					return;
				}
				
				if (country.get(name).equals(answer)) {
					System.out.println("정답!!");
				}
				else {
					System.out.println("아닙니다!!");
				}
			}
			else {
				System.out.println("입력된 값이 없거나 모든 문제를 맞추셨습니다.");
				return;
			}
		}
	}
}
