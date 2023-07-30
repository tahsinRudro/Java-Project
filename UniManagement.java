package Interfaces;

import Classes.Faculty;
import Classes.Student;

public interface UniManagement {
    boolean insertStudent(Student student);
    boolean removeStudent(int ID);
    Student searchStudent(int ID);
    void showAllStudent();
    boolean insertFaculty(Faculty faculty);
    boolean removeFaculty(int ID);
    Faculty searchFaculty(int ID);
    void showAllFaculty();
}
