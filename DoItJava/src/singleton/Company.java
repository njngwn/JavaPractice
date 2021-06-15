package singleton;

public class Company {
	// �����ϰ� ������ �ν��Ͻ� => ���α׷� ��ü���� ����� ������ �ν��Ͻ�
	// private �� �����Ͽ� �ܺο��� �� �ν��Ͻ��� �������� ���ϵ��� �����ؾ� �ν��Ͻ� ���� ���� ����
	private static Company instance = new Company();	
	
	private Company() {	// �ܺο��� �Ժη� ������ ���� ���ϵ��� ����
		
	}
	
	// �ν��Ͻ��� �ܺο��� ������ �� �ֵ��� public get() �޼ҵ� ����
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
