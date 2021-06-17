package abstractQuiz;

public class Sonata extends Car{
	private String name = "Sonata";
	
	public Sonata() {
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void start() {
		System.out.println(name + " �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println(name + " �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(name + " ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println(name + " �õ��� ���ϴ�.");
	}

}
