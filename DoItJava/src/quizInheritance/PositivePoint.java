package quizInheritance;

public class PositivePoint extends Point {
	public PositivePoint() {
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(x, y);
		
		if (x < 0) {
			setX(0);
		}
		if (y < 0) {
			setY(0);
		}
	}

	@Override
	protected void move(int x, int y) {
		if (x > 0 && y > 0) {
			super.move(x, y);
		}
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")�� ��";
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");

		p.move(-5, 5);
		System.out.println(p.toString() + "�Դϴ�.");

		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}
}
