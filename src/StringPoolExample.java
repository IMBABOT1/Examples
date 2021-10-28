public class StringPoolExample {

    private static void stringPoolExample(){
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = "Hel";
        String s4 = "lo";

        String s5 = s3 + s4;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s5);

        /** true*/
        System.out.println(s1 == s2);

        /** false*/
        System.out.println(s1 == s5);
    }

    public static void main(String[] args) {
        stringPoolExample();
    }
}
