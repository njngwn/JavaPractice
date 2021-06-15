package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		// Student studentEdward = new Student("Edward", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();	// ��°�: James���� ���� ���� 4000�Դϴ�.
		bus100.showInfo();			// ��°�: ���� 100���� �°��� 1���̰�, ������ 1000�Դϴ�.
		
		Subway subwayGreen = new Subway("2ȣ��");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();	// ��°�: Tomas���� ���� ���� 8500�Դϴ�.
		subwayGreen.showInfo();		// ��°�: 2ȣ���� �°��� 1���̰�, ������ 1500�Դϴ�.
	}
}
