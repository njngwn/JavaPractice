package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CapitalGame {
	static Scanner scan = new Scanner(System.in);
	static HashMap<String, String> country = new HashMap<String, String>();
	static int totalNum;

	public static void main(String[] args) {

		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");

		while (true) {
			System.out.print("�Է�:1, ����:2, ����:3 >> ");
			int menu = scan.nextInt();

			if (menu == 1) {
				menuInput();
			} else if (menu == 2) {
				menuQuiz();
			} else if (menu == 3) {
				System.out.println("������ �����մϴ�.");
				break;
			} else {
				System.out.println("1, 2, 3 �߿� �����ϼ���.");
			}
		}
		
		scan.close();
	}

	public static void menuInput() {
		System.out.println("���� " + totalNum + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");

		while (true) {
			System.out.print("����� ���� �Է�" + (totalNum + 1) + ">>");
			String countryName = scan.next();

			if (countryName.equals("�׸�")) {
				return;
			}

			String capital = scan.next();

			if (country.containsKey(countryName)) {
				System.out.println(countryName + "�� �̹� �ֽ��ϴ�!");
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
				System.out.print(name + "�� ������? ");
				String answer = scan.next();
				
				if (answer.equals("�׸�")) {
					return;
				}
				
				if (country.get(name).equals(answer)) {
					System.out.println("����!!");
				}
				else {
					System.out.println("�ƴմϴ�!!");
				}
			}
			else {
				System.out.println("�Էµ� ���� ���ų� ��� ������ ���߼̽��ϴ�.");
				return;
			}
		}
	}
}
