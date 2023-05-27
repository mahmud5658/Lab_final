package report19;

public class Exception {
    public void validate(int age)  {
        if(age<18){
            throw new ArithmeticException("You are not eligible to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String[] args) {
        Exception c = new Exception();
        try{
          c.validate(12);
        } catch (java.lang.Exception e){
            System.out.println(e);
        }
    }
}
