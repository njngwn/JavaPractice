package interfaceEx;

// �� ����� ���� ���� ��ȭ���� ��⿭���� ������ ���� �ɷ��� ���� ���� �켱 ���
public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� Skill ���� ���� �������� �켱������ ����մϴ�.");
	}
	
}
