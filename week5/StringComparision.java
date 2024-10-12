import static java.lang.System.*;

public class StringComparision {
    public static void main(String[] args) {
        String s1="Welcome to Java";
        String s2="Welcome to Java";
        String s3="Welcome to C++";
        out.println(s1.equals(s2));
        out.println(s1.equals(s3));
        out.println(s1.compareTo(s2));
        out.println(s1.compareTo(s3));
        out.println(s1.startsWith("We"));
        out.println(s1.startsWith("we"));
        System.out.println(s1.endsWith("va"));
        System.out.println(s1.endsWith("v"));
        System.out.println(s1.contains("to"));
        System.out.println(s1.contains("To"));
    }
}
