package report3;

public class Student {
    private String name;
    private int id;

    public void setData(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData("Abdullah Al Mahmud", 5658);
        s1.display();
    }
}
