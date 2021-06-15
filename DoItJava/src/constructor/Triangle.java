package constructor;

public class Triangle {
	float base;
	float height;
	
	public Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	
	public float calArea() {
		return (base + height)/2;
	}
}
