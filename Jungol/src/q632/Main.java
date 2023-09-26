package q632;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
		
		// if~else
		if(ar[0] > ar[1]) {
			if(ar[1] > ar[2]) {
				System.out.println(ar[2]);
			}else {
				System.out.println(ar[1]);
			}
		}else {
			if(ar[0] > ar[2]) {
				System.out.println(ar[2]);
			}else {
				System.out.println(ar[0]);
			}
		}
	}
}
