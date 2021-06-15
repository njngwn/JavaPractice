package practice210604;

public class Quiz5 {
	public static void main(String[] args) {
		int num = 4;
		
		for (int i = 1; i <= num; i++) {
			// 공백 넣기
			for (int j = 1; j <= (num-i); j++) {
				System.out.print(" ");
			}
			
			// * 넣기
			for (int k = 1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
				
			System.out.println();
		}
		
		for (int i = (num-1); i >= 1; i--) {
			// 공백 넣기
			for (int j = 1; j <= (num-i); j++) {
				System.out.print(" ");
			}
			
			// * 넣기
			for (int k = 1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
