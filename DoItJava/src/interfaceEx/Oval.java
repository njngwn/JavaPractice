package interfaceEx;

public class Oval implements Shape {
	int num1, num2;
	
	public Oval(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public void draw() {
		System.out.println(num1 + "x" + num2 + "�� �����ϴ� Ÿ���Դϴ�.");
	}

	@Override
	public double getArea() {
		return (num1/2) * (num2/2) * Shape.PI;
	}
	
	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for (int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		
		for(int i = 0; i < list.length; i++) {
			System.out.println("������ " + list[i].getArea());
		}
	}

}
