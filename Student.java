package Classes;

public class Student extends Personnel {
    private String courses;
    public Student() {}
    public Student(String name, int ID, String email) {
        super(name, ID, email);
    }
    public void setCourses(String courses) {
        this.courses = courses;
    }
    public String getCourses() {
        return courses;
    }
    public void showDetails() {
        System.out.println("Name : " + super.getName());
        System.out.println("ID : " + super.getID());
        System.out.println("Email :" + super.getEmail());
        System.out.println("Courses:\n" + courses);
    }
}
