package report10;

public interface Animal {
    void eat();
}
interface Vehicle {
    void drive();
}
class Amphibian implements Animal, Vehicle {
    @Override
    public void eat() {
        System.out.println("Amphibian is eating.");
    }
    @Override
    public void drive() {

        System.out.println("Amphibian is driving.");
    }
    void swim() {
        System.out.println("The amphibian is swimming.");
    }
}
class Main {
    public static void main(String[] args) {
        Amphibian frog = new Amphibian();
        frog.eat();
        frog.drive();
        frog.swim();
    }
}
