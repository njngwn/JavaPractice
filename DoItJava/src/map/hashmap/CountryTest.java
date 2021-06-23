package map.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class CountryTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
		
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String nation = scan.next();
			
			if (nation.equals("그만")) {
				break;
			}
			
			int population = scan.nextInt();
			map.put(nation, population);
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String nation = scan.next();
	
			if (nation.equals("그만")) {
				break;
			}
			
			if (map.containsKey(nation)) {
				System.out.println(nation + "의 인구는 " + map.get(nation));
			}
			else {
				System.out.println(nation + "나라는 없습니다.");
			}
		}
		
		scan.close();
	}
}
