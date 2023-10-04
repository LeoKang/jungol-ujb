package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, cnt = 0;
		int inp = 0;
		boolean b = true;

		while (b) {
			inp = sc.nextInt();

			if (0 <= inp && inp <= 100) {
				cnt++;
				sum += inp;
			} else {
				b = false;
			}
		}
		sc.close();

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n", (double) sum / cnt);
	}
}
