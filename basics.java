import javax.swing.*;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        // print statement
        System.out.println("hi there, these are the basics\njust to get you started");

//        // variables
//        int a = 10;
//        double b = 10.0;
//        float c = 10.0F;
//        double maxDouble = Double.MAX_VALUE;
//        float maxFloat = Float.MAX_VALUE;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(maxDouble);
//        System.out.println(maxFloat);
//
//        // typecast
//
//        String str = "10";
//        System.out.println((int)b);
//        System.out.println(Double.toString(maxDouble) + "hello");
//        System.out.println(Integer.parseInt(str) - 10);
//
//        // inputs
//        Scanner scn = new Scanner(System.in);
//        System.out.println("enter your name:");
//        String name = scn.nextLine();
//        System.out.println("hello, " + name);

        String jopName =
                JOptionPane.showInputDialog("Enter Name");
        System.out.println("Hello "+jopName);
    }
}
