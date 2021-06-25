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
		System.out.println("전화번호 입력 프로그램입니다.");

		try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file))) {
			while (true) {
				System.out.print("이름 전화번호 >>");
				String name = sc.next();
				if (name.equals("그만")) {
					break;
				}
				String phone = sc.next();
				osw.write(name + " " + phone + "\n");
			}
			System.out.println(file.getPath() + "에 저장하였습니다.");
		}

		sc.close();
	}
}
