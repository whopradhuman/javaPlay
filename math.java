public class math {
    public static void main(String[] args) {
        System.out.println("9 + 4 = " + (9 + 4));
        System.out.println("9 - 4 = " + (9 - 4));
        System.out.println("9 * 4 = " + (9 * 4));
        System.out.println("9 / 4 = " + (9 / 4));
        System.out.println("9 / 4 = " + (9.0 / 4));
        System.out.println("9 % 4 = " + (9 % 4));

        // increment decrement
        int a = 10;
//        a++, ++a, a = a + 1, a += 1
//        a--, --a, a = a - 1, a -= 1

        // more math

        System.out.println(Math.max(10, 6));
        System.out.println(Math.min(10, 6));
        System.out.println(Math.abs(-5.7));
        System.out.println(Math.ceil(10.4));
        System.out.println(Math.floor(10.4));
        System.out.println(Math.round(10.4));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.cbrt(1000));
        System.out.println(Math.PI);
        System.out.println(Math.sin(1.47));

        // random
        System.out.println((int)(Math.random() * 100));
    }
}