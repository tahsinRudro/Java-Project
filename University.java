package Classes;

import Interfaces.UniManagement;

public class University implements UniManagement {
    private Student[] students;
    private Faculty[] faculties;

    public University() {
        students = new Student[100];
        faculties = new Faculty[100];
    }
    public boolean insertStudent(Student student) {
        boolean flag = false;
        for(int i=0; i<students.length; i++) {
            if(students[i] == null) {
                students[i] = student;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean removeStudent(int ID) {
        boolean flag = false;
        for(int i=0; i<students.length; i++) {
            if(students[i].getID() == ID) {
                students[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public Student searchStudent(int ID) {
        Student flag = null;
        for(int i=0; i<students.length; i++) {
            if(students[i].getID() == ID) {
                flag = students[i];
                break;
            }
        }
        return flag;
    }
    public void showAllStudent() {
        for(int i=0; i<students.length; i++) {
            if(students[i] != null) {
                students[i].showDetails();
            }
        }
    }
    public boolean insertFaculty(Faculty faculty) {
        boolean flag = false;
        for(int i=0; i<faculties.length; i++) {
            if(faculties[i] == null) {
                faculties[i] = faculty;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean removeFaculty(int ID) {
        boolean flag = false;
        for(int i=0; i<faculties.length; i++) {
            if(faculties[i].getID() == ID) {
                faculties[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public Faculty searchFaculty(int ID) {
        Faculty flag = null;
        for(int i=0; i<faculties.length; i++) {
            if(faculties[i].getID() == ID) {
                flag = faculties[i];
                break;
            }
        }
        return flag;
    }
    public void showAllFaculty() {
        for(int i=0; i<faculties.length; i++) {
            if(faculties[i] != null) {
                faculties[i].showDetails();
            }
        }
    }
}
