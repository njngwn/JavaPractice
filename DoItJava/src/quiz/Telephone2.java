package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Telephone2 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\phone.txt");
		System.out.println(file.getPath() + "를 출력합니다.");
		try (InputStreamReader is = new InputStreamReader(new FileInputStream(file))) {
			int n;
			while ((n = is.read()) != -1) {

				System.out.print((char) n);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
