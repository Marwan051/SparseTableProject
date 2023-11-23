package main;

public class Node {
	private String student;
	private String course;
	Node nextStudent = null;
	Node nextCourse = null;
	public Node(String student, String course) {
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
  public String getStudent() {
    return student;
  }
  public String getCourse() {
    return course;
  }
	
	
	
	
}
