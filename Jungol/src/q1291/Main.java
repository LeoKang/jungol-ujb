package q1291;

import java.util.Scanner;

public class Main {
	public static void print(int s, int e) {
		if (s < e) {
			for (int i = 1; i <= 9; i++) {
				for (int j = s; j <= e; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, (j * i));
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				for (int j = s; j >= e; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, (j * i));
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		do {
			int s = sc.nextInt();
			int e = sc.nextInt();
//			System.out.println(s + " " + e);
			if (!(2 <= s && s <= 9) || !(2 <= e && e <= 9)) {
				System.out.println("INPUT ERROR!");
			} else {
				print(s, e);
				b = false;
			}
		} while (b);
		sc.close();
	}
}
