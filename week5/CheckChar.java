public class CheckChar {
    public static void main(String[] args) {
        char ch = 'B';
        if (ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + " is a upper case letter");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is a lower case letter");
        }
        else if (ch >= '0' && ch <= '9'){
            System.out.println(ch + " is a number");
        }
    }
}
