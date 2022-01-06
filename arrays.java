import java.util.*;

public class arrays {
    public static void main(String[] args) {

        // array declaration
        System.out.println("basic outputs");
        int[] a= new int[5];
        for(int x : a) System.out.print(x + ", ");
        System.out.println();
        a[0] = 1;
        for(int x : a) System.out.print(x + ", ");
        System.out.println();

        Arrays.fill(a, 10);
        for(int x : a) System.out.print(x + ", ");
        System.out.println();

        int[] b = {10,20,30,40,50};
        for(int x : b) System.out.print(x + ", ");
        System.out.println();

        System.out.println(a.length);
        System.out.println();
        int[] copyOfB = Arrays.copyOf(b, 3);
        for(int x : copyOfB) System.out.print(x + ", ");
        System.out.println();
        System.out.println(Arrays.binarySearch(b, 40));
        System.out.println();

        System.out.println("multi dim array");
        // multi dimensional

        int[][] a2d = new int[2][3];
        a2d[1][1] = 5;
        for(int i = 0; i < a2d.length; i++) {
            for(int j = 0; j < a2d[0].length; j++) {
                System.out.print(a2d[i][j] + " ");
            }
            System.out.println();
        }

        String[][] a2d2 = {{"11", "12", "13"},{"21", "22", "23"}, {"31", "32", "33"}};
        for(int i = 0; i < a2d2.length; i++) {
            for(int j = 0; j < a2d2[0].length; j++) {
                System.out.print(a2d2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // multi ends here

        int[] arr = {10,60,30,50,40,20};
        System.out.println(Arrays.equals(b, b));

        Arrays.sort(arr);
        for(int x : arr) System.out.print(x + ", ");
    }
}