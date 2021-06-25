package quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Telephone {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\temp\\phone.txt");
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");

		try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file))) {
			while (true) {
				System.out.print("�̸� ��ȭ��ȣ >>");
				String name = sc.next();
				if (name.equals("�׸�")) {
					break;
				}
				String phone = sc.next();
				osw.write(name + " " + phone + "\n");
			}
			System.out.println(file.getPath() + "�� �����Ͽ����ϴ�.");
		}

		sc.close();
	}
}
