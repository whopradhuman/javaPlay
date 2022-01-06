import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
//        List<Integer> tenTo1 = IntStream.range(2, 11).boxed().map(x -> 11 - x + 2 - 1).toList();
//        System.out.println(tenTo1);
        List<Integer> tenTo20 = IntStream.rangeClosed(11,20).boxed().toList();
        System.out.println(tenTo20);
        System.out.println(tenTo20.stream().filter(x -> x % 2 == 0).toList());
        List<Integer> tenTo20Pow = tenTo20.stream().map(x -> x * x).toList();
        System.out.println(tenTo20Pow);
        System.out.println(tenTo20Pow.stream().limit(5).toList());

        System.out.println(tenTo20.stream().mapToDouble(x -> x).boxed().toList());

        tenTo20.stream().forEach(System.out :: println);

        IntSummaryStatistics stats = IntStream.range(11, 21).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getSum());
        System.out.println(stats.toString());
        int[] arr = {10,20,30,40,50,60};
        System.out.println(tenTo20.stream().reduce(100,(x,y) -> x + y));
    }
}
