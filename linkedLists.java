import java.util.Arrays;
import java.util.LinkedList;

public class linkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> lL1 = new LinkedList<Integer>();
        lL1.add(10);
        lL1.add(20);
        lL1.add(30);
        System.out.println(lL1);
        lL1.addAll(3, Arrays.asList(40,50,60,70));
        System.out.println(lL1);
        lL1.addFirst(0);
        System.out.println(lL1);
        System.out.println(lL1.indexOf(10));
        System.out.println(lL1.contains(50));
        lL1.set(4, 40);
        lL1.add(5, 45);
        System.out.println(lL1);

//        remove(index)
//        clear() deletes all

        System.out.println(lL1.size());
        Object[] arr = lL1.toArray();
        for(Object x : arr) System.out.print(x + ", ");
    }
}