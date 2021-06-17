package abstractEx;

public abstract class Computer {
	public abstract void display(); // 추상 메서드를 사용하려면 클래스도 추상클래스여야함

	public abstract void typing();

	public void turnon() {
		System.out.println("전원을 켭니다.");
	}

	public void turnoff() {
		System.out.println("전원을 끕니다.");
	}
}
