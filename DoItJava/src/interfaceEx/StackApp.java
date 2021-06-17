package interfaceEx;
import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = scanner.nextInt();

		StringStack sStack = new StringStack(size);
		
		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String str = scanner.next();
			
			if (str == "�׸�") {
				break;
			}

			if (sStack.push(str)) {
				System.out.println("================");
			}
			else {
				System.out.println("������ �� ���� Ǫ�� �Ұ�");
			}

		}
		
		System.out.println("���ÿ� ����� ��� ���ڿ� ��: " + sStack.pop());
		
		scanner.close();
	}
}
