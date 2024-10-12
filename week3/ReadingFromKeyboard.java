import java.util.Scanner;

public class ReadingFromKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Byte Value: ");
        byte bytevalue = input.nextByte();
        System.out.println(bytevalue);

        System.out.print("Enter a Short Value: ");
        short shortvalue = input.nextShort();
        System.out.println(shortvalue);

        System.out.print("Enter a Float Value: ");
        float floatvalue = input.nextFloat();
        System.out.println(floatvalue);
    }
}
