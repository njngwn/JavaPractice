package interfaceEx;

public class StringStack implements Stack{
	int size;
	
	public StringStack() {}
	
	public StringStack(int size) {
		
	}

	@Override
	public int length() {	// 현재 스택에 저장된 개수 리턴
		size--;
		return size;
	}

	@Override
	public int capacity() {	// 스택의 전체 저장 가능한 개수 리턴
		return size - length();
	}

	@Override
	public String pop() {	// 스택에 톱에 문자열 저장
		return null;
	}

	@Override
	public boolean push(String val) {	// 스택에 제대로 들어가면 true
		if (length() <= capacity())
			return true;
		else
			return false;
	}

}
