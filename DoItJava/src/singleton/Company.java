package singleton;

public class Company {
	// 유일하게 생성한 인스턴스 => 프로그램 전체에서 사용할 유일한 인스턴스
	// private 로 선언하여 외부에서 이 인스턴스에 접근하지 못하도록 제한해야 인스턴스 오류 방지 가능
	private static Company instance = new Company();	
	
	private Company() {	// 외부에서 함부로 생성을 하지 못하도록 차단
		
	}
	
	// 인스턴스를 외부에서 참조할 수 있도록 public get() 메소드 구현
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
