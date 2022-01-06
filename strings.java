public class strings {
    public static void main(String[] args) {
        String str = "hi, i am a string";
        System.out.println(str);
        System.out.println(str.contains("string"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf("am"));
        System.out.println(str.substring(0,3));
        System.out.println("Hi".equals("hi"));
        System.out.println("Hi".equalsIgnoreCase("hi"));
        System.out.println("Hi".compareTo("Hi"));

        String added = (str+", what about you?");
        System.out.println(str.concat(", what about you?"));
        System.out.println(added);
        for(String s : added.split(", ")) {
            System.out.println(s);
        }
        added += "\nbye";
        System.out.println(added);
        System.out.println(added.replace("bye", "hello"));
        System.out.println(added + " " + 10);
//        System.out.println(added);

        add(str);
        str = str + " hello";
        System.out.println(str);
    }

    public static void add(String s) {
        s = s + " xoxo";
    }
}