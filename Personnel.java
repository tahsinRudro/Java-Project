package Classes;

public abstract class Personnel {
    // attributes
    private String name;
    private int ID;
    private String email;
    // contructors
    public Personnel() {}
    public Personnel(String name, int ID, String email) {
        this.name = name;
        this.ID = ID;
        this.email = email;
    }
    // set & get methods
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getEmail() {
        return email;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }

    public abstract void showDetails();
}
