package Classes;

import java.util.Scanner;

public class CourseRegistration {
    String[] courses = new String[] {"DIFFERENTIAL CALCULUS & CO-ORDINATE GEOMETRY", "PHYSICS 1", "PHYSICS 1 LAB", "ENGLISH READING SKILLS & PUBLIC SPEAKING", "INTRODUCTION TO PROGRAMMING", "INTRODUCTION TO PROGRAMMING LAB", "INTRODUCTION TO COMPUTER STUDIES" };
    public void showCourses() {
        for(int i=0; i<courses.length; i++) {
            System.out.println((i+1) +". " + courses[0]);
        }
    }
    public String chooseCourses() {
        System.out.println("\nChoose 5 courses :");
        String cc = "";
        for(int i=1; i<=5; i++) {
            System.out.println("Course " + i + " : ");
            Scanner sc = new Scanner(System.in);
            int cid = sc.nextInt();
            cc += (courses[cid-1] + "\n");
        }
        return cc;
    }
}
