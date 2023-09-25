package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		System.out.println(school + " " + grade);
		
		Student s1 = new Student();
		Student s2 = new Student();

		s1.setVar("Jejuelementary", 6);
		s2.setVar(school, grade);
		
		s1.print();
		s2.print();
	}
}
