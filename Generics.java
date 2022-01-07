import java.util.ArrayList;
import java.util.Arrays;

public class Generics {
    public static void main(String[] args) {
        String[] gA1 = {"one","two"};
        printStuff(gA1);
        Integer[] gA2 = {1,2,3,4};
        printStuff(gA2);

        // Using a wildcard to print any type of
        // collection
        ArrayList<Integer> aL1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        printAL(aL1);

        // Using a generic custom class
        MyGeneric<Integer> myGI = new MyGeneric<>();
        myGI.setVal(10);
        System.out.println(myGI.getVal());
        MyGeneric<String> myGS = new MyGeneric<>();
        myGS.setVal("Dog");
        System.out.println(myGS.getVal());
    }

    public static <E> void printStuff(E[] arr) {
        for(E x : arr) System.out.println(x);
    }

    public static void printAL(ArrayList<?> aL) {
        for (Object x : aL) System.out.println(x);
    }

    static class MyGeneric<T> {
        T val;

        public void setVal(T val) {
            this.val = val;
        }

        public T getVal() {
            return val;
        }
    }


}
