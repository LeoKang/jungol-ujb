package q535;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp = sc.nextDouble();
//		int inp = sc.nextInt();
		sc.close();

		System.out.println(inp);

		// 2. switch ~ case
		switch((int)inp) {
		case 4:
			System.out.println("scholarship");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		case 1:
		case 0:
			System.out.println("retake");
			break;
		}
		
		// 1. if ~ else
//		if (inp >= 4.0) {
//			System.out.println("scholarship");
//		} else if (inp >= 3.0) {
//			System.out.println("next semester");
//		} else if (inp >= 2.0) {
//			System.out.println("seasonal semester");
//		} else {
//			System.out.println("retake");
//		}
	}
}
