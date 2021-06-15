package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		// Student studentEdward = new Student("Edward", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();	// 출력값: James님의 남은 돈은 4000입니다.
		bus100.showInfo();			// 출력값: 버스 100번의 승객은 1명이고, 수입은 1000입니다.
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();	// 출력값: Tomas님의 남은 돈은 8500입니다.
		subwayGreen.showInfo();		// 출력값: 2호선의 승객은 1명이고, 수입은 1500입니다.
	}
}
