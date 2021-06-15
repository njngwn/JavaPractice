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
			System.out.print("두 정수와 연산자를 입력하시오>>");
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
					System.out.println("잘못된 연산자를 입력하였습니다.");
			}
			
			if (oper.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		scanner.close();
	}
}
