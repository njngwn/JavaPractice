package arrayQuiz;

public class quiz3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int num = 2;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num+=2;
			System.out.println(arr[i]);
		}
	}
}
