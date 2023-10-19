package q9020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = "";

		try {
			System.out.print("5개의 수를 입력하시오. ");
			inp = br.readLine();
			System.out.println(inp);
		} catch (Exception e) {
			e.printStackTrace();
		}

		StringTokenizer st = new StringTokenizer(inp);
		int[] num = new int[5];
		int i = 0;
		while (st.hasMoreTokens()) {
			num[i++] = Integer.parseInt(st.nextToken());
		}

		num[0] += 3;
		num[1] -= 3;
		num[2] *= 3;
		num[3] /= 3;
		num[4] %= 3;

		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j] + " ");
		}
	}
}
