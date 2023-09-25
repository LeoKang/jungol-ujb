package q614;

public class Student {
	private String school;
	private int grade;
	
	public void setVar(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in " + school + " School");
	}
}
