package interfaceEx;

public class StringStack implements Stack{
	int size;
	
	public StringStack() {}
	
	public StringStack(int size) {
		this.size = size;
	}

	@Override
	public int length() {	// ���� ���ÿ� ����� ���� ����
		size--;
		return size;
	}

	@Override
	public int capacity() {	// ������ ��ü ���� ������ ���� ����
		return size - length();
	}

	@Override
	public String pop() {	// ���ÿ� �鿡 ���ڿ� ����
		return null;
	}

	@Override
	public boolean push(String val) {	// ���ÿ� ����� ���� true
		if (length() <= capacity()) {
			System.out.println("bbbbbbbbb");
			
			return true;
		}
		else
			return false;
	}

}
