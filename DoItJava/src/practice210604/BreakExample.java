package practice210604;

public class BreakExample {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		for (num = 0; ; num++) {
			sum += num;
		    if (sum >= 100)
		    	break;	// sum�� 100���� ũ�ų� ���� �� �ݺ��� �ߴ�
		}

		System.out.println("num: " + num);
		System.out.println("sum: " + sum);
	}
}
