package q9008;

public class Main {
	public static void main(String[] args) {
		System.out.println(" subject score");
		System.out.println("==============");
		String[] subject = { "korean", "english", "computer" };
		int[] score = { 90, 100, 80 };

		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%8s%6d\n", subject[i], score[i]);
		}
		System.out.println();
	}
}
