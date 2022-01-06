import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        // conditionals
        // logical operators : && || !
        // relational operators : <, >, <=, >=, ==, !=
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your age:");
//        int age = scn.nextInt();
//        if(age < 16) {
//            System.out.println("sorry you're not eligible for a license");
//        } else if (age >= 16 && age < 18) {
//            System.out.println("eligible for a scooter license");
//        } else {
//            System.out.println("eligible for full license");
//        }
//
//        boolean canVote = age < 18 ? false : true;
//        if(canVote) {
//            System.out.println("is a voter");
//        } else {
//            System.out.println("is not a voter");
//        }


        boolean canDrive = false;

        String drunk;
        do {
            System.out.println("is person drunk?");
            drunk = scn.nextLine();
        } while (drunk.matches(".*\\d.*") || !drunk.matches("[yesno]"));

        switch (drunk) {
            case "no" : canDrive = true;
        }

        if(canDrive) System.out.println("go ahead");
        if(!canDrive)System.out.println("get sober first");
    }
}