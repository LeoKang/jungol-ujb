package q1856;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		System.out.println(n + " " + m);

		int[][] ar = new int[n][m];

		int num = 1;
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) { // 홀수 번 째 줄
				for (int j = 0; j < ar[i].length; j++) {
					ar[i][j] = num++;
				}
			} else { // 짝수 번 째 줄
				for (int j = m - 1; j >= 0; j--) {
					ar[i][j] = num++;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
