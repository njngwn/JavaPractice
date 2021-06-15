package quiz;

import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;
	
	public Circle (double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String show() {
		return "(" + x + "," + y + ")" + radius;
	}
	
	public double calArea() {
		return radius * radius * Math.PI;
	}
}

public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		double maxArea = c[0].calArea();
		int maxCircle = 0;
		
		for (int i = 0; i < c.length; i++) {
			if (c[i].calArea() > maxArea) {
				maxArea = c[i].calArea();
				maxCircle = i;
			}
		}
		
		System.out.println("가장 면적이 큰 원은 " + c[maxCircle].show());
		scanner.close();
	}
}
