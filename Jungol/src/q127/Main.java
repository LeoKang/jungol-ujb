package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, cnt = 0;
		
		while (true) {
			int inp = sc.nextInt();

			if (0 > inp || inp > 100) {
				break;
			}
			cnt++;
			sum += inp;
		}
		sc.close();
		
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n", (double)sum / cnt);
	}
}
