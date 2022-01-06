public class stBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hi, i am a string builder");

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());
        str.ensureCapacity(100);
        System.out.println(str.capacity());
        System.out.println(str.insert(2, " there"));
        System.out.println(str.replace(0,2,"hello"));
        System.out.println(str.substring(6));
        System.out.println(str);
        System.out.println(str.delete(0, 13));
    }
}