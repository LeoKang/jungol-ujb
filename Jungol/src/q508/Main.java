package q508;

public class Main {
	public static void main(String[] args) {
		String[] ar = { "item", "count", "price", 
				"pen", "20", "100",
				"note", "5", "95",
				"eraser", "110", "97" };

		for (int i = 0; i < ar.length; i++) {
			if(i % 3 == 0 && i != 0) {
				System.out.println();
//				System.out.print("\n");
			}
			System.out.printf("%10s", ar[i]);
		}

//		String a = "item";
//		String b = "count";
//		String c = "price";
////		System.out.println("      item     count     price");
//		System.out.printf("%10s%10s%10s\n", a, b, c);
//
//		String d = "pen";
//		String e = "20";
//		int ie = 20;
//		int f = 100;
////		System.out.println("       pen        20       100");
//		System.out.printf("%10s%10d%10d\n", d, ie, f);
////		System.out.printf("%10s%10d%10d", d, e, f);
//		System.out.println("      note         5        95");
//		System.out.println("    eraser       110        97");
	}
}
