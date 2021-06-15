package hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isNotVal = false;	// 날짜가 유효하지 않으면 true, 유효하면 false

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isNotVal() {
		if (month == 1 || month == 3 || month == 5 || month ==7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				isNotVal = true;
			}
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				isNotVal = true;
			}
		}
		else if (month == 2) {
			if (day < 1 || day > 28) {
				isNotVal = true;
			}
		}
		else {
			isNotVal = true;
		}
		
		return isNotVal;
	}
	
	public String isValid() {
		if (isNotVal()) {
			return "유효하지 않은 날짜입니다.";
		}
		else {
			return "유효한 날짜입니다.";
		}
	}

	// 테스트용
	public void showInfo() {
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
	}
}
