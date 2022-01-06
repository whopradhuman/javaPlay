import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arrayLists {
    public static void main(String[] args) {
        // arrayLists
        ArrayList<Integer> al1 = new ArrayList<Integer>(10);
//        int i = 0;
//        while(i < 10) {
//            al1.add((i + 1) * 10);
//            i++;
//        }
        System.out.println(al1);

        al1.add(10);
        System.out.println(al1);
        al1.add(20);
        System.out.println(al1);
        al1.set(0, 5);
        System.out.println(al1);
        al1.set(0, 10);
        System.out.println(al1);
        al1.set(1, 30);
        System.out.println(al1);
        System.out.println(al1.get(1));
        al1.add(1, 20);
        System.out.println(al1);

        al1.remove(2);
        System.out.println(al1);

        al1.clear();
        System.out.println(al1);

        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        System.out.println(al2);

        Iterator i = al2.iterator();

        int count = 0;
        while (i.hasNext()) {
            System.out.println(i.next());
            if(count == 3) break;
            count++;
        }
        System.out.println();
        System.out.println(i.next());
    }
}