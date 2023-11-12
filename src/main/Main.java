package main;

public class Main {

	public static void main(String[] args) {
		Table table = new Table();
		table.addCell("ahmed","simulation");
	    table.addCell("aly","simulation");
		table.addCell("mohamed","simulation");
		table.addCell("aly","software");
		table.addCell("mohamed","math");
		table.showCourseStudents("simulation");
		table.showStudentCourses("aly");

		


	}

}
