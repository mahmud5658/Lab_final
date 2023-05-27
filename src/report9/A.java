package report9;

public interface A {
    void meth1();

    void meth2();
}

class MyClass implements A {
    @Override
    public void meth1() {
        System.out.println("Implementation of meth1() in MyClass");
    }

    @Override
    public void meth2() {
        System.out.println("Implementation of meth2() in MyClass");
    }
}

class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
    }
}