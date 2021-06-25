package quiz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Telephone3 {
	public static void main(String[] args) {
		File file = new File("c:\\windows\\system.ini");
		try (FileInputStream fi = new FileInputStream(file)) {
			int n;
			while ((n = fi.read()) != -1) {
				System.out.print(Character.toUpperCase((char) n));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
