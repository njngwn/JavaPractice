package map.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class CountryTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (��: Korea 5000)");
		
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			String nation = scan.next();
			
			if (nation.equals("�׸�")) {
				break;
			}
			
			int population = scan.nextInt();
			map.put(nation, population);
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String nation = scan.next();
	
			if (nation.equals("�׸�")) {
				break;
			}
			
			if (map.containsKey(nation)) {
				System.out.println(nation + "�� �α��� " + map.get(nation));
			}
			else {
				System.out.println(nation + "����� �����ϴ�.");
			}
		}
		
		scan.close();
	}
}
