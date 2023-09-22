package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

//		System.out.println(inp);
		int i = 1;
		int sum = 0;
		while (i <= inp) {
			sum = sum + i; // sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
