package interfaceEx;

public class Rect implements Shape {
	int height, width;
	
	public Rect(int h, int w) {
		height = h;
		width = w;
	}
	
	@Override
	public void draw() {
		System.out.println(height + "x" + width + "크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		return height * width;
	}

}
