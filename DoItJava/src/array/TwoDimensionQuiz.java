package array;

public class TwoDimensionQuiz {
	public static void main(String[] args) {
		char[][] alphabet = new char[13][2];
		char ascii = 'a';
		
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = ascii;
				ascii++;
				System.out.print(alphabet[i][j]);
			}
			System.out.println();
		}
	}
}
