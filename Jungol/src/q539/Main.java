package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, cnt = 0;

		for (;;) {
			int inp = sc.nextInt();
			sum += inp;
			cnt++;

			if (inp >= 100) {
				sc.close();
				break;
			}
		}
		System.out.println(sum);
		System.out.printf("%.1f\n", (double)sum / cnt);
	}
}
