
package interfaceEx;
import java.util.Scanner;
import java.util.ArrayList;

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = scanner.nextInt();

		ArrayList <StringStack> arrStack = new ArrayList <StringStack>();
		
		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String str = scanner.next();
			
			if (str.equals("�׸�")) {
				System.out.println("aaaaaaaaaaa");
				break;
			}

			arrStack.add(new StringStack());
			
		}
		
		System.out.println("���ÿ� ����� ��� ���ڿ� ��: " );
		
		scanner.close();
	}
}
