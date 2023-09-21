package q555;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char[] ar = new char[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 9; i++) {
			ar[i] = sc.next().charAt(0);
		}
		sc.close();

		String out = "";
		for (int i = 0; i <= 9; i++) {
			out += ar[i];
		}
		System.out.println(out);
	}
}
