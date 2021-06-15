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
				
		players.add(new Player("이강인", "대한민국", "MF"));
		players.add(new Player("메시", "아르헨티나", "MF"));
		players.add(new Player("손흥민", "대한민국", "CF"));
		players.add(new Player("호날두", "포르투갈", "ST"));
		players.add(new Player(name, nation, position));
		
		// 레퍼런스 데이터에는 주소가 저장되어 있음
		for (int i = 0; i < players.size(); i++) {
//			if (players.get(i).getCountry() != "대한민국") {
//				players.get(i).showProfile();
//			}
			
			if (!players.get(i).getCountry().equals("대한민국")) {
				players.get(i).showProfile();
			}
		}
		
		scanner.close();
	}
}
