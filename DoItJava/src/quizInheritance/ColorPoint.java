package quizInheritance;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint() {
		super();
		color = "BLACK";
	}

	public ColorPoint(int x, int y) {
		super(x, y);
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		// move(x, y);
		setX(x);
		setY(y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return getColor() + "색의 (" + getX() + "," + getY() + ")의 점";
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");

		System.out.println("============================");
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");

		ColorPoint cp2 = new ColorPoint(10, 10);
		cp2.setXY(5, 5);
		cp2.setColor("RED");
		System.out.println(cp2.toString() + "입니다.");
	}
}
