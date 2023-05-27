package report11;
public interface Test {
    int square(int number);
}
class Arithmetic implements Test {

    @Override
    public int square(int number) {
        return number * number;
    }
}
class ToTestInt {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        int result = a.square(5);
        System.out.println(result);
    }
}