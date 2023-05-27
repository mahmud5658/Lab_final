package report13;

import java.util.Scanner;

public class Fibonacci {

    static int i = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= i) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
