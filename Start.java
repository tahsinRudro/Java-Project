import java.io.*;
import java.util.Scanner;

import Classes.*;
import Fileio.FileReadWrite;

public class Start {
    public static void main(String[] args) throws Exception {
        University university = new University();
        Scanner sc = new Scanner(System.in);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        boolean repeat = true;
        while(repeat) {
            System.out.println("\n------------------------------------------");
            System.out.println("UNIVERSITY MANAGEMENT SYSTEM");
            System.out.println("------------------------------------------");
            System.out.println("Choose one from below :");
            System.out.println("1. Faculty Management");
            System.out.println("2. Student Mangement");
            System.out.println("3. Course Registration");
            System.out.println("4. Show Files");
            System.out.println("5. Exit");
            System.out.print("your choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("\n------------------------------------------");
                    System.out.println("Faculty Management");
                    System.out.println("------------------------------------------");
                    System.out.println("\nChoose one from below :");
                    System.out.println("1. Add new Faculty");
                    System.out.println("2. Remove a Faculty");
                    System.out.println("3. Search a Faculty");
                    System.out.println("4. Show all Faculties");
                    System.out.println("5. Go back");
                    System.out.print("your choice : ");
                    int op1 = sc.nextInt();
                    switch(op1) {
                        case 1:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Add new Faculty");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter Faculty Name :");
                            String fname = bfr.readLine();
                            System.out.println("Enter Faculty ID :");
                            int fid = sc.nextInt();
                            System.out.println("Enter Faculty Email :");
                            String fmail = bfr.readLine();
                            Faculty faculty = new Faculty(fname, fid, fmail);
                            if(university.insertFaculty(faculty)) {
                                System.out.println("Faculty Added. ID " + fid);
                            }else {
                                System.out.println("Faculty Not Added");
                            }
                            break;
                        case 2:
                        System.out.println("\n---------------------------------------------");
                            System.out.println("Remove Faculty");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter Faculty ID to remove:");
                            int fid2 = sc.nextInt();
                            if(university.removeFaculty(fid2)) {
                                System.out.println("Faculty Removed");
                            }else {
                                System.out.println("Faculty Not Removed");
                            }
                            break;
                        case 3:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Search Faculty");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter Faculty ID to search:");
                            int fid3 = sc.nextInt();
                            Faculty f = university.searchFaculty(fid3);
                            if(f != null) {
                                System.out.println("Faculty Found");
                                f.showDetails();
                            }else {
                                System.out.println("Faculty Not Found");
                            }
                            break;
                        case 4:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("All Faculty");
                            System.out.println("---------------------------------------------");
                            university.showAllFaculty();
                            break;
                        case 5:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Go Back");
                            System.out.println("---------------------------------------------");
                            break;
                        default:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Invalid Choice");
                            System.out.println("---------------------------------------------");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n------------------------------------------");
                    System.out.println("Student Management");
                    System.out.println("------------------------------------------");
                    System.out.println("\nChoose one from below :");
                    System.out.println("1. Add new Student");
                    System.out.println("2. Remove a Student");
                    System.out.println("3. Search a Student");
                    System.out.println("4. Show all Students");
                    System.out.println("5. Go back");
                    System.out.print("your choice : ");
                    int op2 = sc.nextInt();
                    switch(op2) {
                        case 1:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Add new Student");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter Student Name :");
                            String sname = bfr.readLine();
                            System.out.println("Enter Student ID :");
                            int sid = sc.nextInt();
                            System.out.println("Enter Student Email :");
                            String smail = bfr.readLine();
                            Student student = new Student(sname, sid, smail);
                            if(university.insertStudent(student)) {
                                System.out.println("Student Added. ID " + sid);
                            }else {
                                System.out.println("Student Not Added");
                            }
                            break;
                        case 2:
                        System.out.println("\n---------------------------------------------");
                            System.out.println("Remove Student");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter Student ID to remove:");
                            int sid2 = sc.nextInt();
                            if(university.removeStudent(sid2)) {
                                System.out.println("Student Removed");
                            }else {
                                System.out.println("Student Not Removed");
                            }
                            break;
                        case 3:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Search Student");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter Student ID to search:");
                            int sid3 = sc.nextInt();
                            Student s = university.searchStudent(sid3);
                            if(s != null) {
                                System.out.println("Student Found");
                                s.showDetails();
                            }else {
                                System.out.println("Student Not Found");
                            }
                            break;
                        case 4:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("All Student");
                            System.out.println("---------------------------------------------");
                            university.showAllStudent();
                            break;
                        case 5:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Go Back");
                            System.out.println("---------------------------------------------");
                            break;
                        default:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Invalid Choice");
                            System.out.println("---------------------------------------------");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Course Registration");
                    System.out.println("---------------------------------------------");
                    System.out.println("Enter Student ID : ");
                    int sid3 = sc.nextInt();
                    Student s2 = university.searchStudent(sid3);
                    if(s2 != null) {
                        CourseRegistration registration = new CourseRegistration();
                        System.out.println("--------------------------------------");
                        System.out.println("Available Courses");
                        registration.showCourses();
                        String cc = registration.chooseCourses();
                        s2.setCourses(cc);
                        FileReadWrite fReadWrite = new FileReadWrite();
                        fReadWrite.writeInFile("Student ID : " + sid3 + "\nCourses :\n" + cc);
                        fReadWrite.writeInFile("----------------------------------------------\n");
                        System.out.println("Course Added");
                    }else {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 4:
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Show Files");
                    System.out.println("---------------------------------------------");
                    FileReadWrite fileReadWrite = new FileReadWrite();
                    fileReadWrite.readFromFile();
                    break;
                case 5:
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Exit");
                    System.out.println("---------------------------------------------");
                    repeat = false;
                    break;
                default:
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Invalid Choice");
                    System.out.println("---------------------------------------------");
                    break;
            }
        }
    }
}