package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3.-------------------------------------
		String inp = sc.next();
		sc.close();

		System.out.println(inp);

		switch (inp) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		}

		// 2.-------------------------------------
//		String inp = sc.next();
//		sc.close();
//		
//		System.out.println(inp);
//		
//		if(inp.equals("A")) {
//			System.out.println("Excellent");
//		}else if(inp.equals("B")) {
//			System.out.println("Good");
//		}

		// 1.-------------------------------------
//		char inp = sc.next().charAt(0);
//		sc.close();
//
//		System.out.println(inp);
//
//		if (inp == 'A') {
//			System.out.println("Excellent");
//		} else if (inp == 'B') {
//			System.out.println("Good");
//		} else if (inp == 'C') {
//			System.out.println("Usually");
//		} else if (inp == 'D') {
//			System.out.println("Effort");
//		} else {
//			System.out.println("Failure");
//		}

	}
}
