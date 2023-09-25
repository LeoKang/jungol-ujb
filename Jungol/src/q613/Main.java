package q613;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

		System.out.println(name);
		System.out.println(school);
		System.out.println(grade);
		
		Student stu1 = new Student(name, school, grade);
		stu1.print();
	}
}
