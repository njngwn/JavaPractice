package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CustomerHashMap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> customer = new HashMap<String, Integer>();

		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");

		while (true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String name = scan.next();

			if (name.equals("�׸�")) {
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
