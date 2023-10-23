package q9022;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
//		System.out.println(a + " " + b);
//		int c = ++a + b--;
//		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		++a;
		b--;
		int c = a + b;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}
}
