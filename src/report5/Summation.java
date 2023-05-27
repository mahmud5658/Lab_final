package report5;

public class Summation {
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static void main(String[] args) {
        System.out.println(add(12, 13));
        System.out.println(add(5, 13, 8));
    }
}
