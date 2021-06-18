
package interfaceEx;
import java.util.Scanner;
import java.util.ArrayList;

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scanner.nextInt();

		ArrayList <StringStack> arrStack = new ArrayList <StringStack>();
		
		while (true) {
			System.out.print("문자열 입력 >> ");
			String str = scanner.next();
			
			if (str.equals("그만")) {
				System.out.println("aaaaaaaaaaa");
				break;
			}

			arrStack.add(new StringStack());
			
		}
		
		System.out.println("스택에 저장된 모든 문자열 팝: " );
		
		scanner.close();
	}
}
