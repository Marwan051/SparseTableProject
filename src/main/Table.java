package main;



public class Table {
  

  private Linked_list startCourses = new Linked_list();
  private Linked_list startStudents = new Linked_list();
  
  public Table() {
   
  }
  
public void addCell(String student, String course) {
	   Node cell = new Node(student, course);
	   boolean isPresent = false;
	   Node i = startCourses.getHead();
	   if(i!=null) {
	     while(i.getNext() != null) {
           if(i.getCourse() == course) {
             isPresent = true;
             break;
           }
           i=i.getNext();
       }
       if(i.getCourse() == course) {
         isPresent = true;
       }
       
	   }
	   if(isPresent) {
		   while(i.getNextStudent() != null) {
			   i = i.getNextStudent();
		   }
		  i.setNextStudent(cell);
		  
		  
	   }else {
	     startCourses.add(cell);
	   }
	   isPresent = false;
	   i = startStudents.getHead();
	   if(i!=null) {
         while(i.getNext() != null) {
           if(i.getStudent() == student) {
             isPresent = true;
             break;
           }
           i=i.getNext();
       }
       if(i.getStudent() == student) {
         isPresent = true;
       }
       
       }
       if(isPresent) {
           while(i.getNextCourse() != null) {
               i = i.getNextCourse();
           }
          i.setNextCourse(cell);
          
       }else {
         startStudents.add(cell);
       }
	   
}


 public void showStudentCourses(String student) {
   
   boolean isPresent = false;
   Node i = startStudents.getHead();
   if(i!=null) {
     while(i.getNext() != null) {
       if(i.getStudent() == student) {
         isPresent = true;
         break;
       }
       i=i.getNext();
   }
   if(i.getStudent() == student) {
     isPresent = true;
   }
   
   }
   if(isPresent) {
     System.out.println("-------------------------------------------------------------------\n"
         + student.toUpperCase()+" courses are :");
     while (i.getNextCourse() != null) {
       System.out.println(i.getCourse().toUpperCase());
       i = i.getNextCourse();
     }
     System.out.println(i.getCourse().toUpperCase());
     System.out.println("-------------------------------------------------------------------");
   }else {
     System.out.println("Student Not found");
   }
	
 }
 
 public void showCourseStudents(String course) {
   boolean isPresent = false;
   Node i = startCourses.getHead();
   if(i!=null) {
     while(i.getNext() != null) {
       if(i.getCourse() == course) {
         isPresent = true;
         break;
       }
	   i=i.getNext();
   }
   if(i.getCourse() == course) {
     isPresent = true;
   }
   
   }
   if(isPresent) {
     System.out.println("-------------------------------------------------------------------\n"
			+ course.toUpperCase()+" students are :");
     while (i.getNextStudent() != null) {
       System.out.println(i.getStudent().toUpperCase());
       i = i.getNextStudent();
     }
     System.out.println(i.getStudent().toUpperCase());
     System.out.println("-------------------------------------------------------------------");
   }else {
     System.out.println("Course Not found");
   }
 }
  
  
}
