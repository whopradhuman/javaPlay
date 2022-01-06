import java.util.Scanner;

//enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
public class errorHandling {
    public static void main(String[] args) {
//        System.out.println(Day.Tuesday);


        // exception handling
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numerator");
        int n = scn.nextInt();
        System.out.println("Enter denominator");
        int m = scn.nextInt();

        try {
            if(m == 0) throw new Exception("can't divide by zero");
            else System.out.println(String.format("%d / %d = ", n, m) + (n / m));
        }catch (Exception err) {
            System.out.println(err.getMessage());
        }
        System.out.println("goodbye!");
    }
}