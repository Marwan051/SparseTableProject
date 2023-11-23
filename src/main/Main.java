package main;

public class Main {

	public static void main(String[] args) {
		Table table = new Table();
		table.addCell("mohamed","simulation");
		table.addCell("mohamed", "math");
		table.addCell("ahmed", "math");
		table.addCell("aly", "software");
		table.addCell("mohamed", "calculus");
		table.addCell("aly", "simulation");
		table.showCourseStudents("math");
		table.showStudentCourses("mohamed");

	}

}
