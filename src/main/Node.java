package main;

public class Node {
	private String student;
	private String course;
	private Node nextStudent = null;
	private Node next = null;
	private Node nextCourse = null;
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
  public Node getNext() {
    return next;
  }
  public void setNext(Node next) {
    this.next = next;
  }
  public String getStudent() {
    return student;
  }
  public String getCourse() {
    return course;
  }
  public void setStudent(String student) {
    this.student = student;
  }
  public void setCourse(String course) {
    this.course = course;
  }
	
	
	
	
}
