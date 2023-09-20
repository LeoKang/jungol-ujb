package q9006;

public class Main {
	public static void main(String[] args) {
		//case 1
		System.out.println("수를 출력할 때는 따옴표를 생략합니다.");
		System.out.println("123");
		System.out.println("6.500000");
		System.out.println("-------------");
		//case 2
		int n1 = 123;
		double d1 = 6.500000;
		System.out.println(n1);
//		System.out.println(d1);
		System.out.printf("%.4f\n", d1);
		/*
		 * %d : 정수
		 * %f : 실수
		 * %s : 문자열
		 * %c : 문자
		 */
	}
}
