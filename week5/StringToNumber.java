public class StringToNumber {
    public static void main(String[] args) {
        String a ="123";
        System.out.println(a+1);
        int b= Integer.parseInt(a);
        System.out.println(b+1);

        String x="123.45";
        System.out.println(x+1);
        double y= Double.parseDouble(x);
        System.out.println(y+1);

        String s= 123 +"";
        System.out.println(s+1);
    }
}
