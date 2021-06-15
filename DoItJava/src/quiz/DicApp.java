package quiz;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		// �Էµ� ���� kor �迭 �ȿ� �ִ��� Ȯ��
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word)) {
				return word + "��(��) " + eng[i];
			}
		}
		
		return word + "�� ���� ������ �����ϴ�.";
	}
}

public class DicApp {
	public static void main(String[] args) {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String word = scanner.nextLine();
			
			if (word.equals("�׸�")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			else {
				System.out.println(Dictionary.kor2Eng(word));
			}
		}
		
		scanner.close();
	}
}
