package test;
import java.util.Scanner;

public class Question1_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double[] arr = new Double[5];
		double min = 999999;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 수 입력 : ");
			arr[i] = scan.nextDouble();
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최소값 : " + min);
		
		scan.close();
	}
}
