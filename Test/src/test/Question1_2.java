package test;

import java.util.Scanner;

public class Question1_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ������ ������ �Է��ϼ���>> ");
		int num1 = scan.nextInt();
		int num2 = 1;
		
		while (num2 < 10) {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			num2++;
		}
		
		scan.close();
	}
}
