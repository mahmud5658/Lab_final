package report15;

public class Box3 extends Box {
    public Box3(int length, int breadth, int height) {
        super(length, breadth, height);
    }

    public void area() {
    }

    public void volume() {
    }

    public static void main(String[] args) {
        Box3 b = new Box3(10, 8, 5);
        b.area();
        b.volume();
    }
}
