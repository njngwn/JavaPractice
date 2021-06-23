package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CustomerHashMap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> customer = new HashMap<String, Integer>();

		System.out.println("** 포인트 관리 프로그램입니다 **");

		while (true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = scan.next();

			if (name.equals("그만")) {
				break;
			}

			int point = scan.nextInt();

			if (customer.containsKey(name)) {
				customer.put(name, customer.get(name)+point);
			} else {
				customer.put(name, point);
			}

			Iterator<String> ir = customer.keySet().iterator();

			while (ir.hasNext()) {
				String cName = ir.next();
				int cPoint = customer.get(cName);

				System.out.print("(" + cName + "," + cPoint + ")");
			}

			System.out.println();
		}
		
		scan.close();
	}
}
