package q595;

public class Main {
	public static void main(String[] args) {
		String str = "Hong Gil Dong";
//		System.out.println(str);

//		System.out.print(str.charAt(3));
//		System.out.print(str.charAt(4));
//		System.out.print(str.charAt(5));
//		System.out.print(str.charAt(6));

		// case 1
		for (int i = 3; i <= 6; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		// case 2
		String ret = str.substring(3, 7);
		System.out.println(ret);
	}
}
