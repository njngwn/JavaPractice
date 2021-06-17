package interfaceEx;

public class Rect implements Shape {
	int height, width;
	
	public Rect(int h, int w) {
		height = h;
		width = w;
	}
	
	@Override
	public void draw() {
		System.out.println(height + "x" + width + "ũ���� �簢�� �Դϴ�.");
	}

	@Override
	public double getArea() {
		return height * width;
	}

}
