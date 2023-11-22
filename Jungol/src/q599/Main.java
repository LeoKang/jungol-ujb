package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		System.out.println(inp);

		// case 2.
		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);
			if(Character.isAlphabetic(c)) {
				System.out.print(Character.toUpperCase(c));
			}
		}
		System.out.println();

		// case 1.
		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);
			if ('A' <= c && c <= 'Z') {
				System.out.print(c);
			} else if ('a' <= c && c <= 'z') {
				System.out.print((char) (c - 32));
			}
		}
	}
}
