package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		// �� ������ ��ü�� �������� ���
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1);		// ���: singleton.Company@4926097b
		System.out.println(myCompany2);		// ���: singleton.Company@4926097b
		System.out.println(myCompany1 == myCompany2);	// ���: true
	}
}
