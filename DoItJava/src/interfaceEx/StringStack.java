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
	public int length() {	// ���� ���ÿ� ����� ���� ����
		return count;
	}

	@Override
	public int capacity() {	// ������ ��ü ���� ������ ���� ����
		return wordList.size();
	}

	@Override
	public String pop() {	// ���ÿ� �鿡 ���ڿ� ����
		if (count == limit) {
			count--;
		}
		return wordList.get(count--);
	}

	@Override
	public boolean push(String val) {	// ���ÿ� ����� ���� true
		if (count == limit) {
			return false;
		}

		wordList.add(val);
		count++;
		return true;
	}

}
