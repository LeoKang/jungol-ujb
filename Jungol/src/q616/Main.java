package q616;

import java.util.Scanner;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();

//		System.out.print(x1 + " " + y1 + " ");
//		System.out.print(x2 + " " + y2 + " ");
//		System.out.println(x3 + " " + y3 + " ");

		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		Point p3 = new Point(x3, y3);

		double dx = (p1.getX() + p2.getX() + p3.getX()) / (double) 3;
		double dy = (p1.getY() + p2.getY() + p3.getY()) / (double) 3;
		System.out.printf("(%.1f, %.1f)\n", dx, dy);
	}
}
