package interfaceEx;
import java.util.ArrayList;

public class StringStack implements Stack{
	ArrayList <String> wordList;
	int limit;
	int count;
	
	public StringStack() {}
	
	public StringStack(int size) {
		wordList = new ArrayList<String>();
		count = 0;
		limit = size;
	}

	@Override
	public int length() {	// 현재 스택에 저장된 개수 리턴
		return count;
	}

	@Override
	public int capacity() {	// 스택의 전체 저장 가능한 개수 리턴
		return wordList.size();
	}

	@Override
	public String pop() {	// 스택에 톱에 문자열 저장
		if (count == limit) {
			count--;
		}
		return wordList.get(count--);
	}

	@Override
	public boolean push(String val) {	// 스택에 제대로 들어가면 true
		if (count == limit) {
			return false;
		}

		wordList.add(val);
		count++;
		return true;
	}

}
