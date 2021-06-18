package object;

public class Circle2 {
	int x;
	int y;
	int radius;
	
	public Circle2 (int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ") 반지름 " + radius; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle2) {
			Circle2 circle = (Circle2)obj;
			if( (this.x == circle.x) && (this.y == circle.y)) 
				return true;
			else
				return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Circle2 a = new Circle2(2,3,5);
		Circle2 b = new Circle2(2,3,30);
		
		System.out.println("원 a: " + a);
		System.out.println("원 b: " + b);
		
		if (a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("서로 다른 원");
		}
	}
}
