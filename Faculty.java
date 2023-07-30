package Classes;

public class Faculty extends Personnel {
    public Faculty() {}
    public Faculty(String name, int ID, String email) {
        super(name, ID, email);
    }
    public void showDetails() {
        System.out.println("Name : " + super.getName());
        System.out.println("ID : " + super.getID());
        System.out.println("Email :" + super.getEmail());
    }
}
