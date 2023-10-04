package q120;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		System.out.println(n1 + " " + n2);

		// 1.
		if (n1 > n2) {
			System.out.println(n1 - n2);
		} else {
			System.out.println(n2 - n1);
		}
		
		// 2.
		System.out.println(Math.abs(n1 - n2));
		
		// 3.
		System.out.println(Math.max(n1, n2) - Math.min(n1, n2));
	}
}



