package main;


import java.util.ArrayList;

public class Table {
  
  private ArrayList<Node> startCourses = new ArrayList<Node>();
  private ArrayList<Node> startStudents = new ArrayList<Node>();

  
  public Table() {
   
  }
  
public void addCell(int student, int course) {
	   Node cell = new Node(student, course);
	   int index = -1;
	   for(int i =0;i<startCourses.size();i++) {
	     if(startCourses.get(i).course == course) {
	       index = i;
	       break;
	     }
	   }
	   if(index != -1) {
		   Node i = startCourses.get(index);
		   while(i.nextCourse != null) {
			   i = i.nextCourse;
		   }
		  i.setNextStudent(cell);
	   }else {
	     startCourses.add(cell);
	   }
	   index = -1;
	   for(int i =0;i<startStudents.size();i++) {
	     if(startStudents.get(i).student == student) {
	       index = i;
	       break;
	     }
	   }
	   if(index != -1) {
		   Node i = startStudents.get(index);
		   while(i.nextStudent != null) {
			   i = i.nextStudent;
		   }
		  i.setNextCourse(cell);

	   }else {
	     startStudents.add(cell);

	   }
	   
}


 public void showStudentCourses(int student) {
   
   int index = -1;
   for(int i =0;i<startStudents.size();i++) {
     if(startStudents.get(i).student == student) {
	   index = i;
	   break;
	 }
   }
   if(index != -1) {
     Node i = startStudents.get(index);
     while (i.nextCourse != null) {
       System.out.println(i.course);
       i = i.nextCourse;
     }
     System.out.println(i.course);
   }else {
     System.out.println("Student Not found");
   }
	
 }
 
 public void showCourseStudents(int course) {
   int index = -1;
   for(int i =0;i<startCourses.size();i++) {
     if(startCourses.get(i).course == course) {
       index = i;
       break;
     }
   }
   if(index != -1) {
     Node i = startCourses.get(index);
     while (i.nextStudent != null) {
       System.out.println(i.student);
       i = i.nextStudent;
     }
     System.out.println(i.student);
   }else {
     System.out.println("Course Not found");
   }
 }
  
  
}
