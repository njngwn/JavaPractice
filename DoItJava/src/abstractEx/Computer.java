package abstractEx;

public abstract class Computer {
	public abstract void display(); // �߻� �޼��带 ����Ϸ��� Ŭ������ �߻�Ŭ����������

	public abstract void typing();

	public void turnon() {
		System.out.println("������ �մϴ�.");
	}

	public void turnoff() {
		System.out.println("������ ���ϴ�.");
	}
}
