import java.util.Arrays;
import java.util.List;

public class functions {
    public static int getSum(int x, int y) {
        return x + y;
    }

    public static void changeMe(int cNum) {
        cNum = 10;
    }

    public static int getSum2(int ... nums) {
        int sum = 0;
        for(int x: nums) {
            sum += x;
        }
        return sum;
    }

    static int[] getNext2(int x) {
        int[] vals = new int[2];
        vals[0] = x + 1;
        vals[1] = x + 2;
        return vals;
    }

    static List<Object> getRandList(){
        String name = "Pradhuman";
        int age = 20;
        boolean dope = true;
        return Arrays.asList(name, age, dope ? "cool" : "dumb");
    }

    static int fact(int num) {
        if(num == 0) return 1;

        return num * fact(num - 1);
    }

    static int getSum3(int[] nums) {
        int sum = 0;
        for(int x: nums) sum += x;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getSum(10,20));
        int cNum = 100;
        changeMe(cNum);
        System.out.println(cNum);
        System.out.println(getSum2(10,20,30,40));
        for(int x : getNext2(10)) System.out.print(x + ", ");
        System.out.println();
        System.out.println(fact(5));
        int[] arr = {10,20,30,40,50};
        System.out.println(getSum3(arr));
        System.out.println(getRandList());
    }
}