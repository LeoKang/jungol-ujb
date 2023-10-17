package q572;

import java.util.Scanner;

public class Main {
	public static double circle(int r) {
		double area = r * r * 3.14;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();

		System.out.println(r);

		double d = circle(r);
		System.out.printf("%.2f\n", d);
	}
}
