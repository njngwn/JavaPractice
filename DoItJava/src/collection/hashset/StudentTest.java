package collection.hashset;

import java.util.HashSet;

public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "ȫ�浿"));
		set.add(new Student("200", "������"));
		set.add(new Student("300", "�̼���"));
		set.add(new Student("400", "�����"));
		set.add(new Student("500", "���߱�"));
		System.out.println(set);
	}
}
