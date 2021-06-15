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
		
		// �������� ��� => 'Ŭ�����̸�@�޸��ּ�' ���ڿ���
		System.out.println(bDay); // ��°�: thisex.Birthday@4232c52b
		bDay.printThis();		// ��°�: thisex.Birthday@4232c52b
	}
}
