import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// inline functions as parameters
public class Lambdas {
    public static void main(String[] args) {
        ArrayList<Integer> oneTo10 = new ArrayList<>(IntStream.range(1,11).boxed().toList());
        System.out.println(oneTo10);

        oneTo10.forEach(x -> System.out.print(x * x + ", "));
        System.out.println();
        oneTo10.forEach(x -> {if(x % 2 == 0) System.out.print(x + ", ");});
        System.out.println();
        List<Integer> fib = new ArrayList<>();

        fib = Stream.iterate(new int[]{0,1}, x -> new int[]{x[1], x[0] + x[1]}).map(n -> n[0]).limit(100).toList();
        System.out.println(fib);
    }
}
