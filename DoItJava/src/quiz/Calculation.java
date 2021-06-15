package quiz;

import java.util.Scanner;

class Add {
	int a, b;
	
	void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a + b;
	}
}

class Sub {
	int a, b;
	
	void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a - b;
	}
}

class Mul {
	int a, b;
	
	void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a * b;
	}
}

class Div {
	int a, b;
	
	void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a / b;
	}
}

public class Calculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			String oper = scanner.next();
			
			switch(oper) {
				case "+":
					Add add = new Add();
					add.SetValue(num1, num2);
					System.out.println(add.calculate());
					break;
				case "-":
					Sub sub = new Sub();
					sub.SetValue(num1, num2);
					System.out.println(sub.calculate());
					break;
				case "*":
					Mul mul = new Mul();
					mul.SetValue(num1, num2);
					System.out.println(mul.calculate());
					break;
				case "/":
					Div div = new Div();
					div.SetValue(num1, num2);
					System.out.println(div.calculate());
					break;
				default:
					System.out.println("�߸��� �����ڸ� �Է��Ͽ����ϴ�.");
			}
			
			if (oper.equals("�׸�")) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		
		scanner.close();
	}
}
