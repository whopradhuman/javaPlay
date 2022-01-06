import java.lang.reflect.Array;
import java.util.Arrays;

public class Review {
    public static int[] arr() {
        int[] a = {1,2,3,4,5};
        return a;
    }
    public static void main(String[] args) {
        int[] ans = arr();
//        for (int i = 0; i < 5; i++) System.out.println(ans[i]);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);


        long x = 10939984;
        int a = (int)x;
        int b = (int)10.4;

        System.out.println(x);
        System.out.println(a);
        System.out.println(b);

        System.out.println(Math.min(10, 300));
        System.out.println(Math.max(10, 300));
        System.out.println(Math.abs(-50));
        System.out.println(Math.round(100.4));
        System.out.println(Math.ceil(100.4));
        System.out.println(Math.floor(100.4));
        System.out.println(Math.pow(2, 10));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.cbrt(1000));

        String str = "Hello i am a string, who are you";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str + "goodbye");
        String[] strArr = str.split(",");
        for(String stA : strArr) System.out.println(stA);

//        String abs = "A string here";
        String abx = "ABC";
        String abz = new String("ABC");
        System.out.println(str.substring(4));
        System.out.println(str.substring(4, 10));
        System.out.println(str.indexOf("who"));
        System.out.println(str.contains("are"));
        System.out.println("A".compareTo("a"));
        System.out.println("A" == "A");

        System.out.println(abx.equals(abz));
        System.out.println(abx == abz);
        System.out.println(str.replace("string", "replaced string"));
        System.out.println("   abc ".trim());


        int[] arr = new int[10];

        for(int n : arr) System.out.print(n + ", ");
        Arrays.fill(arr, 10);
        System.out.println();
        for(int n : arr) System.out.print(n + ", ");

        int[] arr2 = {30, 60, 10, 20, 80, 50, 40, 70};
    }
}
