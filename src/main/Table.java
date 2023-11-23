package main;

import java.util.ArrayList;

public class Table {

    private ArrayList<Node> startCourses = new ArrayList<Node>();
    private ArrayList<Node> startStudents = new ArrayList<Node>();

    public Table() {

    }

    public void addCell(String student, String course) {
        Node cell = new Node(student.toLowerCase(), course.toLowerCase());
        //adding to the student list
        Node studentNode = null;
        for (Node node : startStudents) {
            if (node.getStudent().equals(student)) {
                studentNode = node;
                break;
            }
        }

        if (studentNode != null) {
           
            while (studentNode.getNextCourse() != null) {
               studentNode = studentNode.getNextCourse();
            }

           studentNode.setNextCourse(cell);
        } else {
            startStudents.add(cell);
        }

        //adding to the course list
        Node courseNode = null;
        for (Node node : startCourses) {
            if (node.getCourse().equals(course)) {
                courseNode = node;
                break;
            }
        }
        if (courseNode != null) {
            
            while (courseNode.getNextStudent() != null) {
				courseNode = courseNode.getNextStudent();
            }
            courseNode.setNextStudent(cell);
        } else {
            startCourses.add(cell);
        }
    }
    
    public void showStudentCourses(String student) {

        Node findStudent = null;
        for (Node node : startStudents) {
            if (node.getStudent().equals(student)) {
				findStudent = node;
                break;
            }
        }
        if (findStudent != null) {
            System.out.println(student.toUpperCase() + "'s courses are :");
            while (findStudent != null) {
                System.out.println(findStudent.getCourse());
                findStudent = findStudent.getNextCourse();
            }
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("Student Not found");
        }
    }

    public void showCourseStudents(String course) {
        Node findCourse = null;
        for (Node node : startCourses) {
            if (node.getCourse().equals(course)) {
				findCourse = node;
                break;
            }
        }
        if (findCourse != null) {
            System.out.println(course.toUpperCase() + "'s students are :");
            while (findCourse != null) {
                System.out.println(findCourse.getStudent());
				findCourse = findCourse.getNextStudent();
            }
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("Course Not found");
        }
    }
}