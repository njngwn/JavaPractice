package sorting;

import java.util.Scanner;

public class HeapSort {
	static void swap(int[] a, int idx1, int idx2) {
		
	}
	
	static void heapSort(int[] arr, int n) {
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ����");
		System.out.print("��� ��: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		heapSort(x, nx);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
		
		stdIn.close();
	}
}
