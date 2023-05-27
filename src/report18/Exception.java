package report18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("report18/abd.txt");
        Scanner sc = new Scanner(f);
        String input="";
        input= sc.nextLine();
        System.out.println(input);
    }
}
