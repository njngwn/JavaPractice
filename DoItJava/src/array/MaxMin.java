package array;

public class MaxMin {
	public static void main(String[] args) {
		int[] arr = {30, 10, 40, 20, 50};
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
