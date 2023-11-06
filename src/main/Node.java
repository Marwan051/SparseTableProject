package main;

public class Node {
	int student;
	int course;
	Node nextStudent = null;
	Node nextCourse = null;
	public Node(int student, int course) {
		this.student = student;
		this.course = course;
	}
	public Node getNextStudent() {
		return nextStudent;
	}
	public Node getNextCourse() {
		return nextCourse;
	}
	public void setNextStudent(Node nextStudent) {
		this.nextStudent = nextStudent;
	}
	public void setNextCourse(Node nextCourse) {
	  this.nextCourse = nextCourse;
	}
	
	
	
	
}
