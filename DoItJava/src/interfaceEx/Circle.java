package interfaceEx;

public class Circle implements Shape {
	int radius; 
	
	public Circle(int r) {
		radius = r;
	}
	
	@Override
	public void draw() {
		System.out.println(" 반지름이 " + radius + "인 원입니다.");
	}

	@Override
	public double getArea() {
		return radius * radius * Shape.PI;
	}
	
	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
