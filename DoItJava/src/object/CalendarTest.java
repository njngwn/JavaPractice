package object;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar nowTime = Calendar.getInstance();
		int hour = nowTime.get(Calendar.HOUR_OF_DAY);
		int min = nowTime.get(Calendar.MINUTE);
		
		System.out.print("���� �ð��� " );
		System.out.print(hour + "�� ");
		System.out.println(min + "���Դϴ�.");
		
		if ((hour >= 4) && (hour <= 12)) {
			System.out.println("Good Morning");
		}
		else if (hour <= 18) {
			System.out.println("Good Afternoon");
		}
		else if (hour <= 22) {
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
	}
}
