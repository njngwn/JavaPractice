package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		// 두 변수가 객체를 공용으로 사용
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1);		// 출력: singleton.Company@4926097b
		System.out.println(myCompany2);		// 출력: singleton.Company@4926097b
		System.out.println(myCompany1 == myCompany2);	// 출력: true
	}
}
