public class Lab4Task13 {
    public static void main(String[] args) {
        String hexNumber = "AB8C";
        int decimalValue = hexToDecimal(hexNumber);
        System.out.println("Hexadecimal number " + hexNumber + " is " + decimalValue + " in decimal.");
    }

    public static int hexToDecimal(String hexNumber) {
        int decimalValue = 0;
        int power = 0;
        for (int i = hexNumber.length() - 1; i >= 0; i--) {
            char hexChar = hexNumber.charAt(i);
            int hexValue;
            if (hexChar >= '0' && hexChar <= '9') {
                hexValue = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                hexValue = hexChar - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hex character: " + hexChar);
            }
            decimalValue += hexValue * Math.pow(16, power);
            power++;
        }
        return decimalValue;
    }
}
