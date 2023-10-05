package q597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.nextLine();
		String inp2 = sc.nextLine();
		sc.close();

		System.out.println(inp1);
		System.out.println(inp2);
		
		System.out.println(inp1.length() + inp2.length());
	}
}
