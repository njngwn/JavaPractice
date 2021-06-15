package arrayQuiz;

import java.util.ArrayList;
import java.util.Scanner;

public class FindLongName {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		int num = 4;
		
		for (int i = 0; i < num; i++) {
			System.out.println("이름을 입력하세요 >>");
			nameList.add(scanner.nextLine());
		}
	
		int longest = nameList.get(0).length();
		String longestName = nameList.get(0);
		
		for (String name : nameList) {
			if (name.length() > longest) {
				longest = name.length();
				longestName = name;
			}
		}
		
		System.out.println(nameList);
		System.out.println("가장 긴 이름은: " + longestName);
		scanner.close();
	}
}
