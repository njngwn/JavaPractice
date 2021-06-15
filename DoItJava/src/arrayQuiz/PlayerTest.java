package arrayQuiz;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerTest {
	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<Player>();
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		String nation = scanner.nextLine();
		String position = scanner.nextLine();
				
		players.add(new Player("�̰���", "���ѹα�", "MF"));
		players.add(new Player("�޽�", "�Ƹ���Ƽ��", "MF"));
		players.add(new Player("�����", "���ѹα�", "CF"));
		players.add(new Player("ȣ����", "��������", "ST"));
		players.add(new Player(name, nation, position));
		
		// ���۷��� �����Ϳ��� �ּҰ� ����Ǿ� ����
		for (int i = 0; i < players.size(); i++) {
//			if (players.get(i).getCountry() != "���ѹα�") {
//				players.get(i).showProfile();
//			}
			
			if (!players.get(i).getCountry().equals("���ѹα�")) {
				players.get(i).showProfile();
			}
		}
		
		scanner.close();
	}
}
