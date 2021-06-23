package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ScholarshipTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Double> student = new HashMap<String, Double>();
		
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("�̸��� ����>> ");
			String name = scan.next();
			double score = scan.nextDouble();
			student.put(name, score);
		}
		
		System.out.print("���л� ���� ���� ���� �Է�>>");
		double criteria = scan.nextDouble();
		
		Iterator<String> ir = student.keySet().iterator();
		System.out.print("���л� ���: ");
		
		while(ir.hasNext()) {
			String key = ir.next();
			
			if(student.get(key) > criteria) {
				System.out.print(key + " ");
			}
		}
		
		scan.close();
	}
}
