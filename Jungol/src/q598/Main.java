package q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp = '\0';
		boolean b = true;

		do {
			inp = sc.next().charAt(0);

			if (65 <= inp && inp <= 122) { // 알파벳 인 경우
				System.out.println(inp);
			} else if ('0' <= inp && inp <= '9') {
				System.out.printf("%d\n", (int) inp);
			} else {
				b = false;
			}
		} while (b);
		sc.close();

//		char a = 'A';
//		char z = 'Z';
//		char x = 'a';
//		char y = 'z';
//
//		System.out.printf("%d\n", (int) a);
//		System.out.printf("%d\n", (int) z);
//		System.out.printf("%d\n", (int) x);
//		System.out.printf("%d\n", (int) y);
//
//		System.out.printf("%d\n", (int) '0');
//		System.out.printf("%d\n", (int) '9');
	}
}
