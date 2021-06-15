package thisex;

class Birthday {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2000);	
		
		// 참조변수 출력 => '클래스이름@메모리주소' 문자열값
		System.out.println(bDay); // 출력값: thisex.Birthday@4232c52b
		bDay.printThis();		// 출력값: thisex.Birthday@4232c52b
	}
}
