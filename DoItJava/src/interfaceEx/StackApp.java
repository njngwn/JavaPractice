package interfaceEx;
import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scanner.nextInt();

		StringStack sStack = new StringStack(size);
		
		while (true) {
			System.out.print("문자열 입력 >> ");
			String str = scanner.next();
			
			if (str == "그만") {
				break;
			}

			if (sStack.push(str)) {
				System.out.println("================");
			}
			else {
				System.out.println("스택이 꽉 차서 푸시 불가");
			}

		}
		
		System.out.println("스택에 저장된 모든 문자열 팝: " + sStack.pop());
		
		scanner.close();
	}
}
