package practice210604;

public class Operator2 {
	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);	// ��°�: 151
		System.out.println(gameScore); // ��°�: 151
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2); // ��°�: 150
		System.out.println(gameScore); // ��°�: 150

		int lastScore3 = gameScore++;
		System.out.println(lastScore3);	// ��°�: 150
		System.out.println(gameScore); // ��°�: 151
		
		int lastScore4 = gameScore--;
		System.out.println(lastScore4); // ��°�: 151
		System.out.println(gameScore); // ��°�: 150
	}
}
