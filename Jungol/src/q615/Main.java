package q615;

import java.util.Scanner;

class Student {
	private String name;
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];

		Student stu1, stu2;

		for (int i = 0; i < 2; i++) {
			name[i] = sc.next();
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < 2; i++) {
//			System.out.println(name[i] + " " + kor[i] + " " + eng[i]);
//		}

		stu1 = new Student(name[0], kor[0], eng[0]);
		stu2 = new Student(name[1], kor[1], eng[1]);

		stu1.print();
		stu2.print();

		int avgKor = (stu1.getKor() + stu2.getKor()) / 2;
		int avgEng = (stu1.getEng() + stu2.getEng()) / 2;
		System.out.println("avg " + avgKor + " " + avgEng);
	}
}
