package q633;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Korea ");
			System.out.println("2. USA ");
			System.out.println("3. Japan ");
			System.out.println("4. China ");
			System.out.print("number?");
			String A = sc.next();
			if (A.equals("1")) {
				System.out.println("\n" + "Seoul " + "\n");
			} else if (A.equals("2")) {
				System.out.println("\n" + "Washington " + "\n");
			} else if (A.equals("3")) {
				System.out.println("\n" + "Tokyo " + "\n");
			} else if (A.equals("4")) {
				System.out.println("\n" + "Beijing " + "\n");
			} else {
				System.out.println("\n" + "none");
				break;
			}
		}
		sc.close();
	}
}