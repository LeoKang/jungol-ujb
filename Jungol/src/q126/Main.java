package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0, odd = 0;
		for (;;) {
			int inp = sc.nextInt();
			if (inp == 0) {
				sc.close();
				break;
			} else if (inp % 2 == 0) { // 짝수
				even++;
			} else { // 홀수
				odd++;
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
