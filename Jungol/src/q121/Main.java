package q121;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println(n);

		if (n > 0) {
			// 양수
			System.out.println("plus");
		} else if (n < 0) {
			// 음수
			System.out.println("minus");
		} else {
			// 0
			System.out.println("0");
		}
	}
}
