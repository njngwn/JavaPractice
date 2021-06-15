package thisex;

class Person2 {
	String name;
	int age;
	
	public Person2() {
		this("이름 없음", 1);		// this를 사용해서 Person(String, int) 생성자 호출
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
