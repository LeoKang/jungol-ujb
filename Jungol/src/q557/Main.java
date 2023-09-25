package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] inp = new char[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.next().charAt(0);
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}
//		System.out.println();
		
		System.out.print(inp[0] + " " + inp[3] + " " + inp[6]);
	}
}
