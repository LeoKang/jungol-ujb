package q561;

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
//		System.out.println();

		int max = 0, min = 10000;
		for (int i = 0; i < inp.length; i++) {
			if (inp[i] >= 100) {
				min = (inp[i] < min) ? inp[i] : min;
			} else {
				if (inp[i] > max) {
					max = inp[i];
				}
			}
		}
		System.out.println(max + " " + min);
	}
}
