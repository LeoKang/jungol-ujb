package q9071;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}

		int max = -10000, min = 10000;
		for (int i = 0; i < inp.length; i++) {
			if (inp[i] % 2 == 0) { // 짝수
				if (max < inp[i]) {
					max = inp[i];
				}
			} else { // 홀수
				if (min > inp[i]) {
					min = inp[i];
				}
			}
		}
		System.out.println(min + " " + max);
	}
}
