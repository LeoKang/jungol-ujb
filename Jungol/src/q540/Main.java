package q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int inp = sc.nextInt();

			if (inp == -1) {
				break;
			} else if (inp % 3 == 0) {
				System.out.println(inp / 3);
			}
		}
		sc.close();
	}
}
