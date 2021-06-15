package practice210607;

public class Man {
	String name;
	int age;
	boolean isMarried;
	int numOfChildren;
	
	public void showInfo() {
		System.out.println("이 사람의 나이: " + age);
		System.out.println("이 사람의 이름: " + name);
		System.out.println("이 사람의 결혼 여부: " + isMarried);
		System.out.println("이 사람의 자녀 수: " + numOfChildren);
	}
}
