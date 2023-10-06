package baseball;

import java.util.Scanner;

public class Main {
	static int[] random, inp;

	public static void generate() {
		random = new int[3];
		inp = new int[3];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 9) + 1;
		}

//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}

		/*
		 * 0.0 <= x < 1.0 0.0 <= 9x < 9.0 1.0 <= 9x + 1 < 10.0 (int) 1 <= (int)(9x + 1)
		 * < (int)10
		 */
	}

	public static void main(String[] args) {
		boolean b = false;
		do {
			b = false;
			generate();
			if (random[0] == random[1] || random[1] == random[2] || random[2] == random[0]) {
				b = true;
			}
		} while (b);

		System.out.println(random[0] + " " + random[1] + " " + random[2]);

		Scanner sc = new Scanner(System.in);
		int strike = 0, ball = 0;
		do {
			strike = 0;
			ball = 0;
			System.out.print("Input..... ");
			for (int i = 0; i < inp.length; i++) {
				inp[i] = sc.nextInt();
			}

			// strike
			for (int i = 0; i < inp.length; i++) {
				if (inp[i] == random[i]) {
					strike++;
				}
			}

			// ball
			for (int i = 0; i < inp.length; i++) {
				for (int j = 0; j < random.length; j++) {
					if (i != j && inp[i] == random[j]) {
						ball++;
					}
				}
			}
			
			System.out.println("Strike : " + strike + ", Ball : " + ball);
		} while (strike < 3);
		sc.close();
	}
}
