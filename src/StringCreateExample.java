import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringCreateExample {

    private static void stringCreateExample(){
        String s1 = "Java";
        String s2 = new String("Home");
        String s3 = new String(new char[]{'a', 'a', 's', 'd'});
        String s4 = new String(s3);
        //ASCII
        String s5 = new String(new byte[]{65,66,68});
        String s6 = new String(new byte[]{65,66,68}, StandardCharsets.UTF_16 );

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }

    public static void main(String[] args) {
        stringCreateExample();
    }
}
