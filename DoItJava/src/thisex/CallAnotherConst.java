package thisex;

class Person2 {
	String name;
	int age;
	
	public Person2() {
		this("�̸� ����", 1);		// this�� ����ؼ� Person(String, int) ������ ȣ��
	}
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person2 noName = new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
